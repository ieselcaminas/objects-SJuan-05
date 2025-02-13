package EjerciciosPOO.MaquinaExpendedora;

import java.util.ArrayList;

public class Cajon {
    private int id;
    private double importe;
    private ArrayList<Tiques> tiques;
    private MaquinaExpendedora maquina;

    public Cajon(int id, double importe, MaquinaExpendedora maquina) {
        this.id = id;
        this.importe = importe;
        this.tiques = new ArrayList<>();
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }

    public ArrayList<Tiques> getTiques() {
        return tiques;
    }
    public void añadirTique(Tiques tique) {
        tiques.add(tique);
    }

    public MaquinaExpendedora getMaquina() {
        return maquina;
    }
    public void setMaquina(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return id + " - " + importe;
    }
}
