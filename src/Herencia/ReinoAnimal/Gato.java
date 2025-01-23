package Herencia.ReinoAnimal;
public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    public void comunicarse()
    {
        System.out.println("Digo Miau");
    }

    public void moverse()
    {
        System.out.println("Me muevo a 4 patas");
    }

    public void mamar()
    {
        System.out.println("Cuando soy pequeño mamo");
    }
}
