package supportClass;

import client.Client;
import model.Pala;

import java.util.ArrayList;
import java.util.Iterator;

public class Busqueda {

    public static ArrayList<Pala> filtrarPalaValores(Pala palaFiltro){
        ArrayList<Pala> guardadas = getTodasPalas();
        ArrayList<Pala> resultado = new ArrayList<Pala>();

        Iterator it = guardadas.iterator();

        while(it.hasNext()){
            Pala palaActual = (Pala) it.next();
            if(palaActual.getForma()==palaFiltro.getForma() && palaActual.getPotencia()>=palaFiltro.getPotencia() && palaActual.getControl()>=palaFiltro.getControl() && palaActual.getManejabilidad()>=palaFiltro.getManejabilidad() && palaActual.getSalida()>=palaFiltro.getSalida() && palaActual.getPuntoDulce()>=palaFiltro.getPuntoDulce())
                resultado.add(palaActual);
        }

        return resultado;
    }

    public static Pala filtrarPalaNombre(Pala palaFiltroNombre){
        ArrayList<Pala> guardadas = getTodasPalas();
        Pala palaResultado = null;
        Iterator it = guardadas.iterator();

        while(it.hasNext()){
            Pala palaActual = (Pala) it.next();
            if(palaActual.getNombre()==palaFiltroNombre.getNombre())
                palaResultado=palaActual;
        }

        if(palaResultado!=null){
            return palaResultado;
        }else{
            return new Pala("X");
        }

    }

    public static ArrayList<Pala> getTodasPalas() { //Esto cuando tengamos una base de datos o como lo guardemos
        return Client.palaRequest();
    }
}
