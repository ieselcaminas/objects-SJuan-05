package EjerciciosPOO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String direccion;
    private Banco banco;
    private List<CompteCorrent> cuentasCorrientes;
    private List<Prestec> prestamos;

    public Sucursal(int n_suc, String direccion, Banco banco) {
        this.n_suc = n_suc;
        this.direccion = direccion;
        this.banco = banco;
        this.cuentasCorrientes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public int getN_suc() {
        return n_suc;
    }
    public void setN_suc(){
        this.n_suc = n_suc;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(){
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }
    public void setBanco(){
        this.banco = banco;
    }

    public List<CompteCorrent> getCuentasCorrientes() {
        return cuentasCorrientes;
    }
    public void añadirCuentaCorriente(CompteCorrent cuentaCorriente){
        this.cuentasCorrientes.add(cuentaCorriente);
    }

    public List<Prestec> getPrestamos() {
        return prestamos;
    }
    public void añadirPrestamo(Prestec prestamo){
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Sucursal{" + n_suc + " - " + direccion + "}";
    }
}
