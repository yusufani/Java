package Backend.Context;

public class VeriMaskeleme {
    private String [] maskelemeGerceklesiyorMu,maskelemeKosullariVeYontemleri;

    public String[] getMaskelemeGerceklesiyorMu() {
        return maskelemeGerceklesiyorMu;
    }

    public VeriMaskeleme() {
    }

    public void setMaskelemeGerceklesiyorMu(String[] maskelemeGerceklesiyorMu) {
        this.maskelemeGerceklesiyorMu = maskelemeGerceklesiyorMu;
    }

    public String[] getMaskelemeKosullariVeYontemleri() {
        return maskelemeKosullariVeYontemleri;
    }

    public void setMaskelemeKosullariVeYontemleri(String[] maskelemeKosullariVeYontemleri) {
        this.maskelemeKosullariVeYontemleri = maskelemeKosullariVeYontemleri;
    }

    public VeriMaskeleme(String[] maskelemeGerceklesiyorMu, String[] maskelemeKosullariVeYontemleri) {
        this.maskelemeGerceklesiyorMu = maskelemeGerceklesiyorMu;
        this.maskelemeKosullariVeYontemleri = maskelemeKosullariVeYontemleri;
    }
}
