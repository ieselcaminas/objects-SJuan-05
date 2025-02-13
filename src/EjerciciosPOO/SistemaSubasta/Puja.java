package EjerciciosPOO.SistemaSubasta;

import java.util.ArrayList;

public class Puja {
    private int id;
    private double precio;
    private Lote lote;
    private Subasta subasta;
    private ArrayList<Pujador> pujadores;

    public Puja(int id, double precio, Lote lote, Subasta subasta) {
        this.id = id;
        this.precio = precio;
        this.lote = lote;
        this.subasta = subasta;
        this.pujadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Lote getLote() {
        return lote;
    }
    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Subasta getSubasta() {
        return subasta;
    }
    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public ArrayList<Pujador> getPujadores() {
        return pujadores;
    }
    public void añadirPujador(Pujador pujador) {
        this.pujadores.add(pujador);
    }

    @Override
    public String toString() {
        return id + " " + precio;
    }
}
