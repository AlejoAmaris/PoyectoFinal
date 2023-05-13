package Aeropuerto.Vista;

public class EditarUsuario extends javax.swing.JFrame{
    public EditarUsuario(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDelantero = new javax.swing.JPanel();
        TituloTxt = new javax.swing.JLabel();
        NoUsuarioTxt = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        NoUsuario = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        TelefonoTxt = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        ClaveTxt = new javax.swing.JLabel();
        Clave = new javax.swing.JTextField();
        Separador2 = new javax.swing.JSeparator();
        Cambio = new javax.swing.JComboBox<>();
        Pregunta2Txt = new javax.swing.JLabel();
        VolverBoton = new javax.swing.JButton();
        EditarBoton = new javax.swing.JButton();
        Pregunta1Txt = new javax.swing.JLabel();
        Nuevo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDelantero.setBackground(new java.awt.Color(153, 153, 153));
        PanelDelantero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TituloTxt.setFont(new java.awt.Font("Gulim", 3, 12)); // NOI18N
        TituloTxt.setText("Editar la Informacion de Usuario");

        NoUsuarioTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NoUsuarioTxt.setText("No Usuario:");

        NoUsuario.setEditable(false);
        NoUsuario.setBackground(new java.awt.Color(153, 153, 153));
        NoUsuario.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        NoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoUsuarioActionPerformed(evt);
            }
        });

        NombreTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NombreTxt.setText("Nombre:");

        Nombre.setEditable(false);
        Nombre.setBackground(new java.awt.Color(153, 153, 153));
        Nombre.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        TelefonoTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        TelefonoTxt.setText("Telefono;");

        Telefono.setEditable(false);
        Telefono.setBackground(new java.awt.Color(153, 153, 153));
        Telefono.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        ClaveTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        ClaveTxt.setText("Clave:");

        Clave.setEditable(false);
        Clave.setBackground(new java.awt.Color(153, 153, 153));
        Clave.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Clave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveActionPerformed(evt);
            }
        });

        Cambio.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Cambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Nombre", "Telefono", "Clave" }));
        Cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioActionPerformed(evt);
            }
        });

        Pregunta2Txt.setText("Digite la nueva informacion");

        VolverBoton.setBackground(new java.awt.Color(0, 0, 0));
        VolverBoton.setForeground(new java.awt.Color(255, 255, 255));
        VolverBoton.setText("VOLVER");
        VolverBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        VolverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBotonActionPerformed(evt);
            }
        });

        EditarBoton.setBackground(new java.awt.Color(0, 0, 0));
        EditarBoton.setForeground(new java.awt.Color(255, 255, 255));
        EditarBoton.setText("EDITAR");
        EditarBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        EditarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBotonActionPerformed(evt);
            }
        });

        Pregunta1Txt.setText("¿Que Desea Cambiar?");

        javax.swing.GroupLayout PanelDelanteroLayout = new javax.swing.GroupLayout(PanelDelantero);
        PanelDelantero.setLayout(PanelDelanteroLayout);
        PanelDelanteroLayout.setHorizontalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDelanteroLayout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoUsuarioTxt)
                            .addComponent(NombreTxt)
                            .addComponent(TelefonoTxt)
                            .addComponent(ClaveTxt))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TituloTxt)))
                .addGap(42, 42, 42))
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pregunta1Txt)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDelanteroLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(VolverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addComponent(Pregunta2Txt)
                    .addComponent(Cambio, 0, 190, Short.MAX_VALUE)
                    .addComponent(Nuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDelanteroLayout.setVerticalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(TituloTxt)
                .addGap(18, 18, 18)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoUsuarioTxt)
                    .addComponent(NoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTxt)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoTxt)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaveTxt)
                    .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(Pregunta1Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(Pregunta2Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDelantero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDelantero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoUsuarioActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClaveActionPerformed

    private void CambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CambioActionPerformed

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolverBotonActionPerformed

    private void EditarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Cambio;
    public javax.swing.JTextField Clave;
    private javax.swing.JLabel ClaveTxt;
    public javax.swing.JButton EditarBoton;
    public javax.swing.JTextField NoUsuario;
    private javax.swing.JLabel NoUsuarioTxt;
    public javax.swing.JTextField Nombre;
    private javax.swing.JLabel NombreTxt;
    public javax.swing.JTextField Nuevo;
    private javax.swing.JPanel PanelDelantero;
    private javax.swing.JLabel Pregunta1Txt;
    private javax.swing.JLabel Pregunta2Txt;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    public javax.swing.JTextField Telefono;
    private javax.swing.JLabel TelefonoTxt;
    private javax.swing.JLabel TituloTxt;
    public javax.swing.JButton VolverBoton;
    // End of variables declaration//GEN-END:variables
}
