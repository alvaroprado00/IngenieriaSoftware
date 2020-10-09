package view;
import model.Pala;
/**
 * Ventana para visualizar una pala concreta
 * @author Ignacio Lopez
 */
public class JPala extends javax.swing.JFrame {

    private Pala pala;
    private javax.swing.JButton btnDummy;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtForma;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtManejabilidad;
    private javax.swing.JTextField txtPuntoDulce;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtPrecio;

    public JPala(Pala pala) {
        this.pala = pala;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        btnDummy = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtForma = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        txtControl = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        txtManejabilidad = new javax.swing.JTextField();
        txtPuntoDulce = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnDummy.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(jPanel1Layout);
        pnlSuperior.setBackground(new java.awt.Color(255, 255, 255));
        
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(btnDummy)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDummy)
                                .addContainerGap())
        );

        lblFoto.setIcon(pala.getFoto());

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText(pala.getNombre());

        txtForma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtForma.setText("Forma: "+pala.getForma());

        txtPotencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPotencia.setText("Potencia: "+String.valueOf(pala.getPotencia()));

        txtControl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtControl.setText("Control: " + String.valueOf(pala.getControl()));

        txtSalida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSalida.setText("Salida de bola: "+ String.valueOf(pala.getSalida()));

        txtManejabilidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtManejabilidad.setText("Manejabilidad"+String.valueOf(pala.getManejabilidad()));

        txtPuntoDulce.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPuntoDulce.setText("Punto dulce: " + String.valueOf(pala.getPuntoDulce()));

        txtTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotal.setText("Total: "+String.valueOf(pala.getTotal()));

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrecio.setText("Precio: " + String.valueOf(pala.getPrecio()));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(txtForma)
                                        .addComponent(txtPotencia)
                                        .addComponent(txtControl)
                                        .addComponent(txtSalida)
                                        .addComponent(txtManejabilidad)
                                        .addComponent(txtPuntoDulce)
                                        .addComponent(txtTotal)
                                        .addComponent(txtPrecio))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(37, 37, Short.MAX_VALUE))
        );

        pack();
    }

}
