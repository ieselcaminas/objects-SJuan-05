package ProyectoNetwork;

import java.util.Date;

public class Mensaje extends Publicacion {
    
    private int id;
    private String texto;
    
    public Mensaje(Usuarios usuarios, int id, String texto) {
        super(usuarios);
        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.getUsuario() + " - " + this.getTexto();
    }
}
