package EjerciciosPOO.SistemaSubasta;

public class Articulo {
    private int id;
    private String nombre;
    private Double precio;
    private Lote lote;

    public Articulo(int id, String nombre, Double precio, Lote lote) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Lote getLote() {
        return lote;
    }
    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + precio + " " + lote;
    }

}
