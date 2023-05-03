package Aeropuerto.Modelo;

import Aeropuerto.Controlador.Boleto;
import Aeropuerto.Controlador.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    public void conexionBD(){ //Crea la conexion con la BD
        try {
            Class.forName(driver);
            
           c = DriverManager.getConnection(url,nombreUsuario,clave);
        } 
        catch(Exception e){
            System.out.println("ERROR al Conectar con la BD...");
        }
    }
    public void insertarDatosBD(){ //Inserta los usuarios a la BD
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
    public void insertarDatosTabla(DefaultTableModel tabla){ //Inserta los datos de la BD a una tabla
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
    
    //---------------------------------------------------------------------------------------------------
    //Metodos para los CSV
    public void insertarDatosCSV(Boleto b,String nombre){ //Inserta infor. al CSV
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
    
}
