package supportClass;

import model.Pala;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;
import view.JPala;
import view.ImagePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class SearchedPanel extends JPanel {
    private JLabel labelImage;
    private JLabel labelName;
    private Pala pala;
    private boolean identified;

    public SearchedPanel(Pala pala) throws IOException {
        this.setLayout(new BorderLayout());

        byte[] btDataFile = Base64.getDecoder().decode(pala.getBase64Image());
        BufferedImage image = ImageIO.read(new ByteArrayInputStream(btDataFile));
        labelImage = new JLabel(new ImageIcon(btDataFile));
        labelName = new JLabel(pala.getNombre());
        this.pala=pala;

        labelName.setFont(new Font("Arial",0,10));
        labelName.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        //labelImage.setSize(new Dimension(this.getWidth(), (int) (this.getHeight()*0.9)));
        labelName.setSize(new Dimension(this.getWidth(), (int) (this.getHeight()*0.1)));

        //this.setPreferredSize(new Dimension(150,150));
        this.add(labelImage, BorderLayout.CENTER);
        this.add(labelName, BorderLayout.SOUTH);
        this.setVisible(true);

        this.identified=identified;

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


        labelImage.addMouseListener(ml);
        labelName.addMouseListener(ml);

    }
}
