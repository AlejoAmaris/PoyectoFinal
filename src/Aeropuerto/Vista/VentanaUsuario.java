package Aeropuerto.Vista;

public class VentanaUsuario extends javax.swing.JFrame{
    public VentanaUsuario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTrasero = new javax.swing.JPanel();
        NombreTxt = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JTextField();
        NoRegistroTxt = new javax.swing.JLabel();
        ClaveTxt = new javax.swing.JLabel();
        NoRegistro = new javax.swing.JTextField();
        Separador = new javax.swing.JSeparator();
        SalirBoton = new javax.swing.JButton();
        TelefonoTxt = new javax.swing.JLabel();
        Clave = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        BarraMenu = new javax.swing.JMenuBar();
        OpcionesTxt = new javax.swing.JMenu();
        AgregarViajes = new javax.swing.JMenuItem();
        VerTodo = new javax.swing.JMenuItem();
        VerViajes = new javax.swing.JMenuItem();
        EditarInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTrasero.setBackground(new java.awt.Color(0, 51, 204));

        NombreTxt.setBackground(new java.awt.Color(0, 0, 0));
        NombreTxt.setFont(new java.awt.Font("Gulim", 3, 18)); // NOI18N
        NombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        NombreTxt.setText("Bienvenido/a");

        NombreUsuario.setEditable(false);
        NombreUsuario.setBackground(new java.awt.Color(0, 51, 204));
        NombreUsuario.setFont(new java.awt.Font("Gulim", 3, 18)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuario.setBorder(null);
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });

        NoRegistroTxt.setFont(new java.awt.Font("Gulim", 0, 14)); // NOI18N
        NoRegistroTxt.setForeground(new java.awt.Color(255, 255, 255));
        NoRegistroTxt.setText("No. Usuario:");

        ClaveTxt.setFont(new java.awt.Font("Gulim", 0, 14)); // NOI18N
        ClaveTxt.setForeground(new java.awt.Color(255, 255, 255));
        ClaveTxt.setText("Clave:");

        NoRegistro.setEditable(false);
        NoRegistro.setBackground(new java.awt.Color(0, 51, 204));
        NoRegistro.setFont(new java.awt.Font("Gulim", 0, 14)); // NOI18N
        NoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        NoRegistro.setBorder(null);
        NoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoRegistroActionPerformed(evt);
            }
        });

        Separador.setBackground(new java.awt.Color(0, 0, 0));
        Separador.setForeground(new java.awt.Color(0, 0, 0));

        SalirBoton.setBackground(new java.awt.Color(0, 0, 0));
        SalirBoton.setFont(new java.awt.Font("Gulim", 0, 12)); // NOI18N
        SalirBoton.setForeground(new java.awt.Color(255, 255, 255));
        SalirBoton.setText("SALIR");
        SalirBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotonActionPerformed(evt);
            }
        });

        TelefonoTxt.setFont(new java.awt.Font("Gulim", 0, 14)); // NOI18N
        TelefonoTxt.setForeground(new java.awt.Color(255, 255, 255));
        TelefonoTxt.setText("Telefono");

        Clave.setEditable(false);
        Clave.setBackground(new java.awt.Color(0, 51, 204));
        Clave.setFont(new java.awt.Font("Gulim", 0, 14)); // NOI18N
        Clave.setForeground(new java.awt.Color(255, 255, 255));
        Clave.setBorder(null);
        Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveActionPerformed(evt);
            }
        });

        Telefono.setEditable(false);
        Telefono.setBackground(new java.awt.Color(0, 51, 204));
        Telefono.setFont(new java.awt.Font("Gulim", 0, 14)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        Telefono.setBorder(null);
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTraseroLayout = new javax.swing.GroupLayout(PanelTrasero);
        PanelTrasero.setLayout(PanelTraseroLayout);
        PanelTraseroLayout.setHorizontalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separador)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTraseroLayout.createSequentialGroup()
                        .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTxt)
                            .addComponent(NoRegistroTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(NoRegistro)))
                    .addGroup(PanelTraseroLayout.createSequentialGroup()
                        .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClaveTxt)
                            .addComponent(TelefonoTxt))
                        .addGap(79, 79, 79)
                        .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTraseroLayout.createSequentialGroup()
                                .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Telefono)
                            .addComponent(Clave))))
                .addContainerGap())
        );
        PanelTraseroLayout.setVerticalGroup(
            PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraseroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTxt))
                .addGap(18, 18, 18)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoRegistroTxt)
                    .addComponent(NoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoTxt)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelTraseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaveTxt)
                    .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        BarraMenu.setBackground(new java.awt.Color(255, 255, 255));
        BarraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BarraMenu.setBorderPainted(false);

        OpcionesTxt.setText("Opciones");
        OpcionesTxt.setFont(new java.awt.Font("Gulim", 0, 12)); // NOI18N

        AgregarViajes.setFont(new java.awt.Font("Gulim", 0, 12)); // NOI18N
        AgregarViajes.setText("Agregar Viajes");
        AgregarViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarViajesActionPerformed(evt);
            }
        });
        OpcionesTxt.add(AgregarViajes);

        VerTodo.setFont(new java.awt.Font("Gulim", 0, 12)); // NOI18N
        VerTodo.setText("Ver Viajes Realizados");
        VerTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTodoActionPerformed(evt);
            }
        });
        OpcionesTxt.add(VerTodo);

        VerViajes.setFont(new java.awt.Font("Gulim", 0, 12)); // NOI18N
        VerViajes.setText("Ver Viajes Pendientes");
        VerViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerViajesActionPerformed(evt);
            }
        });
        OpcionesTxt.add(VerViajes);

        EditarInfo.setFont(new java.awt.Font("Gulim", 0, 12)); // NOI18N
        EditarInfo.setText("Editar Informacion");
        OpcionesTxt.add(EditarInfo);

        BarraMenu.add(OpcionesTxt);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTrasero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTrasero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarViajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarViajesActionPerformed

    private void VerTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerTodoActionPerformed

    private void VerViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerViajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerViajesActionPerformed

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void NoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoRegistroActionPerformed

    private void SalirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirBotonActionPerformed

    private void ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClaveActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem AgregarViajes;
    private javax.swing.JMenuBar BarraMenu;
    public javax.swing.JTextField Clave;
    private javax.swing.JLabel ClaveTxt;
    public javax.swing.JMenuItem EditarInfo;
    public javax.swing.JTextField NoRegistro;
    private javax.swing.JLabel NoRegistroTxt;
    private javax.swing.JLabel NombreTxt;
    public javax.swing.JTextField NombreUsuario;
    private javax.swing.JMenu OpcionesTxt;
    private javax.swing.JPanel PanelTrasero;
    public javax.swing.JButton SalirBoton;
    private javax.swing.JSeparator Separador;
    public javax.swing.JTextField Telefono;
    private javax.swing.JLabel TelefonoTxt;
    public javax.swing.JMenuItem VerTodo;
    public javax.swing.JMenuItem VerViajes;
    // End of variables declaration//GEN-END:variables
}
