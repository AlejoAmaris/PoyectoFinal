package Aeropuerto.Controlador;

import Aeropuerto.Modelo.ModeloDAO;
import Aeropuerto.Vista.VerTodo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class VerTodoControlador{
    private VerTodo vt = new VerTodo();
    private ModeloDAO m;
    
    public void ejecutarVerT(Usuario u){
        vt.setTitle("Viajes Realizados");
        vt.setLocationRelativeTo(null);
        vt.setVisible(true);
        
        insertarDatos(u);
        ejecutarBotonVolver();
    }
    public void removerFilas(DefaultTableModel tabla){ //Limpia la Tabla
        int n = tabla.getRowCount() - 1;
        
        for(int i=n; i>=0; i--)
            tabla.removeRow(i);
    }
    public void insertarDatos(Usuario u){
        DefaultTableModel tabla = (DefaultTableModel)(vt.Tabla.getModel());
        String nombre = u.getNombreU()+" _ "+u.getNoUsuario()+" _ Todo.csv";
        
        removerFilas(tabla);
        
        m = new ModeloDAO(null);
        m.insertarDatosTablaCSV(tabla,nombre);
    }
    public void ejecutarBotonVolver(){
        vt.VolverBoton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vt.VolverBoton.removeActionListener(this);
                vt.dispose();
            }
        });
    }
}
