package EjerciciosPOO.Cuenta;

import java.util.Scanner;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public static double ingresarCantidad(Scanner sc) {

        double cantidadSumar = sc.nextDouble();

        if (cantidadSumar > 0) {
            return cantidadSumar;
        }

        return 0;
    }

    public static double retirarCantidad(double ingresar, Scanner sc) {

        double total = 0;

        double cantidadRestar = sc.nextDouble();

        if ((ingresar - cantidadRestar) < 0){
            total = 0;
        } else {
            total = ingresar - cantidadRestar;
        }

        return total;
    }

    @Override
    public String toString() {
        return "Cuenta { " + "Titular = " + titular + " | Cantidad = " + cantidad + " }";
    }
}