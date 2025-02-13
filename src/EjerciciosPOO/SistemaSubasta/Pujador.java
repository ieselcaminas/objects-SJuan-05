package EjerciciosPOO.SistemaSubasta;

public class Pujador {
    private String dni;
    private String nombre;
    private Puja puja;

    public Pujador(String dni, String nombre, Puja puja) {
        this.dni = dni;
        this.nombre = nombre;
        this.puja = puja;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puja getPuja() {
        return puja;
    }
    public void setPuja(Puja puja) {
        this.puja = puja;
    }

    @Override
    public String toString() {
        return dni + " " + nombre;
    }
}
