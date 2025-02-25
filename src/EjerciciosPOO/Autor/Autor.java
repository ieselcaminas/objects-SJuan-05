package org.example.Autor;

public class Autor {
    private String nombre;
    private String fechaNacimiento;

    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(){
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" + nombre + " - " + fechaNacimiento + "}";
    }
}
