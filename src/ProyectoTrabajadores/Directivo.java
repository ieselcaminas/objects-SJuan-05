package ProyectoTrabajadores;

public class Directivo extends Operario{
    public Directivo(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return "Cargo: " + this.getNombre();
    }
}
