package es.uah.matcomp.mp.teoria.gui.mvc.javafx.simulador;
public class ParameterDataModel {
    private int vida;
    private int velocidad;
    private String nombre;
    public ParameterDataModel(int vida, int velocidad, String nombre){
        this.vida = vida;
        this.velocidad = velocidad;
        this.nombre = nombre;}
    public int getVida() {return vida;}
    public int getVelocidad() {return velocidad;}
    public String getNombre() {return nombre;}
    public void setVida(int vida) {this.vida = vida;}
    public void setVelocidad(int velocidad) {this.velocidad = velocidad;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}