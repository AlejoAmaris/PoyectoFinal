package Aeropuerto.Modelo;

import Aeropuerto.Controlador.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    public boolean verificarBD(){ //Verifica si hay datos en la BD
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
    public boolean buscarNoRegistro(int cont){ //Verifica los no. de Usuario
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
    public boolean buscarClave(String Clave){ //Busca una clave
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
    public boolean buscarUsuario(String NombreU,String Clave){ //Busca un usuario
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
    public Usuario asignarDatos(String Clave){ //Devuelve los datos de un usuario
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
    public boolean verificarCSV(String nombre){ //Verifica si el CSV esta vacio
        File archivo = new File(nombre);
        
        if(archivo.exists())
            return true;
        else
            return false;
    }
    
    public int verificarNoRegistroCSV(String nombre){ //Verifica los no de los CSV
        int cont = 0;
        String linea;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader(nombre));
            linea = leer.readLine();
            
            while(linea!=null){
                cont++;
                
                linea = leer.readLine();
            }
            
            leer.close();
        } 
        catch(Exception ex){
            System.out.println("ERROR al leer el Archivo CSV");
        }
        
        return cont;
    }
    public boolean verificarViajeCSV(String nombre,String fecha,String hora,String destino){ //Verifica los vajes de un usuario
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
}
