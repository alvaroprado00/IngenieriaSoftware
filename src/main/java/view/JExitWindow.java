package view;

/**
 *
 * @author Alvaro Prado
 */
public class JExitWindow extends javax.swing.JFrame {

    /**
     * Creates new form JExitWindow
     */
    public JExitWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblTexto = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        pnlImage = new javax.swing.JPanel();

        pnlImage= new ImagePanel("/images/candado.png", "imagen para ventana de cerrar sesion");


        lblTexto.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblTexto.setText("¿Desea cerrar la sesión?");

        btnYes.setText("SI");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setText("NO");
        btnNo.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
                pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 160, Short.MAX_VALUE)
        );
        pnlImageLayout.setVerticalGroup(
                pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblTexto))
                                .addContainerGap(199, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(lblTexto)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnYes)
                                        .addComponent(btnNo))
                                .addGap(26, 26, 26))
        );

        pack();
        this.setTitle("Cerrar sesion");
        this.setIconImage(new ImagePanel("/images/icon.png", "icono de la ventana").getImageFromPanel());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {
        //Volvemos a la principal con falso
        this.dispose();
        new Principal(false);
    }

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt){
        //Ya esta identificado el usuario
        this.dispose();
        new Principal(true);
    }



    // Variables declaration - do not modify
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JPanel pnlImage;
    // End of variables declaration
}
