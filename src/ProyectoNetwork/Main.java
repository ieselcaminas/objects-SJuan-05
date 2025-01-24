package ProyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Publicacion> lista = new ArrayList<>();

        Usuarios Alvaro = new Usuarios("pelotaGrande","Alvaro", 1);
        Mensaje mensaje = new Mensaje(Alvaro, 1, "Eres un pelotudo pelota grande");
        lista.add(mensaje);


        Usuarios Marcela = new Usuarios("pelotaPequeña","Marcela", 2);
        Fotografia fotografia = new Fotografia(Marcela,"marcela.jpg", "marcelarota");
        lista.add(fotografia);

        System.out.println(mensaje);
        System.out.println(fotografia);

    }
}
