package EjerciciosPOO.MaquinaExpendedora;

import java.util.ArrayList;

public class MaquinaExpendedora {
    private int id;
    private ArrayList<Cliente> clientes;
    private ArrayList<Tiques> tiques;
    private Cajon cajon;

    public MaquinaExpendedora(int id, Cajon cajon) {
        this.id = id;
        this.clientes = new ArrayList<>();
        this.tiques = new ArrayList<>();
        this.cajon = cajon;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Tiques> getTiques() {
        return tiques;
    }
    public void añadirTique(Tiques tique) {
        tiques.add(tique);
    }

    public Cajon getCajon() {
        return cajon;
    }
    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }

    @Override
    public String toString() {
        return id + "";
    }
}
