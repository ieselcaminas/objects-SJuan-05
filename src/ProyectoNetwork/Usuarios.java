package ProyectoNetwork;

public class Usuarios {
    private String nickname;
    private String nombre;
    private int id;

    public Usuarios(String nickname, String nombre, int id) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuarios: " + "nickname = " + nickname + " - nombre = " + nombre + " - id = " + id;
    }
}
