package EjerciciosPOO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<>();

        Banco banco1 = new Banco(1, "Banco1");
        bancos.add(banco1);
            Sucursal sucursal1 = new Sucursal(1, "Direccion1", banco1);
            banco1.añadirSucursal(sucursal1);
                Client client1 = new Client(1, "Client1");
                Prestec prestec1 = new Prestec(1, 100, sucursal1, null);
                    sucursal1.añadirPrestamo(prestec1);
                    client1.añadirPrestamo(prestec1);
                CompteCorrent cuentaCorriente1 = new CompteCorrent(1, "Titular1", sucursal1);
                    sucursal1.añadirCuentaCorriente(cuentaCorriente1);
                    client1.añadirCompteCorrent(cuentaCorriente1);
                    cuentaCorriente1.añadirCliente(client1);
                Domiciliacio domiciliacio1 = new Domiciliacio(1, "Emisor1", cuentaCorriente1);
                    cuentaCorriente1.añadirDomiciliacion(domiciliacio1);


        for (Banco banco: bancos){
            System.out.println("Banco: " + banco.getNombre() + " - " + banco.getN_ent());

            for (Sucursal sucursal: banco.getSucursales()){
                System.out.println("\tSucursal: " + sucursal.getN_suc() + " - " + sucursal.getDireccion());

                for (CompteCorrent cuentaCorriente: sucursal.getCuentasCorrientes()){
                    System.out.println("\t\tCuentaCorriente: " + cuentaCorriente.getN_cc() + " - " + cuentaCorriente.getTitular());

                    for (Client client: cuentaCorriente.getClientes()){
                        System.out.println("\t\t\tClient: " + client.getDni() + " - " + client.getNombre());

                        for (Prestec prestec: client.getPrestecs()){
                            System.out.println("\t\t\t\tPrestec: " + prestec.getNum_p() + " - " + prestec.getImporte());

                            for (Domiciliacio domiciliacio: cuentaCorriente.getDomiciliaciones()){
                                System.out.println("\t\t\t\t\tDomiciliacio: " + domiciliacio.getNum_d() + " - " + domiciliacio.getEmisor());
                            }
                        }
                    }
                }
            }
        }
    }
}
