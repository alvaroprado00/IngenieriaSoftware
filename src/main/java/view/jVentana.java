package view;

import javax.swing.*;

/**
 * Author: Jaime Mohedano
 *
 * Ventana con la cabecera que deben de llevar todas las ventanas
 */
public class jVentana {
    public static void main(String argv[])
    {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnl = new Headline(null,false);
        jFrame.add(pnl);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
