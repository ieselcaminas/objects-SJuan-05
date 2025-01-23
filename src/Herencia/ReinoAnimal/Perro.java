package Herencia.ReinoAnimal;
public class Perro extends Mamifero{
    public Perro(String nombre) {
        super(nombre);
    }

    public void comunicarse()
    {
        System.out.println("Digo Guau");
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
