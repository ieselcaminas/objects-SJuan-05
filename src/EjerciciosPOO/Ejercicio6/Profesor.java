package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private Departamento departamento;
    private ArrayList<Catedra> catedras;

    public Profesor(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.catedras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Catedra> getCatedras() {
        return catedras;
    }

    public void añadirCatedra(Catedra catedra) {
        catedras.add(catedra);
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre;
    }
}
