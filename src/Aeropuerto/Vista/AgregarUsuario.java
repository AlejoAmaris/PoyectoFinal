package Aeropuerto.Vista;

public class AgregarUsuario extends javax.swing.JFrame{
    public AgregarUsuario(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTrasero = new javax.swing.JPanel();
        PanelDelantero = new javax.swing.JPanel();
        PanelTitulo = new javax.swing.JPanel();
        TituloTxtx = new javax.swing.JLabel();
        AgUsuario = new javax.swing.JLabel();
        IngresarNombre = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JLabel();
        NoUsuarioTxt = new javax.swing.JLabel();
        IngresarNoUsuario = new javax.swing.JTextField();
        TelefonoTxt = new javax.swing.JLabel();
        IngresarTel = new javax.swing.JTextField();
        ClaveTxt = new javax.swing.JLabel();
        IngresarClave = new javax.swing.JTextField();
        SalirBoton = new javax.swing.JButton();
        GuardarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTrasero.setBackground(new java.awt.Color(255, 51, 51));
        PanelTrasero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        PanelDelantero.setBackground(new java.awt.Color(255, 255, 255));

        PanelTitulo.setBackground(new java.awt.Color(204, 204, 204));

        TituloTxtx.setFont(new java.awt.Font("Gulim", 3, 11)); // NOI18N
        TituloTxtx.setText("Agregar Usuario");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloTxtx)
                .addGap(84, 84, 84))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloTxtx, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aeropuerto/Imagenes/Ag. Usuario.png"))); // NOI18N

        IngresarNombre.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        IngresarNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        IngresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarNombreActionPerformed(evt);
            }
        });

        NombreTxt.setText("Nombre");

        NoUsuarioTxt.setText("No. Usuario");

        IngresarNoUsuario.setEditable(false);
        IngresarNoUsuario.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        IngresarNoUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        IngresarNoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarNoUsuarioActionPerformed(evt);
            }
        });

        TelefonoTxt.setText("Telefono");

        IngresarTel.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        IngresarTel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        IngresarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarTelActionPerformed(evt);
            }
        });

        ClaveTxt.setText("Clave");

        IngresarClave.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        IngresarClave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        IngresarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarClaveActionPerformed(evt);
            }
        });

        SalirBoton.setText("SALIR");
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotonActionPerformed(evt);
            }
        });

        GuardarBoton.setText("GUARDAR");
        GuardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDelanteroLayout = new javax.swing.GroupLayout(PanelDelantero);
        PanelDelantero.setLayout(PanelDelanteroLayout);
        PanelDelanteroLayout.setHorizontalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addComponent(NombreTxt)
                        .addGap(37, 37, 37)
                        .addComponent(IngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelDelanteroLayout.createSequentialGroup()
                            .addComponent(NoUsuarioTxt)
                            .addGap(18, 18, 18)
                            .addComponent(IngresarNoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelDelanteroLayout.createSequentialGroup()
                            .addComponent(TelefonoTxt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IngresarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDelanteroLayout.createSequentialGroup()
                            .addComponent(ClaveTxt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IngresarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDelanteroLayout.createSequentialGroup()
                            .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(GuardarBoton)
                            .addGap(16, 16, 16))))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDelanteroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AgUsuario)
                .addGap(103, 103, 103))
        );
        PanelDelanteroLayout.setVerticalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgUsuario)
                .addGap(11, 11, 11)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTxt))
                .addGap(23, 23, 23)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoUsuarioTxt)
                    .addComponent(IngresarNoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresarTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoTxt))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaveTxt)
                    .addComponent(IngresarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarBoton)
                    .addComponent(SalirBoton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTraseroLayout = new javax.swing.GroupLayout(PanelTrasero);
        PanelTrasero.setLayout(PanelTraseroLayout);
        PanelTraseroLayout.setHorizontalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PanelDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        PanelTraseroLayout.setVerticalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PanelDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void IngresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarNombreActionPerformed

    private void IngresarNoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarNoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarNoUsuarioActionPerformed

    private void IngresarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarTelActionPerformed

    private void IngresarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarClaveActionPerformed

    private void SalirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirBotonActionPerformed

    private void GuardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgUsuario;
    private javax.swing.JLabel ClaveTxt;
    public javax.swing.JButton GuardarBoton;
    public javax.swing.JTextField IngresarClave;
    public javax.swing.JTextField IngresarNoUsuario;
    public javax.swing.JTextField IngresarNombre;
    public javax.swing.JTextField IngresarTel;
    private javax.swing.JLabel NoUsuarioTxt;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JPanel PanelDelantero;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JPanel PanelTrasero;
    public javax.swing.JButton SalirBoton;
    private javax.swing.JLabel TelefonoTxt;
    private javax.swing.JLabel TituloTxtx;
    // End of variables declaration//GEN-END:variables
}
