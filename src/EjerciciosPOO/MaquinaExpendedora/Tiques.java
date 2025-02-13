package EjerciciosPOO.MaquinaExpendedora;

public class Tiques {
    private int id;
    private int cantidad;
    private Cajon cajon;
    private Cliente cliente;
    private MaquinaExpendedora maquina;

    public Tiques(int id, int cantidad, Cajon cajon, Cliente cliente) {
        this.id = id;
        this.cantidad = cantidad;
        this.cajon = cajon;
        this.cliente = cliente;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cajon getCajon() {
        return cajon;
    }
    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MaquinaExpendedora getMaquina() {
        return maquina;
    }
    public void setMaquina(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return id + " - " + cantidad;
    }
}
