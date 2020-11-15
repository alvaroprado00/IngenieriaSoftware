package model;

import view.ImagePanel;

import java.io.File;

/**
 * Clase creada para clasificar a las palas de la aplicación
 *
 * @author Ignacio Lopez
 */
public class Pala {

    private String nombre; //Todos los atributos que tiene una pala
    private String forma;
    private int potencia;
    private int control;
    private int salida;
    private int manejabilidad;
    private int puntoDulce;
    private int total;
    private double precio;
    private javax.swing.ImageIcon foto;
    private File ficheroFoto;
    //private String ruta;
    private String base64Image;

    public Pala(String nombre,String forma,int potencia,int control,int salida, int manejabilidad,int puntoDulce,double precio, File ficheroFoto){
        setNombre(nombre);
        setForma(forma);
        setPotencia(potencia);
        setControl(control);
        setSalida(salida);
        setManejabilidad(manejabilidad);
        setPuntoDulce(puntoDulce);
        if(precio > 0)
            this.precio=precio;
        this.setTotal();
        this.setFicheroFoto(ficheroFoto);
        this.foto= ImagePanel.createImageIcon(ficheroFoto.getPath(),nombre);
    }

    public Pala(String forma,int potencia,int control,int salida, int manejabilidad,int puntoDulce){ //Para la busqueda de la pala por valores
        this.forma=forma;
        this.potencia=potencia;
        this.control=control;
        this.salida=salida;
        this.manejabilidad=manejabilidad;
        this.puntoDulce=puntoDulce;
    }

    public Pala(String nombre){ //Para la busqueda por nombre
        this.nombre=nombre;
    }

    public Pala(String nombre,String forma,int potencia,int control,int salida, int manejabilidad,int puntoDulce,double precio, String base64Image){
        this.nombre=nombre;
        this.forma=forma;
        this.potencia=potencia;
        this.control=control;
        this.salida=salida;
        this.manejabilidad=manejabilidad;
        this.puntoDulce=puntoDulce;
        if(precio > 0)
            this.precio=precio;
        this.total = (potencia + control + salida + manejabilidad + puntoDulce)/5;
        //this.ruta=ruta;
        this.base64Image=base64Image;
    }


    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setForma(String forma){
        this.forma=forma;
    }

    public void setPotencia(int potencia){
        if(potencia >= 0 && potencia <= 100)
            this.potencia=potencia;
    }

    public void setControl(int control){
        if(control >= 0 && control <= 100)
            this.control=control;
    }

    public void setSalida(int salida){
        if(salida >= 0 && salida <= 100)
            this.salida=salida;
    }

    public void setManejabilidad(int manejabilidad){
        if(manejabilidad >= 0 && manejabilidad <= 100)
            this.manejabilidad=manejabilidad;
    }

    public void setPuntoDulce(int puntoDulce){
        if(puntoDulce >= 0 && puntoDulce <= 100)
            this.puntoDulce=puntoDulce;
    }

    public void setTotal(){
        this.total=(potencia + control + salida + manejabilidad + puntoDulce)/5;
    }

    public void setFicheroFoto(File ficheroFoto){
        this.ficheroFoto=ficheroFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getForma() {
        return forma;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getControl() {
        return control;
    }

    public int getSalida() {
        return salida;
    }

    public int getManejabilidad() {
        return manejabilidad;
    }

    public int getPuntoDulce() {
        return puntoDulce;
    }

    public int getTotal() {
        return total;
    }

    public double getPrecio() {
        return precio;
    }

    public javax.swing.ImageIcon getFoto(){
        return foto;
    }

    //public String getRuta(){  return this.ruta; }

    public String getBase64Image(){ return this.base64Image;}

    public void setBase64Image(String base64Image){ this.base64Image = base64Image;}

}