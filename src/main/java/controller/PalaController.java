package controller;

import dao.PalaDAO;
import model.Pala;

import java.util.ArrayList;

/**
 * Clase creada para separar la funcionalidad de la ventana y de la busqueda de palas
 *
 * @author Nacho Lopez
 */
public class PalaController {
    public void getPala(ArrayList<Pala> lista) {
        PalaDAO.getPalas(lista);
    }

    public void savePala(Pala pala){ PalaDAO.savePala(pala);}
}