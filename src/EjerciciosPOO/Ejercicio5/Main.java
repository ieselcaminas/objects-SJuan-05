package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Banco santander = new Banco(1, "Santander");
        Sucursal sucursalesS = new Sucursal(11, "Castellon", santander);
        santander.añadirSucursal(sucursalesS);
        Cliente aaron = new Cliente(22, "Aaron");
        Prestec paaron = new Prestec(1, 5000, aaron);
        aaron.añadirPrestamo(paaron);



        //Banco bbva = new Banco(2, "Bbva");
        //Sucursal sucursalesB = new Sucursal(21, "Burriana", bbva);
        //bbva.añadirSucursal(sucursalesB);
        //Cliente ramon = new Cliente(33, "Ramon");
        //Prestec pramon = new Prestec(1, 7000, ramon);
        //ramon.añadirPrestamo(pramon);


        //Banco caixaRural = new Banco(3, "CaixaRural");
        //Sucursal sucursalesC = new Sucursal(31, "Vila-Real", caixaRural);
        //caixaRural.añadirSucursal(sucursalesC);
        //Cliente antonio = new Cliente(44, "Antonio");
        //Prestec antonioP = new Prestec(1, 9000, antonio);
        //antonio.añadirPrestamo(antonioP);



        //bbva.getSucursales().stream().sorted().forEach(System.out::println);
        santander.getSucursales().stream().sorted().forEach(System.out::println);
        //caixaRural.getSucursales().stream().sorted().forEach(System.out::println);
    }
}
