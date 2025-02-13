package EjerciciosPOO.SistemaSubasta;

import java.util.ArrayList;

public class Subasta {
    private int id;
    private String nombre;
    private ArrayList<Lote> lotes;
    private ArrayList<Puja> pujas;

    public Subasta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.lotes = new ArrayList<>();
        this.pujas = new ArrayList<>();
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

    public ArrayList<Lote> getLotes() {
        return lotes;
    }
    public void añadirLote(Lote lote) {
        this.lotes.add(lote);
    }

    public ArrayList<Puja> getPujas() {
        return pujas;
    }
    public void añadirPuja(Puja puja) {
        this.pujas.add(puja);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
