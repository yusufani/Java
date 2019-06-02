package Backend.Context;

public class Yedekleme {
    private   String []kisiselVerilerNeTurBirYedeklemeYapisinaDahildir,kisiselVerileriYedeklemePeriyodu,kisiselVeriYedeklerininTutulduguMedya;

    public Yedekleme() {
    }

    public String[] getKisiselVerilerNeTurBirYedeklemeYapisinaDahildir() {
        return kisiselVerilerNeTurBirYedeklemeYapisinaDahildir;
    }

    public void setKisiselVerilerNeTurBirYedeklemeYapisinaDahildir(String[] kisiselVerilerNeTurBirYedeklemeYapisinaDahildir) {
        this.kisiselVerilerNeTurBirYedeklemeYapisinaDahildir = kisiselVerilerNeTurBirYedeklemeYapisinaDahildir;
    }

    public String[] getKisiselVerileriYedeklemePeriyodu() {
        return kisiselVerileriYedeklemePeriyodu;
    }

    public void setKisiselVerileriYedeklemePeriyodu(String[] kisiselVerileriYedeklemePeriyodu) {
        this.kisiselVerileriYedeklemePeriyodu = kisiselVerileriYedeklemePeriyodu;
    }

    public String[] getKisiselVeriYedeklerininTutulduguMedya() {
        return kisiselVeriYedeklerininTutulduguMedya;
    }

    public void setKisiselVeriYedeklerininTutulduguMedya(String[] kisiselVeriYedeklerininTutulduguMedya) {
        this.kisiselVeriYedeklerininTutulduguMedya = kisiselVeriYedeklerininTutulduguMedya;
    }

    public Yedekleme(String[] kisiselVerilerNeTurBirYedeklemeYapisinaDahildir, String[] kisiselVerileriYedeklemePeriyodu, String[] kisiselVeriYedeklerininTutulduguMedya) {
        this.kisiselVerilerNeTurBirYedeklemeYapisinaDahildir = kisiselVerilerNeTurBirYedeklemeYapisinaDahildir;
        this.kisiselVerileriYedeklemePeriyodu = kisiselVerileriYedeklemePeriyodu;
        this.kisiselVeriYedeklerininTutulduguMedya = kisiselVeriYedeklerininTutulduguMedya;
    }
}
