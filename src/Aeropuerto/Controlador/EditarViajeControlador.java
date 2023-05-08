package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Boleto;
import Aeropuerto.Modelo.Modelo;
import Aeropuerto.Modelo.ModeloDAO;
import Aeropuerto.Modelo.Usuario;
import Aeropuerto.Vista.EditarViaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EditarViajeControlador{
    private EditarViaje ev = new EditarViaje();
    private Modelo m = new Modelo(null);
    private ModeloDAO mDAO = new ModeloDAO(null);
    
    public void ejecutarEditarV(Usuario u,String NoViaje,String Fecha,String Hora,String Destino){
        ev.setTitle("Editar Informacion");
        ev.setLocationRelativeTo(null);
        ev.setVisible(true);
        ev.Nuevo.setEnabled(false);
        ev.EditarBoton.setEnabled(false);
        
        llenarCampos(NoViaje,Fecha,Hora,Destino);
        completarCampos();
        ejecutarBotonEditar(u,NoViaje,Fecha,Hora,Destino);
        ejecutarBotonVolver();
    }
    
    public void llenarCampos(String NoViaje,String Fecha,String Hora, String Destino){
        ev.NoViaje.setText(NoViaje);
        ev.Fecha.setText(Fecha);
        ev.Hora.setText(Hora);
        ev.Destino.setText(Destino);
    }
    public void llenarCombo(){
        String op = ev.Cambio.getSelectedItem().toString();
        ev.Nuevo.removeAllItems();
        
        switch(op){
            case "Fecha":
                ev.Nuevo.setModel(new javax.swing.DefaultComboBoxModel<>
                (new String[] {"10-06-2023",
                               "30-06-2023",
                               "15-08-2023",
                               "31-10-2023",
                               "31-11-2023",
                               "15-12-2023",
                               "30-12-2023"}));
                break;
            case "Hora":
                ev.Nuevo.setModel(new javax.swing.DefaultComboBoxModel<>
                (new String[] {"07:30",
                               "09:00",
                               "10:00",
                               "12:00",
                               "14:00",
                               "16:00",
                               "22:00"}));
                break;
            case "Destino":
                ev.Nuevo.setModel(new javax.swing.DefaultComboBoxModel<>
                (new String[] {"EE.UU",
                               "Canada",
                               "Nueva Zelanda",
                               "China/Japon",
                               "España",
                               "Rusia"}));
                break;
        }
    }
    public void completarCampos(){
        ev.Cambio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ev.EditarBoton.setEnabled(true);
                ev.Nuevo.setEnabled(true);
                llenarCombo();
            }
        });
    }
    public boolean verificarViaje(Usuario u,String Fecha,String Hora,String Destino){
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        
        if(m.verificarCSV(nombre)){
            if(m.verificarViajeCSV(nombre,Fecha,Hora,Destino))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public void editar(Usuario u,String NoViaje,String Fecha,String Hora,String Destino){
        String op = ev.Cambio.getSelectedItem().toString();
        String dato = ev.Nuevo.getSelectedItem().toString();
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        boolean band = false;
        Boleto b = null;
        
        switch(op){
            case "Fecha":
                b = new Boleto(u,NoViaje,dato,Hora,Destino);
                band = verificarViaje(u,dato,Hora,Destino);
                break;
            case "Hora":
                b = new Boleto(u,NoViaje,Fecha,dato,Destino);
                band = verificarViaje(u,Fecha,dato,Destino);
                break;
            case "Destino":
                b = new Boleto(u,NoViaje,Fecha,Hora,dato);
                band = verificarViaje(u,Fecha,Hora,dato);
                break;
        }
        
        if(!band){
            mDAO.eliminarFilaCSV(u,NoViaje);
            mDAO.insertarDatosCSV(b,nombre);
            JOptionPane.showMessageDialog(null,"Informacion editada correctamente...");
        }
        else
            JOptionPane.showMessageDialog(null,"Ya tiene asignado ese viaje...");
    }
    public void ejecutarBotonEditar(Usuario u,String NoViaje,String Fecha,String Hora,String Destino){
        ev.EditarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ev.EditarBoton.removeActionListener(this);  
                
                editar(u,NoViaje,Fecha,Hora,Destino);
                ev.dispose();
            }
        });
    }
    public void ejecutarBotonVolver(){
        ev.VolverBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ev.VolverBoton.removeActionListener(this);
                ev.dispose();
            }
        });
    }
}
