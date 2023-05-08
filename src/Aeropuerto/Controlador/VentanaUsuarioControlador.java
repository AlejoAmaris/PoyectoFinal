package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Usuario;
import Aeropuerto.Vista.VentanaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;

public class VentanaUsuarioControlador{
    private VentanaPrincipalControlador vp;
    private VentanaUsuario vu = new VentanaUsuario();
    private AgregarViajesControlador av = new AgregarViajesControlador();
    private VerTodoControlador vt = new VerTodoControlador();
    private VerViajesControlador vv = new VerViajesControlador();
    
    public void ejecutarVentanaU(Usuario u){
        vu.setTitle("Informacion de Usuario");
        vu.setLocationRelativeTo(null);
        vu.setVisible(true);
        
        asignarVariables(u);
        ejecutarBotonAgregarV(u);
        ejecutarBotonVerT(u);
        ejecutarBotonVerV(u);
        ejecutarBotonSalir();
    }
    
    public int verificar(){
        int op = JOptionPane.showOptionDialog(null,"¿Realmente Desea Continuar?",
                "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,new Object[] {"Si","No"},"Si");
        
        return op;
    }
    public void asignarVariables(Usuario u){
        vu.NombreUsuario.setText(u.getNombreU());
        vu.NoRegistro.setText(u.getNoUsuario());
        vu.Telefono.setText(u.getTelefono());
        vu.Clave.setText(u.getClave());
    }
    public void ejecutarBotonAgregarV(Usuario u){
        vu.AgregarViajes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                av.ejecuarAgregarV(u);
            }
        });
    }
    public void ejecutarBotonVerT(Usuario u){
        vu.VerTodo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Todo.csv";
                File archivo = new File(nombre);
                
                if(archivo.exists())
                    vt.ejecutarVerT(u);
                else
                    JOptionPane.showMessageDialog(null,"NO ha realizado viajes");
            }
        });
    }
    public void ejecutarBotonVerV(Usuario u){
        vu.VerViajes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Viajes.csv";
                File archivo = new File(nombre);
                
                if(archivo.exists())
                    vv.ejecutarVerV(u);
                else
                    JOptionPane.showMessageDialog(null,"NO tiene viajes Pendientes");
            }
        });
    }
    public void ejecutarBotonSalir(){
        vu.SalirBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vp = new VentanaPrincipalControlador();
                int op = verificar();
                
                if(op==0){
                    vp.ejecutarVentanaP();
                    vu.dispose();
                }
            }
        });
    }
}
