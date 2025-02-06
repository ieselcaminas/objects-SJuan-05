package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private AreaConocimiento areaConocimiento;
    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

    public Departamento(String nombre, AreaConocimiento areaConocimiento) {
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }
    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void añadirProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    @Override
    public String toString() {
        return nombre;
    }
}

