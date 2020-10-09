package model;
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

    public Pala(String nombre,String forma,int potencia,int control,int salida, int manejabilidad,int puntoDulce,double precio, javax.swing.ImageIcon foto){
        this.nombre=nombre;
        this.forma=forma;
        setPotencia(potencia);
        setControl(control);
        setSalida(salida);
        setManejabilidad(manejabilidad);
        setPuntoDulce(puntoDulce);
        if(precio > 0)
            this.precio=precio;
        this.total = (potencia + control + salida + manejabilidad + puntoDulce)/5;
        this.foto = foto;
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

}
