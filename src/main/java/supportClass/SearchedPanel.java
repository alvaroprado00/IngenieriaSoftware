package supportClass;

import view.imagePanel;

import javax.swing.*;
import java.awt.*;

public class SearchedPanel extends JPanel {

    public SearchedPanel(String nombre, String rutaFoto) {

        this.setLayout(new BorderLayout());

        JPanel imagen = new imagePanel(rutaFoto,"");
        JLabel titulo = new JLabel(nombre);

        this.add(imagen, BorderLayout.NORTH);
        this.add(titulo, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    /**
     * Esto es solo para la primera entrega que meta un panel
     */
    public SearchedPanel() {

        this.setLayout(new BorderLayout());

        JPanel imagen = new imagePanel("/images/Royal-Padel-Whip-Polietileno-2017.png", "Pala");
        JLabel titulo = new JLabel("Royal Whip 2017");

        titulo.setFont(new Font("Arial",0,10));
        titulo.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        imagen.setSize(new Dimension(this.getWidth(), (int) (this.getHeight()*0.9)));
        titulo.setSize(new Dimension(this.getWidth(), (int) (this.getHeight()*0.1)));

        this.setPreferredSize(new Dimension(150,150));
        this.add(imagen, BorderLayout.CENTER);
        this.add(titulo, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args){
        JFrame prueba= new JFrame();
        prueba.add(new SearchedPanel());
        prueba.setSize(new Dimension(300,300));
        prueba.setVisible(true);
    }
}
