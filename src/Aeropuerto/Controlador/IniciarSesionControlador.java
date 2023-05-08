package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Modelo;
import Aeropuerto.Vista.IniciarSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class IniciarSesionControlador{
    private String nombreU,clave;
    private Modelo m;
    private VentanaPrincipalControlador vp;
    private VentanaUsuarioControlador vu;
    private IniciarSesion is = new IniciarSesion();
    
    public void ejecutarIniciarS(){
        is.setTitle("Iniciar Sesion");
        is.setLocationRelativeTo(null);
        is.setVisible(true);
        
        ejecutarBotonIniciar();
        ejecutarBotonSalir();
    }
    
    public int verificar(){
        int op = JOptionPane.showOptionDialog(null,"¿Realmente Desea Continuar?",
                "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,new Object[] {"Si","No"},"Si");
        
        return op;
    }
    public boolean buscarUsuario(){
        m = new Modelo(null);
        nombreU = is.IngresarNombre.getText();
        clave = is.IngresarClave.getText();
        
        if(m.buscarUsuario(nombreU,clave))
            return true;
        else
            return false;
    }
    public void ejecutarBotonIniciar(){
        is.IniciarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vu = new VentanaUsuarioControlador();
                
                if(buscarUsuario()){
                    vu.ejecutarVentanaU(m.asignarDatos(clave));
                    is.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"Usuario NO encontrado...");
            }
        });
    }
    public void ejecutarBotonSalir(){
        is.SalirBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vp = new VentanaPrincipalControlador();
                int op = verificar();
                
                if(op==0){
                    vp.ejecutarVentanaP();
                    is.dispose();
                }
            }
        });
    }
}
