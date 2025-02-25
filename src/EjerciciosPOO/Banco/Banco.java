package EjerciciosPOO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int n_ent;
    private String nombre;
    private List<Sucursal> sucursales;

    public Banco(int n_ent, String nombre) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public int getN_ent() {
        return n_ent;
    }
    public void setN_ent(){
        this.n_ent = n_ent;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }
    public void añadirSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Banco{" + nombre + " - " + n_ent + "}";
    }
}
