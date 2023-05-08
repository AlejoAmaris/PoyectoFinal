package Aeropuerto.Modelo;

public class Usuario{
    private String nombreU,noUsuario,telefono,clave;

    public Usuario(String nombreU,String noUsuario,String telefono,String clave){
        this.nombreU = nombreU;
        this.noUsuario = noUsuario;
        this.telefono = telefono;
        this.clave = clave;
    }

    public String getNombreU(){
        return nombreU;
    }
    public String getNoUsuario(){
        return noUsuario;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getClave(){
        return clave;
    }
}
