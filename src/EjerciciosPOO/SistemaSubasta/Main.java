package EjerciciosPOO.SistemaSubasta;

public class Main {
    public static void main(String[] args) {

        Subasta subasta1 = new Subasta(1, "Subasta1");
        Lote lote1 = new Lote(11, "lote1", subasta1);
        Puja puja1 = new Puja(111,300.90, lote1, subasta1);
        Pujador pujador1 = new Pujador("54516524S", "Victor", puja1);
        Articulo articulo1 = new Articulo(1111, "televisor", 22.50, lote1);

        System.out.println(subasta1.toString());
        System.out.println(lote1.toString());
        System.out.println(articulo1.toString());
        System.out.println(puja1.toString());
        System.out.println(pujador1.toString());



    }


}
