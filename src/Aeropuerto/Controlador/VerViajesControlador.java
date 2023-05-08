package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Usuario;
import Aeropuerto.Modelo.Modelo;
import Aeropuerto.Modelo.ModeloDAO;
import Aeropuerto.Vista.VerViajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerViajesControlador{
    private EditarViajeControlador ev = new EditarViajeControlador();
    private VerViajes vv = new VerViajes();
    private Modelo m;
    private ModeloDAO mDAO;
    
    public void ejecutarVerV(Usuario u){
        vv.setTitle("Viajes Pendientes");
        vv.setLocationRelativeTo(null);
        vv.setVisible(true);
        
        agregarDatos(u);
        ejecutarBotonMarcar(u);
        ejecutarBotonCancelar(u);
        ejecutarBotonEditar(u);
        ejecutarBotonVolver();
    }
    
    public int verificar(){ //Continua con una operacion
        int op = JOptionPane.showOptionDialog(null,"¿Realmente Desea Continuar?",
                "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,new Object[] {"Si","No"},"Si");
        
        return op;
    }
    public void removerFilas(DefaultTableModel tabla){ //Limpia la Tabla
        int n = tabla.getRowCount() - 1;
        
        for(int i=n; i>=0; i--)
            tabla.removeRow(i);
    }
    public void agregarDatos(Usuario u){ //Agrega datos a la tabla
        DefaultTableModel tabla = (DefaultTableModel)(vv.Tabla.getModel());
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
        
        removerFilas(tabla);
        
        mDAO = new ModeloDAO(null);
        mDAO.insertarDatosTablaCSV(tabla,nombre);
    }
    public void marcarViaje(Usuario u){ //Marca un Viaje como realizado
        m = new Modelo(null);
        int filaS = vv.Tabla.getSelectedRow();
        
        if(filaS>=0){
            int op = verificar();
            
            if(op==0){
                String noViaje = vv.Tabla.getValueAt(filaS,2).toString();
                String fecha = vv.Tabla.getValueAt(filaS,3).toString();
                String hora = vv.Tabla.getValueAt(filaS,4).toString();
                String destino = vv.Tabla.getValueAt(filaS,5).toString();
                
                m.guardarViaje(u,noViaje,fecha,hora,destino);
                JOptionPane.showMessageDialog(null,"Viaje marcado con exito...");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Seleccione una fila...");
    }
    public void ejecutarBotonMarcar(Usuario u){ //Ejecuta el boton 1
        vv.MarcarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vv.MarcarBoton.removeActionListener(this);
                marcarViaje(u);
                
                vv.dispose();
            }
        });
    }
    public void ejecutarBotonCancelar(Usuario u){ //Ejecuta el boton 2
        vv.CancelarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vv.CancelarBoton.removeActionListener(this);
                m = new Modelo(null);
                int filaS = vv.Tabla.getSelectedRow();

                if(filaS>=0){
                    int op = verificar();

                    if(op==0){
                        String noViaje = vv.Tabla.getValueAt(filaS,2).toString();
                        
                        mDAO.eliminarFilaCSV(u,noViaje);
                        JOptionPane.showMessageDialog(null,"Viaje Cancelado con exito...");
                    }
                }
                else
                    JOptionPane.showMessageDialog(null,"Seleccione una fila...");
                
                vv.dispose();
            }
        });
    }
    public void ejecutarBotonEditar(Usuario u){ //Ejecuta el boton 3
        vv.EditarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vv.EditarBoton.removeActionListener(this);
                int filaS = vv.Tabla.getSelectedRow(); 
                
                if(filaS>=0){
                    int op = verificar();

                    if(op==0){
                        String noViaje = vv.Tabla.getValueAt(filaS,2).toString();
                        String fecha = vv.Tabla.getValueAt(filaS,3).toString();
                        String hora = vv.Tabla.getValueAt(filaS,4).toString();
                        String destino = vv.Tabla.getValueAt(filaS,5).toString();
                                
                        ev.ejecutarEditarV(u,noViaje,fecha,hora,destino);
                    }
                }
                else
                    JOptionPane.showMessageDialog(null,"Seleccione una fila...");
                
                vv.dispose();
            }
        });
    }
    public void ejecutarBotonVolver(){
        vv.VolverBoton.addActionListener(new ActionListener(){ //Ejecuta el boton 4
            @Override
            public void actionPerformed(ActionEvent e){
                int op = verificar();
                
                if(op==0)
                    vv.dispose();
            }
        });
    }
}
