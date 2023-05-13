package Aeropuerto.Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ModeloDAO{
    private Usuario u;
    public Connection c = null;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/Usuarios";
    private String nombreUsuario = "root";
    private String clave = "Alejo12345";
    
    public ModeloDAO(Usuario u){
        this.u = u;
    }
    
    //Metodos para la BD
    
    //Crea la conexion con la BD
    public void conexionBD(){ 
        try {
            Class.forName(driver);
            
           c = DriverManager.getConnection(url,nombreUsuario,clave);
        } 
        catch(Exception e){
            System.out.println("ERROR al Conectar con la BD...");
        }
    }
    
    //Inserta los usuarios a la BD
    public void insertarDatosBD(){ 
        PreparedStatement ps = null;
        
        try{
            conexionBD();
            
            ps = c.prepareStatement("INSERT INTO Registros VALUES (?,?,?,?)");
            ps.setString(1,u.getNombreU());
            ps.setString(2,u.getNoUsuario());
            ps.setString(3,u.getTelefono());
            ps.setString(4,u.getClave());
            ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    //Inserta los datos de la BD a una tabla
    public void insertarDatosTabla(DefaultTableModel tabla){ 
        Statement st = null;
        ResultSet rs = null;
        
        try{
            conexionBD();
            
            st = c.createStatement();
            rs = st.executeQuery("SELECT * FROM Registros");
                    
            while(rs.next()){
                String datos[] = new String[4];
                datos[0] = rs.getString(1); //NombreU
                datos[1] = rs.getString(2); //NoUsuario
                datos[2] = rs.getString(3); //Tel.
                datos[3] = rs.getString(4); //Clave
                
                tabla.addRow(datos);
            }
        } 
        catch(Exception e){
            System.out.println("ERROR al insertar datos en la Tabla");
        }
    }
    
    //Edita los datos de un usuario
    public void editarUsuario(String noUsuario,String columna,String dato){
        PreparedStatement ps = null;
        
        try{
            conexionBD();
            
            ps = c.prepareStatement("UPDATE Registros SET "+columna+" = ? WHERE (NoUsuario = ?)");
            ps.setString(1,dato);
            ps.setString(2,noUsuario);
            ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println("ERROR al editar datos de la BD");
        }
    }
    
    //Elimina un usuario
    public void eliminarUsuario(String nombreU,String noUsuario){ 
        PreparedStatement ps = null;
        
        try{
            conexionBD();
            
            ps = c.prepareStatement("DELETE FROM Registros WHERE (NoUsuario = ?)");
            ps.setString(1,noUsuario);
            ps.executeUpdate();
            
            eliminarRegistros(nombreU,noUsuario);
        }
        catch(Exception e){
            System.out.println("ERROR al eliminar datos de la BD");
        }
    }
    
    //---------------------------------------------------------------------------------------------------
    //Metodos para los CSV
    
    //Inserta infor. al CSV
    public void insertarDatosCSV(Boleto b,String nombre){ 
        Modelo m = new Modelo(null);
        boolean band = m.verificarCSV(nombre);
        
        try{
            BufferedWriter escrbir = new BufferedWriter(new FileWriter(nombre,true));
            
            if(!band)
                escrbir.write("Nombre Usuario ; No. Usuario ; No. Viaje ; Fecha ; Hora ; Destino\n");
            
            escrbir.write(b.mostrarBoleto()+"\n");
            escrbir.close();
        } 
        catch(IOException ex){
            System.out.println("ERROR al insertar datos en el CSV");
            Logger.getLogger(ModeloDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Inserta datos en las tablas
    public void insertarDatosTablaCSV(DefaultTableModel tabla,String nombre){ 
        String nombreU,noUsuario,noViaje,fecha,hora,destino;
        String linea;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader(nombre));
            linea = leer.readLine();
            linea = leer.readLine();
            
            while(linea!=null){
                String datos[] = linea.split(" ; ");
                nombreU = datos[0];
                noUsuario = datos[1];
                noViaje = datos[2];
                fecha = datos[3];
                hora = datos[4];
                destino = datos[5];
                
                String info[] = {nombreU,noUsuario,noViaje,fecha,hora,destino};
                tabla.addRow(info);
                
                linea = leer.readLine();
            }
            leer.close();
        } 
        catch(IOException ex){
            System.out.println("ERROR al insertar datos en la Tabla");
        }
    }
    
    //Edita el nombre de los archivos csv
    public void editarNombre(Usuario u,String nombre,String noUsuario){
        String nombreViajeAntiguo = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        String nombreTodoAntiguo = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Todo.csv";
        
        String nombreViajeNuevo = nombre+" _ "+noUsuario+" _ Viajes.csv";
        String nombreTodoNuevo = nombre+" _ "+noUsuario+" _ Todo.csv";
        
        File Viaje = new File(nombreViajeAntiguo);
        File Todo = new File(nombreTodoAntiguo);
        
        File ViajeN = new File(nombreViajeNuevo);
        File TodoN = new File(nombreTodoNuevo);
        
        if(Viaje.exists())
            Viaje.renameTo(ViajeN);
        
        if(Todo.exists())
            Todo.renameTo(TodoN);
    }
    
    //Eliminan una fila de un archivo CSV
    public ArrayList eliminarFilaCSV(Usuario u,String NoViaje){
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
            
            eliminar(u,elmt);
        } 
        catch(Exception ex){
            System.out.println("ERROR al eliminar Viaje...");
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return elmt;
    }
    public void eliminar(Usuario u,ArrayList<Boleto> b){
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        
        File archivo = new File(nombre);
        archivo.delete();
        
        for(Boleto i: b)
            insertarDatosCSV(i,nombre);
    }
    
    //Elimina los archivos CSV de un usuario
    public void eliminarRegistros(String nombreU,String noUsuario){
        String nombreViajes = nombreU+" _ "+noUsuario+" _ Viajes.csv";
        String nombreTodo = nombreU+" _ "+noUsuario+" _ Todo.csv";
        
        File Viajes = new File(nombreViajes);
        File Todo = new File(nombreTodo);
        
        if(Viajes.exists())
            Viajes.delete();
        
        if(Todo.exists())
            Todo.delete();
    }
}
