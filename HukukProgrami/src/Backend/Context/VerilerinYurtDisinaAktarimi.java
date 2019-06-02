package Backend.Context;

public class VerilerinYurtDisinaAktarimi {
    private  String []verilerinYurtDisindaPaylasildigiAliciGruplar, verilerinYurtdisinaAktarildigiUlke,yurtdisindakiAliciGruplariIlePaylasimAmaciNedir, kisiselVerilerinPaylasimindaKullanilanMethod,kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;

    public VerilerinYurtDisinaAktarimi() {
    }

    public String[] getVerilerinYurtDisindaPaylasildigiAliciGruplar() {
        return verilerinYurtDisindaPaylasildigiAliciGruplar;
    }

    public void setVerilerinYurtDisindaPaylasildigiAliciGruplar(String[] verilerinYurtDisindaPaylasildigiAliciGruplar) {
        this.verilerinYurtDisindaPaylasildigiAliciGruplar = verilerinYurtDisindaPaylasildigiAliciGruplar;
    }

    public String[] getVerilerinYurtdisinaAktarildigiUlke() {
        return verilerinYurtdisinaAktarildigiUlke;
    }

    public void setVerilerinYurtdisinaAktarildigiUlke(String[] verilerinYurtdisinaAktarildigiUlke) {
        this.verilerinYurtdisinaAktarildigiUlke = verilerinYurtdisinaAktarildigiUlke;
    }

    public String[] getYurtdisindakiAliciGruplariIlePaylasimAmaciNedir() {
        return yurtdisindakiAliciGruplariIlePaylasimAmaciNedir;
    }

    public void setYurtdisindakiAliciGruplariIlePaylasimAmaciNedir(String[] yurtdisindakiAliciGruplariIlePaylasimAmaciNedir) {
        this.yurtdisindakiAliciGruplariIlePaylasimAmaciNedir = yurtdisindakiAliciGruplariIlePaylasimAmaciNedir;
    }

    public String[] getKisiselVerilerinPaylasimindaKullanilanMethod() {
        return kisiselVerilerinPaylasimindaKullanilanMethod;
    }

    public void setKisiselVerilerinPaylasimindaKullanilanMethod(String[] kisiselVerilerinPaylasimindaKullanilanMethod) {
        this.kisiselVerilerinPaylasimindaKullanilanMethod = kisiselVerilerinPaylasimindaKullanilanMethod;
    }

    public String[] getKisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri() {
        return kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;
    }

    public void setKisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri(String[] kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri) {
        this.kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri = kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;
    }

    public VerilerinYurtDisinaAktarimi(String[] verilerinYurtDisindaPaylasildigiAliciGruplar, String[] verilerinYurtdisinaAktarildigiUlke, String[] yurtdisindakiAliciGruplariIlePaylasimAmaciNedir, String[] kisiselVerilerinPaylasimindaKullanilanMethod, String[] kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri) {
        this.verilerinYurtDisindaPaylasildigiAliciGruplar = verilerinYurtDisindaPaylasildigiAliciGruplar;
        this.verilerinYurtdisinaAktarildigiUlke = verilerinYurtdisinaAktarildigiUlke;
        this.yurtdisindakiAliciGruplariIlePaylasimAmaciNedir = yurtdisindakiAliciGruplariIlePaylasimAmaciNedir;
        this.kisiselVerilerinPaylasimindaKullanilanMethod = kisiselVerilerinPaylasimindaKullanilanMethod;
        this.kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri = kisiselVerilerinAktarimiIcinAlinmisOlanGuvenlikOnlemleri;
    }
}
