package EjerciciosPOO.Ejercicio5;
import java.util.ArrayList;

public class Sucursal {
    private int n_suc;
    private String localizacion;
    private Banco banco;
    private ArrayList<Prestec> prestamos;
    private ArrayList<CuentaCorriente> cuentas;

    public Sucursal(int n_suc, String localizacion , Banco banco) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.banco = banco;
        this.prestamos = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getLocalizacion() {
        return localizacion;
    }
    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public ArrayList<Prestec> getPrestamo() {
        return prestamos;
    }
    public void setPrestamo(ArrayList<Prestec> prestamos) {
        this.prestamos = prestamos;
    }

    public void añadirPrestamo(Prestec prestamo) {
        prestamos.add(prestamo);
    }

    public ArrayList<CuentaCorriente> getCuentas() {
        return cuentas;
    }
    public void setCuentas(ArrayList<CuentaCorriente> cuentas) {
        this.cuentas = cuentas;
    }

    public void añadirCuenta(CuentaCorriente cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "Sucursal {" + " Número de Sucursal = " + n_suc + " }";
    }
}
