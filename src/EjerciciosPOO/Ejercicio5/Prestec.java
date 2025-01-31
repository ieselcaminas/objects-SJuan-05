package EjerciciosPOO.Ejercicio5;

public class Prestec {
    private int num_p;
    private double cantidad;
    private Cliente cliente;

    public Prestec(int num_p, double cantidad, Cliente cliente) {
        this.num_p = num_p;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public int getNum_p() {
        return num_p;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return this.num_p + "\t" + this.cantidad;
    }
}
