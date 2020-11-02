package view;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import supportClass.SearchedPanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author allor
 */
public class FilterWindow extends javax.swing.JFrame {

    /**
     * Creates new form VentanaFiltro
     */
    public FilterWindow(boolean identified) {
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

        this.setTitle("Ventana de filtrado");

        this.setIconImage(new ImagePanel("/images/icon.png", "icono para ventana de pala concreta").getImageFromPanel());

        panelFiltros = new javax.swing.JPanel();
        sliderPotencia = new javax.swing.JSlider();
        labelFiltro = new java.awt.Label();
        buttonFilter = new javax.swing.JButton();
        boxPalaShape1 = new javax.swing.JCheckBox();
        labelForma = new java.awt.Label();
        boxPalaShape2 = new javax.swing.JCheckBox();
        boxPalaShape3 = new javax.swing.JCheckBox();
        labelPotencia = new java.awt.Label();
        sliderControl = new javax.swing.JSlider();
        sliderSalidaBola = new javax.swing.JSlider();
        labelControl = new java.awt.Label();
        labelSalidaBola = new java.awt.Label();
        sliderPuntoDulce = new javax.swing.JSlider();
        sliderManeja = new javax.swing.JSlider();
        labelManeja = new java.awt.Label();
        labelPuntoDulce = new java.awt.Label();
        textPotenciaValue = new javax.swing.JTextField();
        textControlValue = new javax.swing.JTextField();
        textSalidaBolaValue = new javax.swing.JTextField();
        textManejaValue = new javax.swing.JTextField();
        textPuntoDulceValue = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        panelResultsLayout = new javax.swing.JPanel();
        panelResultsHolder = new JPanel();
        headline = new Headline(this, identified);
        pnlHeadline = new javax.swing.JPanel();

        //para primera entrega
        panelResultsHolder.setSize(panelResultsLayout.getWidth(), panelResultsHolder.getHeight());
        ArrayList<SearchedPanel> paneles = new ArrayList<SearchedPanel>();
        for(int i=0;i<15;i++){
            paneles.add(new SearchedPanel());
        }
        cargarPaneles(paneles);
        //hasta aqui

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sliderPotencia.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        sliderPotencia.setMajorTickSpacing(1);
        sliderPotencia.setMinorTickSpacing(1);
        sliderPotencia.setSnapToTicks(true);

        labelFiltro.setAlignment(java.awt.Label.CENTER);
        labelFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelFiltro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelFiltro.setName("tituloFiltros"); // NOI18N
        labelFiltro.setText("Filtros");

        buttonFilter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        buttonFilter.setText("FILTRAR");

        boxPalaShape1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        boxPalaShape1.setText("Lágrima");
        boxPalaShape1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        labelForma.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelForma.setName("labelForma"); // NOI18N
        labelForma.setText("Forma de la pala:");

        boxPalaShape2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        boxPalaShape2.setText("Redonda");
        boxPalaShape2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        boxPalaShape3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        boxPalaShape3.setText("Diamante");
        boxPalaShape3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        labelPotencia.setAlignment(java.awt.Label.CENTER);
        labelPotencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelPotencia.setName("labelPotencia"); // NOI18N
        labelPotencia.setText("Potencia");

        sliderControl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        sliderControl.setMajorTickSpacing(1);
        sliderControl.setMinorTickSpacing(1);
        sliderControl.setSnapToTicks(true);

        sliderSalidaBola.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        sliderSalidaBola.setMajorTickSpacing(1);
        sliderSalidaBola.setMinorTickSpacing(1);
        sliderSalidaBola.setSnapToTicks(true);

        labelControl.setAlignment(java.awt.Label.CENTER);
        labelControl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelControl.setName("labelControl"); // NOI18N
        labelControl.setText("Control");

        labelSalidaBola.setAlignment(java.awt.Label.CENTER);
        labelSalidaBola.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelSalidaBola.setName("labelSalidaBola"); // NOI18N
        labelSalidaBola.setText("Salida de bola");

        sliderPuntoDulce.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        sliderPuntoDulce.setMajorTickSpacing(1);
        sliderPuntoDulce.setMinorTickSpacing(1);
        sliderPuntoDulce.setSnapToTicks(true);

        sliderManeja.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        sliderManeja.setMajorTickSpacing(1);
        sliderManeja.setMinorTickSpacing(1);
        sliderManeja.setSnapToTicks(true);

        labelManeja.setAlignment(java.awt.Label.CENTER);
        labelManeja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelManeja.setName("labelManejabilidad"); // NOI18N
        labelManeja.setText("Manejabilidad");

        labelPuntoDulce.setAlignment(java.awt.Label.CENTER);
        labelPuntoDulce.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelPuntoDulce.setName("labelPuntoDulce"); // NOI18N
        labelPuntoDulce.setText("Punto Dulce");

        textPotenciaValue.setBackground(new java.awt.Color(240, 240, 240));
        textPotenciaValue.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        textPotenciaValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPotenciaValue.setText("0");
        textPotenciaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        textControlValue.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        textControlValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textControlValue.setText("0");
        textControlValue.setToolTipText("");
        textControlValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        textSalidaBolaValue.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        textSalidaBolaValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSalidaBolaValue.setText("0");
        textSalidaBolaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        textManejaValue.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        textManejaValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textManejaValue.setText("0");
        textManejaValue.setMinimumSize(new java.awt.Dimension(13, 19));
        textManejaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        textPuntoDulceValue.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        textPuntoDulceValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPuntoDulceValue.setText("0");
        textPuntoDulceValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFiltrosLayout = new javax.swing.GroupLayout(panelFiltros);
        panelFiltros.setLayout(panelFiltrosLayout);
        panelFiltrosLayout.setHorizontalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxPalaShape1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxPalaShape2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxPalaShape3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(textPotenciaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(sliderPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(sliderManeja, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(sliderSalidaBola, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(sliderControl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelForma, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(buttonFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFiltrosLayout.createSequentialGroup()
                                .addComponent(labelControl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(textControlValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFiltrosLayout.createSequentialGroup()
                                .addComponent(labelSalidaBola, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(textSalidaBolaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFiltrosLayout.createSequentialGroup()
                                .addComponent(labelManeja, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(textManejaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFiltrosLayout.createSequentialGroup()
                                .addComponent(labelPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(textPuntoDulceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sliderPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelFiltrosLayout.setVerticalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addComponent(labelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(labelForma, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPalaShape1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxPalaShape2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxPalaShape3)
                .addGap(20, 20, 20)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPotenciaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sliderPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControlValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sliderControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSalidaBola, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSalidaBolaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sliderSalidaBola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelManeja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textManejaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sliderManeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPuntoDulceValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sliderPuntoDulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(buttonFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        scrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelResultsLayout.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        /*javax.swing.GroupLayout PanelResultadosLayout = new javax.swing.GroupLayout(panelResultsLayout);
        panelResultsLayout.setLayout(PanelResultadosLayout);
        PanelResultadosLayout.setHorizontalGroup(
                PanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 654, Short.MAX_VALUE)
        );
        PanelResultadosLayout.setVerticalGroup(
                PanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 571, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHeadlineLayout = new javax.swing.GroupLayout(headline);
        headline.setLayout(pnlHeadlineLayout);
        pnlHeadlineLayout.setHorizontalGroup(
            pnlHeadlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHeadlineLayout.setVerticalGroup(
                pnlHeadlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE));*/  //esto al parecer solo hacia que no me dejase mostrar el encxabezado
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


        panelResultsHolder.setLayout(new java.awt.GridLayout(0, 4));
        panelResultsLayout.add(panelResultsHolder);

        scrollPane1.setViewportView(panelResultsLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1))//.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlHeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlHeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane1)
                    .addComponent(panelFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );


        sliderPotencia.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sliderPotencia.getValueIsAdjusting()){
                    textPotenciaValue.setText(String.valueOf(sliderPotencia.getValue()));
                }

            }
        });

        sliderControl.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sliderControl.getValueIsAdjusting()){
                    textControlValue.setText(String.valueOf(sliderControl.getValue()));
                }

            }
        });

        sliderSalidaBola.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sliderSalidaBola.getValueIsAdjusting()){
                    textSalidaBolaValue.setText(String.valueOf(sliderSalidaBola.getValue()));
                }

            }
        });

        sliderPuntoDulce.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sliderPuntoDulce.getValueIsAdjusting()){
                    textPuntoDulceValue.setText(String.valueOf(sliderPuntoDulce.getValue()));
                }

            }
        });

        sliderManeja.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(sliderManeja.getValueIsAdjusting()){
                    textManejaValue.setText(String.valueOf(sliderManeja.getValue()));
                }

            }
        });

        textPotenciaValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(textPotenciaValue.getText())>=0 && Integer.parseInt(textPotenciaValue.getText())<101){
                        sliderPotencia.setValue(Integer.parseInt(textPotenciaValue.getText()));
                    }
                } catch (NumberFormatException ex) {
                }
            }
        });

        textControlValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(textControlValue.getText())>=0 && Integer.parseInt(textControlValue.getText())<101){
                        sliderControl.setValue(Integer.parseInt(textControlValue.getText()));
                    }
                } catch (NumberFormatException ex) {
                }
            }
        });

        textSalidaBolaValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(textSalidaBolaValue.getText())>=0 && Integer.parseInt(textSalidaBolaValue.getText())<101)
                        sliderSalidaBola.setValue(Integer.parseInt(textSalidaBolaValue.getText()));
                } catch (NumberFormatException ex) {
                }
            }
        });

        textManejaValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(textManejaValue.getText())>=0 && Integer.parseInt(textManejaValue.getText())<101)
                        sliderManeja.setValue(Integer.parseInt(textManejaValue.getText()));
                } catch (NumberFormatException ex) {
                }
            }
        });

        textPuntoDulceValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(Integer.parseInt(textPuntoDulceValue.getText())>=0 && Integer.parseInt(textPuntoDulceValue.getText())<101)
                        sliderPuntoDulce.setValue(Integer.parseInt(textPuntoDulceValue.getText()));
                } catch (NumberFormatException ex) {
                }
            }
        });


        pack();
    }// </editor-fold>

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        boxPalaShape2.setSelected(false);
        boxPalaShape3.setSelected(false);
    }

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        boxPalaShape1.setSelected(false);
        boxPalaShape3.setSelected(false);
    }

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        boxPalaShape1.setSelected(false);
        boxPalaShape2.setSelected(false);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonFilter;
    private javax.swing.JCheckBox boxPalaShape1;
    private javax.swing.JCheckBox boxPalaShape2;
    private javax.swing.JCheckBox boxPalaShape3;
    private javax.swing.JPanel panelResultsLayout;
    private Headline headline;
    private javax.swing.JPanel pnlHeadline;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JSlider sliderPotencia;
    private javax.swing.JSlider sliderControl;
    private javax.swing.JSlider sliderSalidaBola;
    private javax.swing.JSlider sliderPuntoDulce;
    private javax.swing.JSlider sliderManeja;
    private javax.swing.JTextField textPotenciaValue;
    private javax.swing.JTextField textControlValue;
    private javax.swing.JTextField textSalidaBolaValue;
    private javax.swing.JTextField textManejaValue;
    private javax.swing.JTextField textPuntoDulceValue;
    private java.awt.Label labelFiltro;
    private java.awt.Label labelForma;
    private java.awt.Label labelPotencia;
    private java.awt.Label labelControl;
    private java.awt.Label labelSalidaBola;
    private java.awt.Label labelManeja;
    private java.awt.Label labelPuntoDulce;
    private javax.swing.JPanel panelFiltros;
    private JPanel panelResultsHolder;
    private boolean identified;


    /** Esta es la funcion para cargar todos los resultados de la busqueda*/
    public void cargarPanel(SearchedPanel panel){
        panelResultsHolder.add(panel);
    }

    public void cargarPaneles(ArrayList<SearchedPanel> paneles){
        Iterator it = paneles.iterator();

        while(it.hasNext())
            panelResultsHolder.add((SearchedPanel) it.next());
    }
}
