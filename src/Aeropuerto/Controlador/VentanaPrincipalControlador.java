package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Modelo;
import Aeropuerto.Vista.VentanaPrincipal;
import Aeropuerto.Vista.VerUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class VentanaPrincipalControlador{
    private Modelo m;
    private VentanaPrincipal vp = new VentanaPrincipal();
    private IniciarSesionControlador is = new IniciarSesionControlador();
    private AgregarUsuariosControlador au = new AgregarUsuariosControlador();
    private VerUsuariosControlador vu = new VerUsuariosControlador();
    
    public void ejecutarVentanaP(){
        vp.setTitle("Ventana Principal");
        vp.setVisible(true);
        vp.AgregarUsuarioBoton.setEnabled(false);
        vp.IniciarSesionBoton.setEnabled(false);
        vp.VerUsuariosBoton.setEnabled(false);
        
        visualizarBotones();
        AgregarUsuariosBoton();
        IniciarSesionBoton();
        VerUsuariosBoton();
    }
    
    public void visualizarBotones(){
        vp.SeleccionarUsuario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String opcion = vp.SeleccionarUsuario.getSelectedItem().toString();
        
                if(opcion.equals("Seleccione el Usuario")){
                    vp.AgregarUsuarioBoton.setEnabled(false);
                    vp.IniciarSesionBoton.setEnabled(false);
                    vp.VerUsuariosBoton.setEnabled(false);
                }
                else if(opcion.equals("Administrador")){
                    vp.AgregarUsuarioBoton.setEnabled(false);
                    vp.IniciarSesionBoton.setEnabled(false);
                    vp.VerUsuariosBoton.setEnabled(true);
                }
                else if(opcion.equals("Usuario")){
                    vp.AgregarUsuarioBoton.setEnabled(true);
                    vp.IniciarSesionBoton.setEnabled(true);
                    vp.VerUsuariosBoton.setEnabled(false);
                }
            }
        });
    }
    public void AgregarUsuariosBoton(){
        vp.AgregarUsuarioBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                au.ejecutarAgregarU();
                vp.dispose();
            }
        });
    }
    public void IniciarSesionBoton(){
        vp.IniciarSesionBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                m = new Modelo(null);
                
                if(m.verificarBD()){
                    is.ejecutarIniciarS();
                    vp.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"No hay usuarios Registrados...");
            }
        });
    }
    public void VerUsuariosBoton(){
        vp.VerUsuariosBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                m = new Modelo(null);
                
                if(m.verificarBD()){
                    vu.ejecutarVerU();
                    vp.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"No hay usuarios Registrados...");
            }
        });
    }
}
