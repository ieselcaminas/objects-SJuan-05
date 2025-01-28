package EjerciciosPOO.Autor;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private Tema tema;

    public Libro(String titulo, Autor autor, int paginas, Tema tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.tema = tema;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Tema getTema() {
        return tema;
    }
    public void setTema(Tema tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "| Titulo: " + titulo + "| Autor: " + autor + "| Páginas: " + paginas + tema;
    }
}

