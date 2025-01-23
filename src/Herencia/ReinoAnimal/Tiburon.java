package Herencia.ReinoAnimal;
public class Tiburon extends Pez {
    public Tiburon(String nombre) {
        super(nombre);
    }

    public void respirar() {
        System.out.println("Consigo oxigeno a través de mis branquias");
    }

    public void moverse() {
        System.out.println("Me muevo por el agua");
    }
}