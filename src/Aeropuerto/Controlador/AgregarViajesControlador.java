package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Modelo;
import Aeropuerto.Modelo.ModeloDAO;
import Aeropuerto.Vista.AgregarViajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;

public class AgregarViajesControlador{
    private AgregarViajes av = new AgregarViajes();
    private Modelo m;
    private ModeloDAO mDAO;
    
    public void ejecuarAgregarV(Usuario u){
        av.setTitle("Agregar Viajes");
        av.setLocationRelativeTo(null);
        av.setVisible(true);
        
        asignarDatos(u);
        ejecutarBotonAgregar(u);
    }
    
    public void asignarNoViaje(Usuario u){
        m = new Modelo(null);
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        File archivo = new File(nombre);
        int noViaje = 1;
        
        if(!archivo.exists());
        else
            noViaje = m.verificarNoRegistroCSV(nombre);
        
        av.NoViaje.setText(""+noViaje);
    }
    public void asignarDatos(Usuario u){
        av.Nombre.setText(u.getNombreU());
        av.NoUsuario.setText(u.getNoUsuario());
        asignarNoViaje(u);
    }
    public void agregarDatosCSV(Usuario u){
        String noViaje = av.NoViaje.getText();
        String fecha = av.Fecha.getSelectedItem().toString();
        String hora = av.Hora.getSelectedItem().toString();
        String destino = av.Destino.getSelectedItem().toString();
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        
        Boleto b = new Boleto(u,noViaje,fecha,hora,destino);
        mDAO = new ModeloDAO(null);
        
        mDAO.insertarDatosCSV(b,nombre);
    }
    public boolean verificarViaje(Usuario u){
        String fecha = av.Fecha.getSelectedItem().toString();
        String hora = av.Hora.getSelectedItem().toString();
        String destino = av.Destino.getSelectedItem().toString();
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        
        if(m.verificarCSV(nombre)){
            if(m.verificarViajeCSV(nombre,fecha,hora,destino))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public void ejecutarBotonAgregar(Usuario u){
        av.AgregarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                av.AgregarBoton.removeActionListener(this);
                
                if(!verificarViaje(u)){
                    int noViaje = Integer.parseInt(av.NoViaje.getText());
                    
                    if(noViaje<=3){
                        agregarDatosCSV(u);
                        JOptionPane.showMessageDialog(null,"Viaje agregado con Exito...");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"NO puede tener mas de 3 Viajes Pendientes...");
                }
                else
                    JOptionPane.showMessageDialog(null,"Ya tiene asignado ese viaje...");
                
                av.dispose();
            }
        });
    }
}
