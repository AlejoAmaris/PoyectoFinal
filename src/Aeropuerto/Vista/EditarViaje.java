package Aeropuerto.Vista;

public class EditarViaje extends javax.swing.JFrame{
    public EditarViaje(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDelantero = new javax.swing.JPanel();
        TituloTxt = new javax.swing.JLabel();
        NoViajeTxt = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        NoViaje = new javax.swing.JTextField();
        FechaTxt = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        HoraTxt = new javax.swing.JLabel();
        Hora = new javax.swing.JTextField();
        DestinoTxt = new javax.swing.JLabel();
        Destino = new javax.swing.JTextField();
        Separador2 = new javax.swing.JSeparator();
        Cambio = new javax.swing.JComboBox<>();
        Pregunta2Txt = new javax.swing.JLabel();
        VolverBoton = new javax.swing.JButton();
        EditarBoton = new javax.swing.JButton();
        Pregunta1Txt = new javax.swing.JLabel();
        Nuevo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDelantero.setBackground(new java.awt.Color(153, 153, 153));
        PanelDelantero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TituloTxt.setFont(new java.awt.Font("Gulim", 3, 12)); // NOI18N
        TituloTxt.setText("Editar la Informacion de un Viaje");

        NoViajeTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NoViajeTxt.setText("No. Viaje:");

        NoViaje.setEditable(false);
        NoViaje.setBackground(new java.awt.Color(153, 153, 153));
        NoViaje.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NoViaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        NoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoViajeActionPerformed(evt);
            }
        });

        FechaTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        FechaTxt.setText("Fecha:");

        Fecha.setEditable(false);
        Fecha.setBackground(new java.awt.Color(153, 153, 153));
        Fecha.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaActionPerformed(evt);
            }
        });

        HoraTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        HoraTxt.setText("Hora:");

        Hora.setEditable(false);
        Hora.setBackground(new java.awt.Color(153, 153, 153));
        Hora.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Hora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraActionPerformed(evt);
            }
        });

        DestinoTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        DestinoTxt.setText("Destino:");

        Destino.setEditable(false);
        Destino.setBackground(new java.awt.Color(153, 153, 153));
        Destino.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Destino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinoActionPerformed(evt);
            }
        });

        Cambio.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Cambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Fecha", "Hora", "Destino" }));
        Cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioActionPerformed(evt);
            }
        });

        Pregunta2Txt.setText("Seleccione el Nuevo Dato");

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

        Pregunta1Txt.setText("¿Que Desea Cambiar?");

        Nuevo.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDelanteroLayout = new javax.swing.GroupLayout(PanelDelantero);
        PanelDelantero.setLayout(PanelDelanteroLayout);
        PanelDelanteroLayout.setHorizontalGroup(
            PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDelanteroLayout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoViajeTxt)
                            .addComponent(FechaTxt)
                            .addComponent(HoraTxt)
                            .addComponent(DestinoTxt))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
            .addGroup(PanelDelanteroLayout.createSequentialGroup()
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDelanteroLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(TituloTxt))
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
                            .addComponent(Nuevo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(NoViajeTxt)
                    .addComponent(NoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaTxt)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraTxt)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinoTxt)
                    .addComponent(Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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

    private void NoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoViajeActionPerformed

    private void FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaActionPerformed

    private void HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraActionPerformed

    private void DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinoActionPerformed

    private void CambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CambioActionPerformed

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolverBotonActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Cambio;
    public javax.swing.JTextField Destino;
    private javax.swing.JLabel DestinoTxt;
    public javax.swing.JButton EditarBoton;
    public javax.swing.JTextField Fecha;
    private javax.swing.JLabel FechaTxt;
    public javax.swing.JTextField Hora;
    private javax.swing.JLabel HoraTxt;
    public javax.swing.JTextField NoViaje;
    private javax.swing.JLabel NoViajeTxt;
    public javax.swing.JComboBox<String> Nuevo;
    private javax.swing.JPanel PanelDelantero;
    private javax.swing.JLabel Pregunta1Txt;
    private javax.swing.JLabel Pregunta2Txt;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel TituloTxt;
    public javax.swing.JButton VolverBoton;
    // End of variables declaration//GEN-END:variables
}
