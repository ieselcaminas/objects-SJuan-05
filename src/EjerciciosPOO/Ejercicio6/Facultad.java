package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    public ArrayList<Catedra> catedras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Catedra> getCatedras() {
        return catedras;
    }

    public void añadirCatedras(Catedra facultad) {
        this.catedras.add(facultad);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
