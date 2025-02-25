package EjerciciosPOO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int dni;
    private String nombre;
    private List<Prestec> prestecs;
    private List<CompteCorrent> comptesCorrents;

    public Client(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestecs = new ArrayList<>();
        this.comptesCorrents = new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }
    public void setDni(){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }

    public List<Prestec> getPrestecs() {
        return prestecs;
    }
    public void añadirPrestamo(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public List<CompteCorrent> getComptesCorrents() {
        return comptesCorrents;
    }
    public void añadirCompteCorrent(CompteCorrent compteCorrent) {
        this.comptesCorrents.add(compteCorrent);
    }

    @Override
    public String toString() {
        return "Client{" + dni + " - " + nombre + "}";
    }
}
