package Herencia.ReinoAnimal;
public class main {
    public static void main(String[] args) {

        Gato gato = new Gato("Gato");
        Perro perro = new Perro("Perro");
        Tiburon tiburon = new Tiburon("Tiburon");
        PezPayaso pezpayaso = new PezPayaso("Pez Payaso");

        System.out.println("-------------------------");

        System.out.println("Soy un Gato:");
        gato.comunicarse();
        gato.moverse();
        gato.respirar();
        gato.mamar();

        System.out.println("-------------------------");

        System.out.println("Soy un Perro:");
        perro.comunicarse();
        perro.moverse();
        perro.respirar();
        perro.mamar();

        System.out.println("-------------------------");

        System.out.println("Soy un Tiburon:");
        tiburon.moverse();
        tiburon.respirar();

        System.out.println("-------------------------");

        System.out.println("Soy un Pez Payaso");

        pezpayaso.moverse();
        pezpayaso.respirar();

        System.out.println("-------------------------");

    }
}
