package Herencia.ReinoAnimal;
public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }
    public void respirar()
    {
        System.out.println("Respiro aire por los pulmones");
    }
}
