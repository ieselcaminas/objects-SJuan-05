package EjerciciosPOO.MaquinaExpendedora;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private double cantidadIntroducidad;
    private ArrayList<Tiques> tiques;
    private MaquinaExpendedora maquina;
    public Cliente(int id, double cantodadIntroducidad, MaquinaExpendedora maquina) {
        this.id = id;
        this.cantidadIntroducidad = cantodadIntroducidad;
        this.tiques = new ArrayList<>();
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public
    double getCantidadIntroducidad() {
        return cantidadIntroducidad;
    }
    public void setCantidadIntroducidad(double cantidadIntroducidad) {
        this.cantidadIntroducidad = cantidadIntroducidad;
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
        return id + " - " + cantidadIntroducidad;
    }
}
