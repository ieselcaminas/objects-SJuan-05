package EjerciciosPOO.SistemaSubasta;

import java.util.ArrayList;

public class Lote {
    private int id;
    private String nombre;
    private Subasta subasta;
    private ArrayList<Puja> pujas;
    private ArrayList<Articulo> articulos;

    public Lote(int id, String nombre, Subasta subasta) {
        this.id = id;
        this.nombre = nombre;
        this.subasta = subasta;
        this.pujas = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Puja> getPujas() {
        return pujas;
    }
    public void añadirPuja(Puja puja) {
        pujas.add(puja);
    }

    public Subasta getSubasta() {
        return subasta;
    }
    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
    public void añadirArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    @Override
    public String toString() {
        return id + nombre;
    }
}
