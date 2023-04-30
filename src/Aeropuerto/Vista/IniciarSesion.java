package Aeropuerto.Vista;

public class IniciarSesion extends javax.swing.JFrame{
    public IniciarSesion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        IniciarImg = new javax.swing.JLabel();
        TituloTxt = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JLabel();
        IngresarNombre = new javax.swing.JTextField();
        ClaveTxt = new javax.swing.JLabel();
        IngresarClave = new javax.swing.JTextField();
        SalirBoton = new javax.swing.JButton();
        IniciarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 0, 0));

        IniciarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aeropuerto/Imagenes/Iniciar.png"))); // NOI18N

        TituloTxt.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        TituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        TituloTxt.setText("Iniciar Sesion");

        NombreTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        NombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        NombreTxt.setText("Nombre");

        ClaveTxt.setFont(new java.awt.Font("Gulim", 0, 11)); // NOI18N
        ClaveTxt.setForeground(new java.awt.Color(255, 255, 255));
        ClaveTxt.setText("Clave");

        SalirBoton.setBackground(new java.awt.Color(255, 0, 0));
        SalirBoton.setForeground(new java.awt.Color(255, 255, 255));
        SalirBoton.setText("SALIR");
        SalirBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        IniciarBoton.setBackground(new java.awt.Color(255, 0, 0));
        IniciarBoton.setForeground(new java.awt.Color(255, 255, 255));
        IniciarBoton.setText("INICIAR");
        IniciarBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloTxt)
                .addGap(99, 99, 99))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(IniciarImg))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(ClaveTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IngresarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(NombreTxt)
                                .addGap(23, 23, 23)
                                .addComponent(IngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IniciarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ClaveTxt)
                        .addComponent(IngresarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(IniciarImg)
                        .addGap(41, 41, 41)
                        .addComponent(TituloTxt)
                        .addGap(32, 32, 32)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreTxt)
                            .addComponent(IngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)))
                .addGap(34, 34, 34)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IniciarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClaveTxt;
    public javax.swing.JTextField IngresarClave;
    public javax.swing.JTextField IngresarNombre;
    public javax.swing.JButton IniciarBoton;
    private javax.swing.JLabel IniciarImg;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JPanel Panel;
    public javax.swing.JButton SalirBoton;
    private javax.swing.JLabel TituloTxt;
    // End of variables declaration//GEN-END:variables
}
