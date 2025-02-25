package org.example.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Aaron", 800);
        Cuenta c2 = new Cuenta("Víctor", 1000);
        c.ingresar(200);
        c2.retirar(100);

        System.out.println(c);
        System.out.println(c2);

    }
}