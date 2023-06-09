package Aeropuerto.Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo{
    private Usuario u;
    private ModeloDAO m;
    
    public Modelo(Usuario u){
        this.u = u;
        m = new ModeloDAO(u);
    }
    
    //Metodos para la BD
    
    //Verifica si hay datos en la BD
    public boolean verificarBD(){ 
        Statement st = null;
        ResultSet rs = null;
        boolean band = false;
        
        try{
            m.conexionBD();
            st = m.c.createStatement();
            rs = st.executeQuery("SELECT * FROM Registros");
            
            if(rs.next())
                return true;
            else
                return false;
        } 
        catch(Exception e){
            System.out.println("ERROR al verificar la BD");
        }
        
        return band;
    }
    
    //Verifica los no. de Usuario
    public boolean buscarNoRegistro(int cont){ 
        Statement st = null;
        ResultSet rs = null;
        boolean band = false;
        
        try{
            m.conexionBD();
            st = m.c.createStatement();
            rs = st.executeQuery("SELECT * FROM Registros");
            
            while(rs.next()){
                int noUsuario = Integer.parseInt(rs.getString(2));
                
                if(noUsuario==cont){
                    band = true;
                    break;
                }
            }
        } 
        catch(Exception e){
            System.out.println("ERROR al buscar en la BD");
        }
        
        return band;
    }
    
    //Busca una clave
    public boolean buscarClave(String Clave){ 
        Statement st = null;
        ResultSet rs = null;
        boolean band = false;
        
        try{
            m.conexionBD();
            st = m.c.createStatement();
            rs = st.executeQuery("SELECT * FROM Registros");
            
            while(rs.next()){
                String clave = rs.getString(4);
                
                if(clave.equals(Clave)){
                    band = true;
                    break;
                }
            }
        } 
        catch(Exception e){
            System.out.println("ERROR al buscar en la BD");
        }
        
        return band;
    }
    
    //Busca un usuario
    public boolean buscarUsuario(String NombreU,String Clave){ 
        Statement st = null;
        ResultSet rs = null;
        boolean band = false;
        
        try{
            m.conexionBD();
            st = m.c.createStatement();
            rs = st.executeQuery("SELECT * FROM Registros");
            
            while(rs.next()){
                String nombreU = rs.getString(1);
                String clave = rs.getString(4);
                
                if(nombreU.equals(NombreU) && clave.equals(Clave)){
                    band = true;
                    break;
                }
            }
        } 
        catch(Exception e){
            System.out.println("ERROR al buscar en la BD");
        }
        
        return band;
    }
    
    //Devuelve los datos de un usuario
    public Usuario asignarDatos(String Clave){ 
        String nombreU = null,noUsuario = null,telefono = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            m.conexionBD();
            ps = m.c.prepareStatement("SELECT * FROM Registros WHERE (Clave = ?)");
            ps.setString(1,Clave);
            rs = ps.executeQuery();
            
            while(rs.next()){
                nombreU = rs.getString(1);
                noUsuario = rs.getString(2);
                telefono = rs.getString(3);
            }
        } 
        catch(Exception e){
            System.out.println("ERROR al asignar datos de la BD");
        }
        
        Usuario U = new Usuario(nombreU,noUsuario,telefono,Clave);
        return U;
    }
    
    //---------------------------------------------------------------------------------------------------
    //Metodos para los CSV
    
    //Verifica si el CSV esta vacio
    public boolean verificarCSV(String nombre){ 
        File archivo = new File(nombre);
        
        if(archivo.exists())
            return true;
        else
            return false;
    }
    
    //Verifica los no. de los CSV
    public boolean verificarNoRegistroCSV(String nombre,int cont){ 
        String linea;
        boolean band = false;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader(nombre));
            linea = leer.readLine();
            linea = leer.readLine();
            
            while(linea!=null){
                String datos[] = linea.split(" ; ");
                int noViaje = Integer.parseInt(datos[2]);
                
                if(noViaje==cont){
                    band = true;
                    break;
                }
                
                linea = leer.readLine();
            }
            leer.close();
        } 
        catch(Exception ex){
            System.out.println("ERROR al leer el Archivo CSV");
        }
        
        return band;
    }
    
    //Verifica los viajes de un usuario
    public boolean verificarViajeCSV(String nombre,String fecha,String hora,String destino){ 
        boolean band = false;
        String linea;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader(nombre));
            linea = leer.readLine();
            
            while(linea!=null){
                String datos[] = linea.split(" ; ");
                String Fecha = datos[3];
                String Hora = datos[4];
                String Destino = datos[5];
                
                if(Fecha.equals(fecha) && Hora.equals(hora) && Destino.equals(destino)){
                    band = true;
                    break;
                }
                
                linea = leer.readLine();
            }
            leer.close();
        } 
        catch(Exception ex){
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return band;
    }
    
    //Marca un viaje como "realizado"
    public ArrayList guardarViaje(Usuario u,String NoViaje,String Fecha,String Hora,String Destino){ 
        String noViaje,fecha,hora,destino;
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        String linea;
        ArrayList<Boleto> elmt = new ArrayList<>();
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader(nombre));
            linea = leer.readLine();
            linea = leer.readLine();
            
            while(linea!=null){
                String datos[] = linea.split(" ; ");
                noViaje = datos[2];
                fecha = datos[3];
                hora = datos[4];
                destino = datos[5];
                
                if(noViaje.equals(NoViaje));
                else{
                    Boleto b = new Boleto(u,noViaje,fecha,hora,destino);
                    elmt.add(b);
                }
                
                linea = leer.readLine();
            }
            leer.close();
            
            marcarViaje(u,elmt,NoViaje,Fecha,Hora,Destino);
        } 
        catch(Exception ex){
            System.out.println("ERROR al marcar Viaje...");
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return elmt;
    }
    public void marcarViaje(Usuario u,ArrayList<Boleto> b,String NoViaje,String Fecha,String Hora,String Destino){ //Crea los viajes realizados
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Todo.csv";
        String nombreA = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        Boleto B = new Boleto(u,NoViaje,Fecha,Hora,Destino);
        
        File archivo = new File(nombreA);
        archivo.delete();
        
        for(Boleto i: b)
            m.insertarDatosCSV(i,nombreA);
        
        m.insertarDatosCSV(B,nombre);
    }
}
