package EjerciciosPOO.Autor;
import java.util.Date;

public class Autor {
    private String nombre;
    private int fechaNaciento;

    public Autor(String nombre, int fechaNacimiento){
        this.nombre = nombre;
        this.fechaNaciento = fechaNacimiento;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getFechaNacimiento(){
        return fechaNaciento;
    }
    public void setFechaNacimiento(int fechaNacimiento){
        this.fechaNaciento = fechaNacimiento;
    }

    public String toString(){
        return "Nombre" + nombre + "| Fecha de Nacimiento: " + fechaNaciento + " | ";
    }
}
