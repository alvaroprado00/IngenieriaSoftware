package view;

import server.SocketServer;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Jaime
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal(boolean identified) {
        this.identified=identified;
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

        //Pongo titulo a la ventana

        this.setTitle("Ventana principal");

        pnlPalas = new ImagePanel("/images/palas.jpg", "Pala");
        pnlOverview = new javax.swing.JScrollPane();
        txtOverview = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        pnlHeadline = new javax.swing.JPanel();
        headline = new Headline(this,identified);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }
            @Override
            public void windowClosing(WindowEvent e) {
            }
            @Override
            public void windowClosed(WindowEvent e) {
                //when disposed it calls the windowClosed event
                setActive(false);
            }
            @Override
            public void windowIconified(WindowEvent e) {
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
            }
            @Override
            public void windowActivated(WindowEvent e) {
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlPalasLayout = new javax.swing.GroupLayout(pnlPalas);
        pnlPalas.setLayout(pnlPalasLayout);
        pnlPalasLayout.setHorizontalGroup(
                pnlPalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 336, Short.MAX_VALUE)
        );
        pnlPalasLayout.setVerticalGroup(
                pnlPalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 159, Short.MAX_VALUE)
        );

        pnlOverview.setBorder(null);

        txtOverview.setEditable(false);
        txtOverview.setBackground(new java.awt.Color(240, 240, 240, 0));
        txtOverview.setColumns(20);
        txtOverview.setFont(new java.awt.Font("Cooper", 0, 12)); // NOI18N
        txtOverview.setRows(5);
        txtOverview.setText("No gastes más de lo que necesitas, nos aseguramos de \nque el dinero que estés dispuesto a invertir vaya dirigido a \nencontrar tu pala de pádel ideal. Todo ello en base a \nlas características que busques.");
        txtOverview.setBorder(null);
        pnlOverview.setViewportView(txtOverview);

        lblTitle.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Encuentra tu pala de pádel");

        javax.swing.GroupLayout pnlHeadlineLayout = new javax.swing.GroupLayout(pnlHeadline);
        pnlHeadline.setLayout(pnlHeadlineLayout);
        pnlHeadlineLayout.setHorizontalGroup(
                pnlHeadlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeadlineLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(headline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadlineLayout.setVerticalGroup(
                pnlHeadlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlHeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnlOverview, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                        .addComponent(pnlPalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlHeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlPalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        this.setIconImage(new ImagePanel("/images/icon.png", "icono de la ventana").getImageFromPanel());
        this.setLocationRelativeTo(null);
        setActive(true);
        this.setVisible(true);
    }// </editor-fold>

    private static void setActive(boolean active){
        ACTIVE =active;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(false);
            }
        });

        /* Set the server to start listening */

        SocketServer.serverStartsListening();
    }

    // Variables declaration - do not modify
    private Headline headline;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlHeadline;
    private javax.swing.JScrollPane pnlOverview;
    private javax.swing.JPanel pnlPalas;
    private javax.swing.JTextArea txtOverview;

    // End of variables declaration


    //Variables declaration(different purpose that netBeans)

    public static boolean ACTIVE;
    private boolean identified;
}

