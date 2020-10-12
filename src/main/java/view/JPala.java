package view;
import model.Pala;
/**
 * Ventana para visualizar una pala concreta
 * @author Ignacio Lopez
 */
public class JPala extends javax.swing.JFrame {

    private Pala pala;
    private ImagePanel pnlPalas;
    private javax.swing.JPanel pnlHeadline;
    private Headline headline;
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

        pnlHeadline = new javax.swing.JPanel();
        headline = new Headline();
        pnlPalas = new ImagePanel(pala.getFoto());
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

        javax.swing.GroupLayout pnlHeadlineLayout = new javax.swing.GroupLayout(pnlHeadline);
        pnlHeadline.setLayout(pnlHeadlineLayout);
        pnlHeadline.setBackground(new java.awt.Color(240, 240, 240, 0));

        pnlHeadlineLayout.setHorizontalGroup(
                pnlHeadlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeadlineLayout.createSequentialGroup()
                                .addComponent(headline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHeadlineLayout.setVerticalGroup(
                pnlHeadlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(headline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)

                        );

        //lblFoto.setIcon(pala.getFoto());

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
                        .addComponent(pnlHeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlPalas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(pnlHeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(pnlPalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, Short.MAX_VALUE))
        );

        pack();
    }

}