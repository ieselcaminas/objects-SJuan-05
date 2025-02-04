package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;

public class AreaConocimiento {
    private String nombre;
    private ArrayList<ArrayList> departamentos;

    public AreaConocimiento(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ArrayList> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(ArrayList<ArrayList> departamentos) {
        this.departamentos = departamentos;
    }

    public void añadirDepartamento(ArrayList departamento) {
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        return "AreaConocimiento{" + "nombre=" + nombre + '}';
    }
}
