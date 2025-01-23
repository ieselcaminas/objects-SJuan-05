package Herencia.ActividadCocheDuo;

public class Tesla extends Electrico{
    public Tesla(String nombre) {
        super(nombre);
    }

    public void IA(){
        System.out.println("Tiene Sistema de Conducción Automatico");
    }
}
