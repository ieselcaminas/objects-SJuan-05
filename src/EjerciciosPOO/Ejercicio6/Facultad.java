package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    public ArrayList<Facultad> facultades;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.facultades = new ArrayList<Facultad>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }
    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }

    public void añadirFacultad(Facultad facultad) {
        this.facultades.add(facultad);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
