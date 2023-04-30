package Aeropuerto.Controlador;

public class Boleto{
    private Usuario u;
    private String fecha,hora,destino; //Nombre,NoRegistro

    public Boleto(Usuario u,String fecha,String hora,String destino){
        this.u = u;
        this.fecha = fecha;
        this.hora = hora;
        this.destino = destino;
    }

    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public String getDestino(){
        return destino;
    }
    public String mostrarBoleto(){
        return "Nombre Usuario: "+u.getNombreU()+" ; "+"No. Usuario: "+u.getNoUsuario()+" ; "+
                "Fecha: "+getFecha()+" ; "+"Hora: "+getHora()+" ; "+"Destino: "+getDestino();
    }
}
