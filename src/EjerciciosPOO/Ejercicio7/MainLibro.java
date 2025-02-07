package EjerciciosPOO.Ejercicio7;

import java.util.Date;

public class MainLibro {
    public static void main(String[] args) {
        // Crear editoriales
        Editorial editorial1 = new Editorial("Anagrama");
        Editorial editorial2 = new Editorial("Planeta");

        // Crear temas
        Tema tema1 = new Tema(1, "Novela");
        Tema tema2 = new Tema(2, "Ciencia Ficción");

        // Crear autores
        Autor autor1 = new Autor(1, "Gabriel García Márquez");
        Autor autor2 = new Autor(2, "Isaac Asimov");

        // Crear libros
        Libro libro1 = new Libro(1234, "Cien años de soledad", editorial1, tema1);
        Libro libro2 = new Libro(5678, "Fundación", editorial2, tema2);

        // Establecer relaciones bidireccionales entre libros y autores
        libro1.añadirAutor(autor1);
        autor1.agregarLibro(libro1);
        libro2.añadirAutor(autor2);
        autor2.agregarLibro(libro2);

        // Establecer relaciones bidireccionales entre libros y editoriales
        editorial1.añadirLibro(libro1);
        editorial2.añadirLibro(libro2);

        // Establecer relaciones bidireccionales entre libros y temas
        tema1.agregarLibro(libro1);
        tema2.agregarLibro(libro2);

        // Crear históricos con fechas
        Date fechaPrestamo1 = new Date(); // Fecha actual
        Date fechaDevolucion1 = new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000L); // 15 días después
        Historico historico1 = new Historico(fechaPrestamo1, fechaDevolucion1);

        // Crear ejemplares
        Ejemplar ejemplar1 = new Ejemplar(1, libro1, historico1);
        Ejemplar ejemplar2 = new Ejemplar(2, libro1, historico1);
        Ejemplar ejemplar3 = new Ejemplar(3, libro2, historico1);

        // Establecer relaciones bidireccionales entre ejemplares y libros
        libro1.añadirEjemplar(ejemplar1);
        libro1.añadirEjemplar(ejemplar2);
        libro2.añadirEjemplar(ejemplar3);

        // Crear lectores
        Lector lector1 = new Lector(12345678, "Juan Pérez", historico1);
        Lector lector2 = new Lector(87654321, "María López", historico1);

        // Establecer relaciones con el histórico
        historico1.añadirEjemplares(ejemplar1);
        historico1.añadirLectores(lector1);
        historico1.añadirLectores(lector2);

        // Mostrar información
        System.out.println("\n=== Información de la Biblioteca ===");




        System.out.println("\nLibros por Editorial:");
        System.out.println(editorial1.getNombre() + ":");
        for (Libro libro : editorial1.getLibros()) {
            System.out.println("- " + libro.getTitulo());
        }

        System.out.println("\nAutores y sus libros:");
        for (Autor autor : new Autor[]{autor1, autor2}) {
            System.out.println(autor.getNombre() + ":");
            for (Libro libro : autor.getLibros()) {
                System.out.println("- " + libro.getTitulo());
            }
        }

        System.out.println("\nEjemplares por libro:");
        for (Libro libro : new Libro[]{libro1, libro2}) {
            System.out.println(libro.getTitulo() + ":");
            for (Ejemplar ejemplar : libro.getEjemplares()) {
                System.out.println("- Registro #" + ejemplar.getN_reg());
            }
        }

        System.out.println("\nLectores actuales:");
        for (Lector lector : historico1.getLectores()) {
            System.out.println("- " + lector.getNombre() + " (DNI: " + lector.getDni() + ")");
        }
    }
}
