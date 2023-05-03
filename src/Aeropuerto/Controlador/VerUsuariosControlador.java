package Aeropuerto.Controlador;

import Aeropuerto.Modelo.ModeloDAO;
import Aeropuerto.Vista.VerUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerUsuariosControlador{
    private ModeloDAO m;
    private VentanaPrincipalControlador vp;
    private VerUsuarios vu = new VerUsuarios();
    
    public void ejecutarVerU(){
        vu.setTitle("Usuarios Registrados");
        vu.setLocationRelativeTo(null);
        vu.setVisible(true);
        
        insertarUsuarios();
        ejecutarBotonSalir();
    }
    
    public int verificar(){
        int op = JOptionPane.showOptionDialog(null,"¿Realmente Desea Continuar?",
                "Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,new Object[] {"Si","No"},"Si");
        
        return op;
    }
    public void insertarUsuarios(){
        DefaultTableModel tabla = (DefaultTableModel)(vu.Tabla.getModel());
        m = new ModeloDAO(null);
        
        m.insertarDatosTabla(tabla);
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
