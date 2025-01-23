package Herencia.ActividadCocheDuo;
public abstract class Electrico extends Coche{
    public Electrico(String nombre){
        super(nombre);
    }

    public void Combustible(){
        System.out.println("Combustible: Electricidad");
    }

    public void Recarga(){
        System.out.println("Necesita estación de recarga");
    }
}
