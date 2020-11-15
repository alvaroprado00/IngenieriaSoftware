/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import client.Client;
import model.Pala;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 *
 * @author Nacho
 */
public class JUpload extends javax.swing.JFrame {

    /** Creates new form JUpload */
    public JUpload(boolean identified) {
        this.identified=identified;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblForma = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        lblControl = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        lblManejabilidad = new javax.swing.JLabel();
        lblPuntoDulce = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblFotoElegida = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        comboForma = new javax.swing.JComboBox<>();
        sldSalida = new javax.swing.JSlider();
        sldPotencia = new javax.swing.JSlider();
        sldControl = new javax.swing.JSlider();
        sldPuntoDulce = new javax.swing.JSlider();
        sldManejabilidad = new javax.swing.JSlider();
        txtPrecio = new javax.swing.JTextField();
        btnSubir = new javax.swing.JButton();
        txtPotencia = new javax.swing.JTextField();
        txtControl = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        txtManejabilidad = new javax.swing.JTextField();
        txtPuntoDulce = new javax.swing.JTextField();
        btnFin = new javax.swing.JButton();


        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Rockwell", 1, 18));
        lblTitulo.setText("RELLENA LOS DATOS");

        lblNombre.setText("NOMBRE:");

        lblForma.setText("FORMA:");

        lblPotencia.setText("POTENCIA:");

        lblControl.setText("CONTROL:");

        lblSalida.setText("SALIDA DE BOLA:");

        lblManejabilidad.setText("MANEJABILIDAD:");

        lblPuntoDulce.setText("PUNTO DULCE:");

        lblPrecio.setText("PRECIO:");

        lblFoto.setText("FOTO:");

        comboForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Redonda", "Lagrima", "Diamante" }));

        sldPotencia.setPaintLabels(true);

        btnSubir.setText("Examinar");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                new Principal(identified);
            }
            @Override
            public void windowClosed(WindowEvent e) {

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

        txtPotencia.setText("50");


        txtControl.setText("50");


        txtSalida.setText("50");


        txtManejabilidad.setText("50");


        txtPuntoDulce.setText("50");


        btnFin.setText("Subir");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });

        sldPotencia.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sldPotencia.getValueIsAdjusting()){
                    txtPotencia.setText(String.valueOf(sldPotencia.getValue()));
                }

            }
        });

        sldControl.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sldControl.getValueIsAdjusting()){
                    txtControl.setText(String.valueOf(sldControl.getValue()));
                }

            }
        });

        sldSalida.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sldSalida.getValueIsAdjusting()){
                    txtSalida.setText(String.valueOf(sldSalida.getValue()));
                }

            }
        });

        sldPuntoDulce.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sldPuntoDulce.getValueIsAdjusting()){
                    txtPuntoDulce.setText(String.valueOf(sldPuntoDulce.getValue()));
                }

            }
        });

        sldManejabilidad.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sldManejabilidad.getValueIsAdjusting()){
                    txtManejabilidad.setText(String.valueOf(sldManejabilidad.getValue()));
                }

            }
        });

        txtPotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(txtPotencia.getText())>=0 && Integer.parseInt(txtPotencia.getText())<101){
                        sldPotencia.setValue(Integer.parseInt(txtPotencia.getText()));
                    }
                } catch (NumberFormatException ex) {
                }
            }
        });

        txtControl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(txtControl.getText())>=0 && Integer.parseInt(txtControl.getText())<101){
                        sldControl.setValue(Integer.parseInt(txtControl.getText()));
                    }
                } catch (NumberFormatException ex) {
                }
            }
        });

        txtSalida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(txtSalida.getText())>=0 && Integer.parseInt(txtSalida.getText())<101)
                        sldSalida.setValue(Integer.parseInt(txtSalida.getText()));
                } catch (NumberFormatException ex) {
                }
            }
        });

        txtManejabilidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(txtManejabilidad.getText())>=0 && Integer.parseInt(txtManejabilidad.getText())<101)
                        sldManejabilidad.setValue(Integer.parseInt(txtManejabilidad.getText()));
                } catch (NumberFormatException ex) {
                }
            }
        });

        txtPuntoDulce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(txtPuntoDulce.getText())>=0 && Integer.parseInt(txtPuntoDulce.getText())<101)
                        sldPuntoDulce.setValue(Integer.parseInt(txtPuntoDulce.getText()));
                } catch (NumberFormatException ex) {
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblForma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(comboForma, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(69, 69, 69))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblManejabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(sldManejabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblPuntoDulce)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(sldPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(45, 45, 45))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(sldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblControl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(sldControl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(txtManejabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblSalida)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(59, 59, 59)
                                                                .addComponent(sldSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(45, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnFin)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblFotoElegida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnSubir)
                                                                .addGap(102, 102, 102))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(82, 82, 82))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtControl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(278, 278, 278))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(lblTitulo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblForma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(comboForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(sldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblControl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(sldControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sldSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(sldManejabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblManejabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtManejabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(sldPuntoDulce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSubir)
                                        .addComponent(lblFotoElegida))
                                .addGap(18, 18, 18)
                                .addComponent(btnFin)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        this.pack();
        this.setIconImage(new ImagePanel("/images/icon.png", "icono ventana JUpload").getImageFromPanel());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.active=true;
        this.setTitle("Nueva pala");

    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        jFileChooser = new javax.swing.JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG  Images", "jpg");
        jFileChooser.setFileFilter(filter);
        int returnVal = jFileChooser.showOpenDialog(null);
        if(returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            lblFotoElegida.setText(jFileChooser.getSelectedFile().getName());
        }
    }//GEN-LAST:event_btnSubirActionPerformed

    private void txtPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalidaActionPerformed

    }//GEN-LAST:event_txtSalidaActionPerformed

    private void txtControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalidaActionPerformed

    private void txtSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalidaActionPerformed

    private void txtManejabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalidaActionPerformed

    private void txtPuntoDulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntoDulceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntoDulceActionPerformed


    private void btnFinActionPerformed(java.awt.event.ActionEvent evt){
        pala = new Pala(lblNombre.getText(), (String) comboForma.getSelectedItem(),Integer.parseInt(txtPotencia.getText()),Integer.parseInt(txtControl.getText()),Integer.parseInt(txtSalida.getText()),Integer.parseInt(txtManejabilidad.getText()),
                Integer.parseInt(txtPuntoDulce.getText()),Double.parseDouble(txtPrecio.getText()),jFileChooser.getSelectedFile().getPath());
        Client.savePala(pala);


        new Principal(true).setVisible((boolean)true);
        this.dispose();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubir;
    private javax.swing.JComboBox<String> comboForma;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblControl;
    private javax.swing.JLabel lblForma;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFotoElegida;
    private javax.swing.JLabel lblManejabilidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPuntoDulce;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSlider sldControl;
    private javax.swing.JSlider sldManejabilidad;
    private javax.swing.JSlider sldPotencia;
    private javax.swing.JSlider sldPuntoDulce;
    private javax.swing.JSlider sldSalida;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtManejabilidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPuntoDulce;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JButton btnFin;
    private Pala pala;
    // End of variables declaration//GEN-END:variables


    //Variables declaration (different purposes rather than netBeans)
    private boolean identified;
    private boolean active;
}
