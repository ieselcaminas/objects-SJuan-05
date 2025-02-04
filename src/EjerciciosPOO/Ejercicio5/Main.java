package EjerciciosPOO.Ejercicio5;

public class Main {
    public static void main(String[] args) {

        Banco santander = new Banco(1, "Santander");
        Sucursal sucursalesS = new Sucursal(11, "Castellon", santander);
        santander.añadirSucursal(sucursalesS);
        Cliente aaron = new Cliente(22, "Aaron");
        Prestec paaron = new Prestec(1, 5000, aaron, sucursalesS);
        aaron.añadirPrestamo(paaron);

        santander.getSucursales().stream().sorted().forEach(System.out::println);
    }
}
