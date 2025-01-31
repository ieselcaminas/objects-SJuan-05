package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;

public class Banco {
    private int n_ent;
    private String nombre;
    private ArrayList<Sucursal> sucursales;

    public Banco(int n_ent, String nombre) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public int getN_ent() {
        return n_ent;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }
    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void añadirSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Banco {" + " Número de la entidad = " + n_ent + ", nombre = " + nombre + "}";
    }
}
