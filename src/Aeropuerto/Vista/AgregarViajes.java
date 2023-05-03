package Aeropuerto.Vista;

public class AgregarViajes extends javax.swing.JFrame{
    public AgregarViajes(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTrasero = new javax.swing.JPanel();
        PanelTitulo = new javax.swing.JPanel();
        TituloTxt = new javax.swing.JLabel();
        PanelDelantero = new javax.swing.JPanel();
        NombreTxt = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        NoUsuarioTxt = new javax.swing.JLabel();
        NoUsuario = new javax.swing.JTextField();
        FechaTxt = new javax.swing.JLabel();
        NoViajeTxt = new javax.swing.JLabel();
        NoViaje = new javax.swing.JTextField();
        HoraTxt = new javax.swing.JLabel();
        Fecha = new javax.swing.JComboBox<>();
        Hora = new javax.swing.JComboBox<>();
        DestinoTxt = new javax.swing.JLabel();
        Destino = new javax.swing.JComboBox<>();
        AgregarBoton = new javax.swing.JButton();
        VolverBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTrasero.setBackground(new java.awt.Color(255, 255, 255));
        PanelTrasero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        PanelTitulo.setBackground(new java.awt.Color(204, 204, 204));

        TituloTxt.setFont(new java.awt.Font("Gulim", 3, 14)); // NOI18N
        TituloTxt.setText("Formulario para Agregar Viajes");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(TituloTxt)
                .addGap(50, 50, 50))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDelantero.setBackground(new java.awt.Color(255, 255, 255));
        PanelDelantero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        NombreTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NombreTxt.setText("Nombre Usuario");

        Nombre.setEditable(false);
        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        NoUsuarioTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NoUsuarioTxt.setText("No. Usuario");

        NoUsuario.setEditable(false);
        NoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        NoUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        FechaTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        FechaTxt.setText("Seleccione la Fecha");

        NoViajeTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NoViajeTxt.setText("No. Viaje");

        NoViaje.setEditable(false);
        NoViaje.setBackground(new java.awt.Color(255, 255, 255));
        NoViaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        HoraTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        HoraTxt.setText("Seleccione la Hora");

        Fecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10-06-2023", "30-06-2023", "15-08-2023", "31-10-2023", "31-11-2023", "15-12-2023", "30-12-2023" }));

        Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:30", "09:00", "10:00", "12:00", "14:00", "16:00", "22:00", " " }));

        DestinoTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        DestinoTxt.setText("Seleccione su Destino");

        Destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EE.UU", "Canada", "Nueva Zelanda", "China/Japon", "España", "Rusia" }));

        javax.swing.GroupLayout PanelDelanteroLayout = new javax.swing.GroupLayout(PanelDelantero);
        PanelDelantero.setLayout(PanelDelanteroLayout);
        PanelDelanteroLayout.setHorizontalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(NoUsuario)
                    .addComponent(NoViaje)
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreTxt)
                            .addComponent(NoUsuarioTxt)
                            .addComponent(FechaTxt)
                            .addComponent(NoViajeTxt)
                            .addComponent(HoraTxt)
                            .addComponent(Fecha, 0, 160, Short.MAX_VALUE)
                            .addComponent(Hora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DestinoTxt)
                            .addComponent(Destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDelanteroLayout.setVerticalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NoUsuarioTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NoViajeTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FechaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HoraTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DestinoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        AgregarBoton.setBackground(new java.awt.Color(204, 204, 204));
        AgregarBoton.setText("AGREGAR");

        VolverBoton.setBackground(new java.awt.Color(204, 204, 204));
        VolverBoton.setText("VOLVER");

        javax.swing.GroupLayout PanelTraseroLayout = new javax.swing.GroupLayout(PanelTrasero);
        PanelTrasero.setLayout(PanelTraseroLayout);
        PanelTraseroLayout.setHorizontalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PanelDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTraseroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverBoton)
                .addGap(26, 26, 26)
                .addComponent(AgregarBoton)
                .addGap(66, 66, 66))
        );
        PanelTraseroLayout.setVerticalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(PanelDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarBoton)
                    .addComponent(VolverBoton))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTrasero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTrasero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AgregarBoton;
    public javax.swing.JComboBox<String> Destino;
    private javax.swing.JLabel DestinoTxt;
    public javax.swing.JComboBox<String> Fecha;
    private javax.swing.JLabel FechaTxt;
    public javax.swing.JComboBox<String> Hora;
    private javax.swing.JLabel HoraTxt;
    public javax.swing.JTextField NoUsuario;
    private javax.swing.JLabel NoUsuarioTxt;
    public javax.swing.JTextField NoViaje;
    private javax.swing.JLabel NoViajeTxt;
    public javax.swing.JTextField Nombre;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JPanel PanelDelantero;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JPanel PanelTrasero;
    private javax.swing.JLabel TituloTxt;
    public javax.swing.JButton VolverBoton;
    // End of variables declaration//GEN-END:variables
}
