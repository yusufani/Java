package Backend.Context;

public class KisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi
{
    public KisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi() {
    }

    private  String [] silmeYontemleri, yokEtmeYontemleri,anonimlestirmeYontemleri;

    public String[] getSilmeYontemleri() {
        return silmeYontemleri;
    }

    public void setSilmeYontemleri(String[] silmeYontemleri) {
        this.silmeYontemleri = silmeYontemleri;
    }

    public String[] getYokEtmeYontemleri() {
        return yokEtmeYontemleri;
    }

    public void setYokEtmeYontemleri(String[] yokEtmeYontemleri) {
        this.yokEtmeYontemleri = yokEtmeYontemleri;
    }

    public String[] getAnonimlestirmeYontemleri() {
        return anonimlestirmeYontemleri;
    }

    public void setAnonimlestirmeYontemleri(String[] anonimlestirmeYontemleri) {
        this.anonimlestirmeYontemleri = anonimlestirmeYontemleri;
    }

    public KisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi(String[] silmeYontemleri, String[] yokEtmeYontemleri, String[] anonimlestirmeYontemleri) {
        this.silmeYontemleri = silmeYontemleri;
        this.yokEtmeYontemleri = yokEtmeYontemleri;
        this.anonimlestirmeYontemleri = anonimlestirmeYontemleri;
    }
}
