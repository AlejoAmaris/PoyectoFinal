package Aeropuerto.Modelo;

import Aeropuerto.Controlador.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Modelo{
    private Usuario u;
    private ModeloDAO m;

    public Modelo(Usuario u){
        this.u = u;
        m = new ModeloDAO(u);
    }
    
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
}
