package EjerciciosPOO.Ejercicio7;

public class Ejemplar {
    private int n_reg;
    private Libro libro;

    public Ejemplar(int n_reg, Libro libro) {
        this.n_reg = n_reg;
        this.libro = libro;
    }

    public int getN_reg() {
        return n_reg;
    }
    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return n_reg + " " + libro;
    }
}
