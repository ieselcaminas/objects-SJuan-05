package ProyectoTrabajadores;

public class Oficial extends Operario {
    public Oficial(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return "Cargo: " + this.getNombre();
    }
}
