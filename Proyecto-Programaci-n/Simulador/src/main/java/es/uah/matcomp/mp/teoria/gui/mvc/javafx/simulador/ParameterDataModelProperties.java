package es.uah.matcomp.mp.teoria.gui.mvc.javafx.simulador;
import javafx.beans.property.*;

public class ParameterDataModelProperties {
    protected ParameterDataModel original;
    private IntegerProperty velocidad = new SimpleIntegerProperty();
    private IntegerProperty vida = new SimpleIntegerProperty();
    private StringProperty nombre = new SimpleStringProperty();

    public ParameterDataModelProperties(ParameterDataModel original){
        setOriginal(original);
    }
    public void commit(){
        original.setVelocidad(velocidad.get());
        original.setVida(vida.get());
        original.setNombre(nombre.get());
    }
    public void rollback(){
        velocidad.set(original.getVelocidad());
        vida.set(original.getVida());
        nombre.set(original.getNombre());
    }
    public ParameterDataModel getOriginal(){
        return original;
    }
    public void setOriginal(ParameterDataModel original){
        this.original = original;
        rollback();
    }
    public Property<Number> velocidadProperty() {
        return velocidad;
    }
    public Property<Number> vidaProperty() {
        return vida;
    }
    public Property<String> nombreProperty() {
        return nombre;
    }
}