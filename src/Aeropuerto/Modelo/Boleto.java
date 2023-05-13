package Aeropuerto.Modelo;

import Aeropuerto.Modelo.Usuario;

public class Boleto{
    private Usuario u;
    private String noViaje,fecha,hora,destino; //Nombre,NoRegistro
    
    public Boleto(Usuario u,String noViaje,String fecha,String hora,String destino){
        this.u = u;
        this.noViaje = noViaje;
        this.fecha = fecha;
        this.hora = hora;
        this.destino = destino;
    }

    public String getNoViaje(){
        return noViaje;
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
        return u.getNombreU()+" ; "+u.getNoUsuario()+" ; "+getNoViaje()+" ; "+getFecha()+
                " ; "+getHora()+" ; "+getDestino();
    }
}
