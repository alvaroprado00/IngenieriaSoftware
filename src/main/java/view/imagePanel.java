package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase para crear un panel relleno con una imagen
 */
public class imagePanel extends JPanel {

    public Image imagen;

    /**
     * Constructor de PanelImagen en el que se rellenan los atributos del objeto
     * @param imageName path donde se encuentra la imagen
     * @param description descripcion de la imagen
     */
    public imagePanel(String imageName, String description) {
        if (imageName != null) {

            imagen = createImageIcon(imageName, description).getImage();
        }
    }

    public imagePanel(ImageIcon icono){
        imagen = icono.getImage();
    }

    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),
                    this);

            setOpaque(false);
        } else {
            setOpaque(true);
        }

        super.paint(g);
    }

    /**
     * Metodo para crear un ImageIcon mediante una imagen en un path determinado
     * @param path indica la direccion relativa en la que se encuentra la imagen
     * @param description descripciod de la iamgen
     * @return devuelve un ImageIcon de la imagen que se encuentra en el path indicado
     */
    public static ImageIcon createImageIcon(String path,
                                               String description) {
        java.net.URL imgURL = userValidationUI.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("No se ha podido encontrar la imagen: " + path);
            return null;
        }
    }

    public Image getImageFromPanel(){
        return this.imagen;
    }
}