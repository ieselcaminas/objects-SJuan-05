package EjerciciosPOO.Banco;

import java.util.ArrayList;
import java.util.List;

public class CompteCorrent {
    private int n_cc;
    private String titular;
    private Sucursal sucursal;
    List<Client> clientes;
    List<Domiciliacio> domiciliaciones;


    public CompteCorrent(int n_cc, String titular, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.titular = titular;
        this.sucursal = sucursal;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public int getN_cc() {
        return n_cc;
    }
    public void setN_cc(){
        this.n_cc = n_cc;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(){
        this.titular = titular;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(){
        this.sucursal = sucursal;
    }

    public List<Client> getClientes() {
        return clientes;
    }
    public void añadirCliente(Client client){
        this.clientes.add(client);
    }

    public List<Domiciliacio> getDomiciliaciones() {
        return domiciliaciones;
    }
    public void añadirDomiciliacion(Domiciliacio domiciliacio){
        this.domiciliaciones.add(domiciliacio);
    }

    @Override
    public String toString() {
        return "CompteCorrent{" + n_cc + " - " + titular + "}";
    }

}
