package ProyectoNetwork;

import java.util.Date;

public abstract class Publicacion {
    private Usuarios usuario;
    private Date fecha;
    private Mensaje mensaje;
    private int like;

    public Publicacion (Usuarios usuarios){
        this.usuario = usuarios;
        this.fecha = new Date();
        this.like = 0;
    }

    public Usuarios getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Date getFecha(){
        return fecha;
    }

    public int getLike(){
        return like;
    }

    public void setLike(int like){
        this.like = like + 1;
    }
    public void setDislike(int like){
        this.like = like - 1;
    }
}
