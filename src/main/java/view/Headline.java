package view;


import model.Pala;
import supportClass.Busqueda;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Jaime
 */
public class Headline extends javax.swing.JPanel {


    /**
     * Creates new form HeadLine
     */
    public Headline(JFrame frame, boolean identified) {
        this.frame = frame;
        this.identified = identified;
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

        panelLogo = new ImagePanel("/images/icon.png", "Logo");
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        pnlLoupe = new ImagePanel("/images/loupe.png", "Lupa");
        lblContact = new javax.swing.JLabel();
        pnlUser = new ImagePanel("/images/user.png", "Palas");
        btnUpload = new javax.swing.JButton("Subir Pala");

        btnUpload.setVisible(identified);
        btnUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new JUpload(identified);
            }
        });

        pnlUser.setVisible(true);
        pnlUser.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) {

                if (!identified){
                    if(!UserValidationUI.ACTIVE) {
                        frame.dispose();
                        new UserValidationUI();
                    }
                }else{
                    frame.dispose();
                    new JExitWindow();
                }
            }
        });

        //setPreferredSize(new java.awt.Dimension(655, 53));

        panelLogo.setPreferredSize(new java.awt.Dimension(82, 50));

        panelLogo.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) {

                if(!Principal.ACTIVE) {
                    frame.dispose();
                    new Principal(identified);
                }
            }
        });

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
                panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 51, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
                panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        txtSearch.setText("Buscar pala");
        txtSearch.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                txtSearch.setText("");
            }
        });
        txtSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                    if (!FilterWindow.ACTIVE){
                        frame.dispose();
                        FilterWindow ventana = new FilterWindow(identified);
                        if(Busqueda.filtrarPalaNombre(new Pala(txtSearch.getText())).getNombre().equals("X")){
                            javax.swing.JOptionPane.showMessageDialog(ventana, "El nombre no coincide");
                        }else{
                            ventana.cargarPala(Busqueda.filtrarPalaNombre(new Pala(txtSearch.getText())));
                        }
                    }
                }
            }
        });


        pnlLoupe.setPreferredSize(new java.awt.Dimension(100, 50));
        pnlLoupe.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) {

                if (!FilterWindow.ACTIVE) {
                    frame.dispose();
                    new FilterWindow(identified);
                }

            }
        });

        javax.swing.GroupLayout pnlLoupeLayout = new javax.swing.GroupLayout(pnlLoupe);
        pnlLoupe.setLayout(pnlLoupeLayout);
        pnlLoupeLayout.setHorizontalGroup(
                pnlLoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 23, Short.MAX_VALUE)
        );
        pnlLoupeLayout.setVerticalGroup(
                pnlLoupeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
                pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlLoupe, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
                pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pnlLoupe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContact.setText("buscatupala@gmail.com");

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
                pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 61, Short.MAX_VALUE)
        );
        pnlUserLayout.setVerticalGroup(
                pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpload, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(pnlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblContact)
                                                        .addComponent(btnUpload)))
                                        .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>




    // Variables declaration - do not modify
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel lblContact;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel pnlLoupe;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JTextField txtSearch;
    private final JFrame frame;
    private final boolean identified;
    // End of variables declaration
}
