package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;

public class CuentaCorriente {
    private int n_cc;
    private String titular;
    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Domiciliacion> domiciliaciones = new ArrayList<>();

    public CuentaCorriente(int n_cc, String titular) {
        this.n_cc = n_cc;
        this.titular = titular;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void añadirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public ArrayList<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }
    public void setDomiciliaciones(ArrayList<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public void añadirDomiciliacion(Domiciliacion domiciliacion) {
        this.domiciliaciones.add(domiciliacion);
    }

    @Override
    public String toString() {
        return titular;
    }
}
