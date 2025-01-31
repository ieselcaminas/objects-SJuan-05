package EjerciciosPOO.Ejercicio5;

public class Sucursal {
    private int n_suc;
    private String localizacion;
    private Banco banco;

    public Sucursal(int n_suc, String localizacion , Banco banco) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.banco = banco;
    }

    public int getN_suc() {
        return n_suc;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getLocalizacion() {
        return localizacion;
    }
    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    @Override
    public String toString() {
        return "Sucursal {" + " Número de Sucursal = " + n_suc + " }";
    }
}
