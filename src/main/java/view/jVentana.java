package view;

import javax.swing.*;

public class jVentana {
    public static void main(String argv[])
    {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnl = new Headline();
        jFrame.add(pnl);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
