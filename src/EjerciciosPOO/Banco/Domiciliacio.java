package EjerciciosPOO.Banco;

public class Domiciliacio {
    private int num_d;
    private String emisor;
    private CompteCorrent compteCorrent;

    public Domiciliacio(int num_d, String emisor, CompteCorrent compteCorrent) {
        this.num_d = num_d;
        this.emisor = emisor;
        this.compteCorrent = compteCorrent;
    }

    public int getNum_d() {
        return num_d;
    }
    public void setNum_d(){
        this.num_d = num_d;
    }

    public String getEmisor() {
        return emisor;
    }
    public void setEmisor(){
        this.emisor = emisor;
    }

    public CompteCorrent getCompteCorrent() {
        return compteCorrent;
    }
    public void setCompteCorrent(){
        this.compteCorrent = compteCorrent;
    }

    @Override
    public String toString() {
        return "Domiciliacio{" + num_d + " - " + emisor + "}";
    }
}
