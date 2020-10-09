package supportClass;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelBusqueda extends JPanel {

    public PanelBusqueda(String nombre,javax.swing.ImageIcon foto){

        this.setLayout(new BorderLayout());

        JLabel imagen = new JLabel(foto);
        JLabel titulo = new JLabel(nombre);

        this.add(imagen, BorderLayout.NORTH);
        this.add(titulo, BorderLayout.SOUTH);
        

    }

}
