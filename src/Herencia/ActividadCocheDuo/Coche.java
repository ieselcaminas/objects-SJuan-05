package Herencia.ActividadCocheDuo;
public abstract class Coche{

    public String nombre;

    public Coche(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
