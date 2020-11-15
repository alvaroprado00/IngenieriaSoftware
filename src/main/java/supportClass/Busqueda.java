package supportClass;

import client.Client;
import model.Pala;

import java.util.ArrayList;
import java.util.Iterator;

public class Busqueda {

    public static ArrayList<Pala> filtrarPalaValores(Pala palaFiltro){
        ArrayList<Pala> guardadas = Client.palaRequest();

        ArrayList<Pala> resultado = new ArrayList<Pala>();

        Iterator it = guardadas.iterator();

        while(it.hasNext()){
            Pala palaActual = (Pala) it.next();
            if(palaActual.getForma().equals(palaFiltro.getForma()) && palaActual.getPotencia()>=palaFiltro.getPotencia() && palaActual.getControl()>=palaFiltro.getControl() && palaActual.getManejabilidad()>=palaFiltro.getManejabilidad() && palaActual.getSalida()>=palaFiltro.getSalida() && palaActual.getPuntoDulce()>=palaFiltro.getPuntoDulce())
                resultado.add(palaActual);
        }

        System.out.println("Resultado : " + resultado.toString());
        return resultado;
    }

    public static Pala filtrarPalaNombre(Pala palaFiltroNombre){
        ArrayList<Pala> guardadas = Client.palaRequest();
        Pala palaResultado = null;
        Iterator it = guardadas.iterator();

        while(it.hasNext()){
            Pala palaActual = (Pala) it.next();
            if(palaActual.getNombre()==palaFiltroNombre.getNombre())
                palaResultado=palaActual;
            System.out.println("iteracion");
        }

        if(palaResultado!=null){
            return palaResultado;
        }else{
            return new Pala("X");
        }

    }

}
