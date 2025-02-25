package org.example.Autor;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private List<Tema> temas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(){
        this.paginas = paginas;
    }

    public List<Tema> getTemas() {
        return temas;
    }
    public void añadirTema(Tema tema){
        this.temas.add(tema);
    }

    @Override
    public String toString() {
        return "Libro{" + titulo + " - " + autor + " - " + paginas + "}";
    }
}
