package Backend.Context;

public class VeriSaklamaVeGuvenlik {
    private  String [] surecleIlgiliOlarakDokumanlar, fiilenNeKadarSure,neKadarSure,mevzuataDayanarakSaklanıyorsa,kayitlarinTutulduguAlanlar,KisiselVerilereErisebilenKisiler,KisiselVerilerinGuvenligiIcinAlinanTedbirler, kisiselVerisiIslenenKisiyeAydinlatma;

    public VeriSaklamaVeGuvenlik() {
    }

    public String[] getSurecleIlgiliOlarakDokumanlar() {
        return surecleIlgiliOlarakDokumanlar;
    }

    public void setSurecleIlgiliOlarakDokumanlar(String[] surecleIlgiliOlarakDokumanlar) {
        this.surecleIlgiliOlarakDokumanlar = surecleIlgiliOlarakDokumanlar;
    }

    public String[] getFiilenNeKadarSure() {
        return fiilenNeKadarSure;
    }

    public void setFiilenNeKadarSure(String[] fiilenNeKadarSure) {
        this.fiilenNeKadarSure = fiilenNeKadarSure;
    }

    public String[] getNeKadarSure() {
        return neKadarSure;
    }

    public void setNeKadarSure(String[] neKadarSure) {
        this.neKadarSure = neKadarSure;
    }

    public String[] getMevzuataDayanarakSaklanıyorsa() {
        return mevzuataDayanarakSaklanıyorsa;
    }

    public void setMevzuataDayanarakSaklanıyorsa(String[] mevzuataDayanarakSaklanıyorsa) {
        this.mevzuataDayanarakSaklanıyorsa = mevzuataDayanarakSaklanıyorsa;
    }

    public String[] getKayitlarinTutulduguAlanlar() {
        return kayitlarinTutulduguAlanlar;
    }

    public void setKayitlarinTutulduguAlanlar(String[] kayitlarinTutulduguAlanlar) {
        this.kayitlarinTutulduguAlanlar = kayitlarinTutulduguAlanlar;
    }

    public String[] getKisiselVerilereErisebilenKisiler() {
        return KisiselVerilereErisebilenKisiler;
    }

    public void setKisiselVerilereErisebilenKisiler(String[] kisiselVerilereErisebilenKisiler) {
        KisiselVerilereErisebilenKisiler = kisiselVerilereErisebilenKisiler;
    }

    public String[] getKisiselVerilerinGuvenligiIcinAlinanTedbirler() {
        return KisiselVerilerinGuvenligiIcinAlinanTedbirler;
    }

    public void setKisiselVerilerinGuvenligiIcinAlinanTedbirler(String[] kisiselVerilerinGuvenligiIcinAlinanTedbirler) {
        KisiselVerilerinGuvenligiIcinAlinanTedbirler = kisiselVerilerinGuvenligiIcinAlinanTedbirler;
    }

    public String[] getKisiselVerisiIslenenKisiyeAydinlatma() {
        return kisiselVerisiIslenenKisiyeAydinlatma;
    }

    public void setKisiselVerisiIslenenKisiyeAydinlatma(String[] kisiselVerisiIslenenKisiyeAydinlatma) {
        this.kisiselVerisiIslenenKisiyeAydinlatma = kisiselVerisiIslenenKisiyeAydinlatma;
    }

    public VeriSaklamaVeGuvenlik(String[] surecleIlgiliOlarakDokumanlar, String[] fiilenNeKadarSure, String[] neKadarSure, String[] mevzuataDayanarakSaklanıyorsa, String[] kayitlarinTutulduguAlanlar, String[] kisiselVerilereErisebilenKisiler, String[] kisiselVerilerinGuvenligiIcinAlinanTedbirler, String[] kisiselVerisiIslenenKisiyeAydinlatma) {
        this.surecleIlgiliOlarakDokumanlar = surecleIlgiliOlarakDokumanlar;
        this.fiilenNeKadarSure = fiilenNeKadarSure;
        this.neKadarSure = neKadarSure;
        this.mevzuataDayanarakSaklanıyorsa = mevzuataDayanarakSaklanıyorsa;
        this.kayitlarinTutulduguAlanlar = kayitlarinTutulduguAlanlar;
        KisiselVerilereErisebilenKisiler = kisiselVerilereErisebilenKisiler;
        KisiselVerilerinGuvenligiIcinAlinanTedbirler = kisiselVerilerinGuvenligiIcinAlinanTedbirler;
        this.kisiselVerisiIslenenKisiyeAydinlatma = kisiselVerisiIslenenKisiyeAydinlatma;
    }
}
