package supportClass;

import model.Pala;
import view.JPala;
import view.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class SearchedPanel extends JPanel {
    private JPanel panelImage;
    private JLabel labelName;
    private Pala pala = new Pala("Royal Whip 2017","Redonda",20,20,20,20,20,20,"/images/Royal-Padel-Whip-Polietileno-2017.png");//esto es para la pala de la primera entrega tener una default que muestre
    private boolean identified;

    public SearchedPanel(Pala pala, boolean identified) {

        this.pala = pala;
        this.setLayout(new BorderLayout());

        this. identified = identified;

        panelImage = new ImagePanel(pala.getFoto());
        labelName = new JLabel(pala.getNombre());

        //this.add(panelImage, BorderLayout.NORTH);
        this.add(labelName, BorderLayout.SOUTH);
        this.setVisible(true);

        initFunciones();
    }

    /**
     * Esto es solo para la primera entrega que meta un panel
     */
    public SearchedPanel() {

        this.setLayout(new BorderLayout());
        panelImage = new ImagePanel("/images/Royal-Padel-Whip-Polietileno-2017.png", "Pala");
        labelName = new JLabel("Royal Whip 2017");

        labelName.setFont(new Font("Arial",0,10));
        labelName.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        panelImage.setSize(new Dimension(this.getWidth(), (int) (this.getHeight()*0.9)));
        labelName.setSize(new Dimension(this.getWidth(), (int) (this.getHeight()*0.1)));

        this.setPreferredSize(new Dimension(150,150));
        this.add(panelImage, BorderLayout.CENTER);
        this.add(labelName, BorderLayout.SOUTH);
        this.setVisible(true);

        initFunciones();
    }

    private void initFunciones() {

        MouseListener ml  = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JPala a = new JPala(pala,identified);
                a.setVisible(true);
            }
        };


        panelImage.addMouseListener(ml);
        labelName.addMouseListener(ml);

    }
}
