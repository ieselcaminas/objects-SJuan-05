package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;

public class Cliente {
    private int dni;
    private String nombre;
    private ArrayList<Prestec> prestecs;
    private ArrayList<CuentaCorriente> cuentas;

    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestecs = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Prestec> getPrestecs() {
        return prestecs;
    }

    public void añadirPrestamo(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public ArrayList<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    public void añadirCuentas(CuentaCorriente cuentaCorriente) {
        this.cuentas.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        return dni + " " + nombre;
    }
}
