package Backend.Context;

public class VerilerinYurtIcineAktarimi {
    private  String [] verilerinYurtIcindePaylasildigiAliciGruplar, yurticindekiAliciGruplariIlePaylasimAmaclariNedir, kisiselVerilerinPaylasimindaKullanilanMethod, KisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;

    public VerilerinYurtIcineAktarimi() {
    }

    public VerilerinYurtIcineAktarimi(String[] verilerinYurtIcindePaylasildigiAliciGruplar, String[] yurticindekiAliciGruplariIlePaylasimAmaclariNedir, String[] kisiselVerilerinPaylasimindaKullanilanMethod, String[] kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri) {
        this.verilerinYurtIcindePaylasildigiAliciGruplar = verilerinYurtIcindePaylasildigiAliciGruplar;
        this.yurticindekiAliciGruplariIlePaylasimAmaclariNedir = yurticindekiAliciGruplariIlePaylasimAmaclariNedir;
        this.kisiselVerilerinPaylasimindaKullanilanMethod = kisiselVerilerinPaylasimindaKullanilanMethod;
        KisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri = kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;
    }

    public String[] getVerilerinYurtIcindePaylasildigiAliciGruplar() {
        return verilerinYurtIcindePaylasildigiAliciGruplar;
    }

    public void setVerilerinYurtIcindePaylasildigiAliciGruplar(String[] verilerinYurtIcindePaylasildigiAliciGruplar) {
        this.verilerinYurtIcindePaylasildigiAliciGruplar = verilerinYurtIcindePaylasildigiAliciGruplar;
    }

    public String[] getYurticindekiAliciGruplariIlePaylasimAmaclariNedir() {
        return yurticindekiAliciGruplariIlePaylasimAmaclariNedir;
    }

    public void setYurticindekiAliciGruplariIlePaylasimAmaclariNedir(String[] yurticindekiAliciGruplariIlePaylasimAmaclariNedir) {
        this.yurticindekiAliciGruplariIlePaylasimAmaclariNedir = yurticindekiAliciGruplariIlePaylasimAmaclariNedir;
    }

    public String[] getKisiselVerilerinPaylasimindaKullanilanMethod() {
        return kisiselVerilerinPaylasimindaKullanilanMethod;
    }

    public void setKisiselVerilerinPaylasimindaKullanilanMethod(String[] kisiselVerilerinPaylasimindaKullanilanMethod) {
        this.kisiselVerilerinPaylasimindaKullanilanMethod = kisiselVerilerinPaylasimindaKullanilanMethod;
    }

    public String[] getKisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri() {
        return KisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;
    }

    public void setKisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri(String[] kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri) {
        KisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri = kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;
    }
}
