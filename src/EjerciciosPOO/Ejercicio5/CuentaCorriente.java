package EjerciciosPOO.Ejercicio5;

public class CuentaCorriente {
    private int n_cc;
    private String titular;

    public CuentaCorriente(int n_cc, String titular) {
        this.n_cc = n_cc;
        this.titular = titular;
    }

    public int getN_cc() {
        return n_cc;
    }
    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return titular;
    }
}
