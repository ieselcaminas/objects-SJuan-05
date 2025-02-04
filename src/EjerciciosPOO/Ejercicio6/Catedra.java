package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;

public class Catedra {
    private String nombre;
    private Departamento departamento;
    private Facultad facultad;
    private ArrayList<Profesor> profesores;

    public Catedra(String nombre, Departamento departamento , Facultad facultad) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.facultad = facultad;
        this.profesores = profesores;
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

    public Facultad getFacultad() {
        return facultad;
    }
    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void añadirProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
