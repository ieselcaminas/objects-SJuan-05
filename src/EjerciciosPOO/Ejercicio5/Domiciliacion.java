package EjerciciosPOO.Ejercicio5;

public class Domiciliacion {
    private int num_d;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int num_d, CuentaCorriente cuentaCorriente) {
        this.num_d = num_d;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getNum_d() {
        return num_d;
    }
    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }
    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString() {
        return "Domiciliacion { " + "num_d = " + num_d + ", cuentaCorriente = " + cuentaCorriente + " }";
    }
}
