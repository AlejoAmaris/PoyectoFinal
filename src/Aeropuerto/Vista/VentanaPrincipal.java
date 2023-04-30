package Aeropuerto.Vista;

public class VentanaPrincipal extends javax.swing.JFrame{

    public VentanaPrincipal(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTrasero = new javax.swing.JPanel();
        Avion = new javax.swing.JLabel();
        TituloTxt = new javax.swing.JLabel();
        PanelDelantero = new javax.swing.JPanel();
        SeleccionarUsuario = new javax.swing.JComboBox<>();
        AgregarUsuarioBoton = new javax.swing.JButton();
        IniciarSesionBoton = new javax.swing.JButton();
        VerUsuariosBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTrasero.setBackground(new java.awt.Color(153, 153, 153));
        PanelTrasero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Avion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aeropuerto/Imagenes/Avion.png"))); // NOI18N

        TituloTxt.setFont(new java.awt.Font("Gulim", 3, 18)); // NOI18N
        TituloTxt.setText("Online Travel Scheduling");
        TituloTxt.setToolTipText("");

        PanelDelantero.setBackground(new java.awt.Color(0, 0, 0));
        PanelDelantero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        SeleccionarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        SeleccionarUsuario.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        SeleccionarUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Usuario", "Administrador", "Usuario" }));
        SeleccionarUsuario.setToolTipText("");
        SeleccionarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SeleccionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarUsuarioActionPerformed(evt);
            }
        });

        AgregarUsuarioBoton.setBackground(new java.awt.Color(153, 153, 153));
        AgregarUsuarioBoton.setText("Agregar Usuario");
        AgregarUsuarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuarioBotonActionPerformed(evt);
            }
        });

        IniciarSesionBoton.setBackground(new java.awt.Color(153, 153, 153));
        IniciarSesionBoton.setText("Iniciar Sesion");
        IniciarSesionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionBotonActionPerformed(evt);
            }
        });

        VerUsuariosBoton.setBackground(new java.awt.Color(153, 153, 153));
        VerUsuariosBoton.setText("Ver U. Registrados");
        VerUsuariosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerUsuariosBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDelanteroLayout = new javax.swing.GroupLayout(PanelDelantero);
        PanelDelantero.setLayout(PanelDelanteroLayout);
        PanelDelanteroLayout.setHorizontalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(SeleccionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IniciarSesionBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AgregarUsuarioBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VerUsuariosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDelanteroLayout.setVerticalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SeleccionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AgregarUsuarioBoton)
                .addGap(18, 18, 18)
                .addComponent(IniciarSesionBoton)
                .addGap(18, 18, 18)
                .addComponent(VerUsuariosBoton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTraseroLayout = new javax.swing.GroupLayout(PanelTrasero);
        PanelTrasero.setLayout(PanelTraseroLayout);
        PanelTraseroLayout.setHorizontalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(Avion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTraseroLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TituloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDelantero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        PanelTraseroLayout.setVerticalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Avion)
                .addGap(28, 28, 28)
                .addComponent(TituloTxt)
                .addGap(26, 26, 26)
                .addComponent(PanelDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTrasero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTrasero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarUsuarioActionPerformed

    private void IniciarSesionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciarSesionBotonActionPerformed

    private void AgregarUsuarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuarioBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarUsuarioBotonActionPerformed

    private void VerUsuariosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerUsuariosBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerUsuariosBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AgregarUsuarioBoton;
    private javax.swing.JLabel Avion;
    public javax.swing.JButton IniciarSesionBoton;
    private javax.swing.JPanel PanelDelantero;
    private javax.swing.JPanel PanelTrasero;
    public javax.swing.JComboBox<String> SeleccionarUsuario;
    private javax.swing.JLabel TituloTxt;
    public javax.swing.JButton VerUsuariosBoton;
    // End of variables declaration//GEN-END:variables
}
