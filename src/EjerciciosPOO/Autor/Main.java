package org.example.Autor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Libro> libros = new ArrayList<>();

        Autor autor1 = new Autor("Aaron", "1999-01-01");
        Libro  libro1 = new Libro("Libro1", "Aaron", 100);

        Tema tema1 = new Tema("Tema1");
        libro1.añadirTema(tema1);

        tema1 = new Tema("Tema2");
        libro1.añadirTema(tema1);

        tema1 = new Tema("Tema3");
        libro1.añadirTema(tema1);

        tema1 = new Tema("Tema4");
        libro1.añadirTema(tema1);

        libros.add(libro1);

        for (Libro libro: libros){
            System.out.println("Libro: " + libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getPaginas());
            for(Tema tema: libro.getTemas()){
                System.out.println("\t" + tema.getNombre());
            }
        }
    }
}
