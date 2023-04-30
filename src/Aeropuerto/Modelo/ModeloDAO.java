package Aeropuerto.Modelo;

import Aeropuerto.Controlador.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
    
    public void conexionBD(){
        try {
            Class.forName(driver);
            
           c = DriverManager.getConnection(url,nombreUsuario,clave);
        } 
        catch(Exception e){
            System.out.println("ERROR al Conectar con la BD...");
        }
    }
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
            System.out.println("ERROR en Insertar Datos en la BD...");
        }
    }
    
}
