package view;
import model.Pala;

import javax.swing.*;
import java.util.Base64;

/**
 * Ventana para visualizar una pala concreta
 * @author Ignacio Lopez
 */
public class JPala extends javax.swing.JFrame {

    private Pala pala;
    private JLabel labelPalas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtForma;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtManejabilidad;
    private javax.swing.JTextField txtPuntoDulce;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtPrecio;
    private boolean identified;

    public JPala(Pala pala, boolean identified) {
        this.identified = identified;
        this.pala = pala;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelPalas = new JLabel(new ImageIcon(Base64.getDecoder().decode(pala.getBase64Image())));
        txtNombre = new javax.swing.JTextField();
        txtForma = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        txtControl = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        txtManejabilidad = new javax.swing.JTextField();
        txtPuntoDulce = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText(pala.getNombre());
        txtNombre.setEditable(false);

        txtForma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtForma.setText("Forma: "+pala.getForma());
        txtForma.setEditable(false);

        txtPotencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPotencia.setText("Potencia: "+String.valueOf(pala.getPotencia()));
        txtPotencia.setEditable(false);

        txtControl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtControl.setText("Control: " + String.valueOf(pala.getControl()));
        txtControl.setEditable(false);

        txtSalida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSalida.setText("Salida de bola: "+ String.valueOf(pala.getSalida()));
        txtSalida.setEditable(false);

        txtManejabilidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtManejabilidad.setText("Manejabilidad: "+String.valueOf(pala.getManejabilidad()));
        txtManejabilidad.setEditable(false);

        txtPuntoDulce.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPuntoDulce.setText("Punto dulce: " + String.valueOf(pala.getPuntoDulce()));
        txtPuntoDulce.setEditable(false);

        txtTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotal.setText("Total: "+String.valueOf(pala.getTotal()));
        txtTotal.setEditable(false);

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrecio.setText("Precio: " + String.valueOf(pala.getPrecio()));
        txtPrecio.setEditable(false);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //addContainerGap()
                                .addComponent(labelPalas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(txtForma)
                                        .addComponent(txtPotencia)
                                        .addComponent(txtControl)
                                        .addComponent(txtSalida)
                                        .addComponent(txtManejabilidad)
                                        .addComponent(txtPuntoDulce)
                                        .addComponent(txtTotal)
                                        .addComponent(txtPrecio))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtManejabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(labelPalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, Short.MAX_VALUE))
        );

        pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Pala seleccionada");
        this.setIconImage(new ImagePanel("/images/icon.png", "icono para la ventana de pala seleccionada").getImageFromPanel());
    }

}