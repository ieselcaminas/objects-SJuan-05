package EjerciciosPOO.Banco;

public class Prestec {
    private int num_p;
    private int importe;
    private Sucursal sucursal;
    private Client client;

    public Prestec(int num_p, int importe, Sucursal sucursal, Client client) {
        this.num_p = num_p;
        this.importe = importe;
        this.sucursal = sucursal;
        this.client = client;
    }

    public int getNum_p() {
        return num_p;
    }
    public void setNum_p(){
        this.num_p = num_p;
    }

    public int getImporte() {
        return importe;
    }
    public void setImporte(){
        this.importe = importe;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(){
        this.sucursal = sucursal;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(){
        this.client = client;
    }

    @Override
    public String toString() {
        return "Prestec{" + num_p + " - " + importe + "}";
    }

}
