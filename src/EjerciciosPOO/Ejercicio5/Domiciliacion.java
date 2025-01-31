package EjerciciosPOO.Ejercicio5;

public class Domiciliacion {
    private int num_d;
    private int cuentaCorriente;

    public Domiciliacion(int num_d, int cuentaCorriente) {
        this.num_d = num_d;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getNum_d() {
        return num_d;
    }
    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public int getCuentaCorriente() {
        return cuentaCorriente;
    }
    public void setCuentaCorriente(int cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString() {
        return "Domiciliacion { " + "num_d = " + num_d + ", cuentaCorriente = " + cuentaCorriente + " }";
    }
}
