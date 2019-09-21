package Backend.Context;

public class Amac {
    private String [] IslemeAmaci;

    public Amac() {
    }

    public String[] getIslemeAmaci() {
        return IslemeAmaci;
    }

    public void setIslemeAmaci(String[] islemeAmaci) {
        IslemeAmaci = islemeAmaci;
    }

    public Amac(String[] islemeAmaci) {
        IslemeAmaci = islemeAmaci;
    }

    @Override
    public String toString() {
        return "Amaclar yazdırılıyor : \n"+getIslemeAmaci()+"\n";
    }
}
