package EjerciciosPOO.Autor;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Victor",1990);
        Tema tema = new Tema("Aventura");
        Libro libro = new Libro("Las aventuras de Java",autor,400,tema);

        System.out.println(libro);

    }
}
