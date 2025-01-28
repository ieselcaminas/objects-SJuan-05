package EjerciciosPOO.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cantidad a la cuenta del banco, si ingresa un número negativo finalizará: ");
        double ingresar = Cuenta.ingresarCantidad(sc);

        System.out.println("Retira una cantidad de la cuenta del banco: ");
        double total = Cuenta.retirarCantidad(ingresar, sc);

        Cuenta c = new Cuenta("Víctor", 10);

        Cuenta cuenta = new Cuenta("Aaron",total);

        System.out.println(cuenta);
        System.out.println(c);
    }
}
