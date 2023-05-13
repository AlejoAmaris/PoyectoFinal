package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Modelo;
import Aeropuerto.Modelo.ModeloDAO;
import Aeropuerto.Modelo.Usuario;
import Aeropuerto.Vista.EditarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EditarUsuarioControlador{
    private EditarUsuario eu = new EditarUsuario();
    private Modelo m = new Modelo(null);
    private ModeloDAO mDAO = new ModeloDAO(null);
    
    public void ejecutarEditarU(Usuario u,VentanaUsuarioControlador vu){
        eu.setTitle("Editar Informacion");
        eu.setLocationRelativeTo(null);
        eu.setVisible(true);
        eu.Nuevo.setEnabled(false);
        eu.EditarBoton.setEnabled(false);
        
        asignarVaribles(u);
        desbloquearCampos();
        ejecutarBotonEditar(u,vu);
        ejecutarBotonVolver();
    }
    
    public int verificar(){
        int op = JOptionPane.showOptionDialog(null,"¿Realmente Desea Continuar?",
                 "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                 null,new Object []{"Si","No"},"Si");
        
        return op;
    }
    public void asignarVaribles(Usuario u){
        eu.NoUsuario.setText(u.getNoUsuario());
        eu.Nombre.setText(u.getNombreU());
        eu.Telefono.setText(u.getTelefono());
        eu.Clave.setText(u.getClave());
    }
    public void desbloquearCampos(){
        eu.Cambio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                eu.Nuevo.setEnabled(true);
                eu.EditarBoton.setEnabled(true);
            }
        });
    }
    public boolean verificarUsuario(String clave){
        if(m.buscarClave(clave))
            return true;
        else
            return false;
    }
    public void ejecutarBotonEditar(Usuario u,VentanaUsuarioControlador vu){
        eu.EditarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                eu.EditarBoton.removeActionListener(this);
                
                String op = eu.Cambio.getSelectedItem().toString();
                String nuevo = eu.Nuevo.getText();
                int OP = verificar();
                
                if(OP==0){
                    if(!verificarUsuario(nuevo)){
                        mDAO.editarUsuario(u.getNoUsuario(),op,nuevo);
                        if(op.equals("Nombre"))
                            mDAO.editarNombre(u,nuevo,u.getNoUsuario());
                        
                        JOptionPane.showMessageDialog(null,"Informacion editada con Exito."
                                                      + "\nInicie Sesion Nuevamente...");
                        
                        vu.cerrarVentana();
                        VentanaPrincipalControlador vp = new VentanaPrincipalControlador();
                        vp.ejecutarVentanaP();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"ERROR, esa clave ya existe...");
                }
                
                eu.dispose();
            }
        });
    }
    public void ejecutarBotonVolver(){
        eu.VolverBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               eu.VolverBoton.removeActionListener(this);
               eu.dispose();
            } 
        });
    }
}
