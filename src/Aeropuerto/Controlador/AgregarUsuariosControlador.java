package Aeropuerto.Controlador;

import Aeropuerto.Modelo.Usuario;
import Aeropuerto.Modelo.Modelo;
import Aeropuerto.Modelo.ModeloDAO;
import Aeropuerto.Vista.AgregarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AgregarUsuariosControlador{
    private Usuario u;
    private ModeloDAO mdao;
    private Modelo m;
    private VentanaPrincipalControlador vp;
    private AgregarUsuario au = new AgregarUsuario();
    
    public void ejecutarAgregarU(){
        au.setTitle("Agregar Usuarios");
        au.setVisible(true);
        au.setLocationRelativeTo(null);
        
        asignarNoUsuario();
        ejecutarBotonGuardar();
        ejecutarBotonSalir();
    }
    
    public void asignarNoUsuario(){
        m = new Modelo(null);
        int cont = 1;
        
        while(m.buscarNoRegistro(cont))
            cont++;
        
        au.IngresarNoUsuario.setText(""+cont);
    }
    public void asignarDatos(){
        String nombre = au.IngresarNombre.getText();
        String noUsuario = au.IngresarNoUsuario.getText();
        String telefono = au.IngresarTel.getText();
        String clave = au.IngresarClave.getText();
        
        u = new Usuario(nombre,noUsuario,telefono,clave);
        m = new Modelo(u);
        mdao = new ModeloDAO(u);
    }
    public boolean verificarClave(String clave,Modelo m){
        if(m.buscarClave(clave))
            return true;
        else
            return false;
    }
    public int verificar(){
        int op = JOptionPane.showOptionDialog(null,"¿Realmente Desea Continuar?",
                 "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                 null,new Object []{"Si","No"},"Si");
        
        return op;
    }
    public void ejecutarBotonGuardar(){
        au.GuardarBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vp = new VentanaPrincipalControlador();
                asignarDatos();
                
                if(!verificarClave(u.getClave(),m)){
                    int op = verificar();
                    
                    if(op==0){
                        mdao.insertarDatosBD();

                        JOptionPane.showMessageDialog(null,"Usuario Registrado con Exito...");
                        vp.ejecutarVentanaP();
                        au.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Operacion Cancelada...");
                }
                else
                    JOptionPane.showMessageDialog(null,"ERROR, esa clave ya existe...");
            }
        });
    }
    public void ejecutarBotonSalir(){
        au.SalirBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vp = new VentanaPrincipalControlador();
                int op = verificar();
                
                if(op==0){
                    vp.ejecutarVentanaP();
                    au.dispose();
                }
            }
        });
    }
}
