package Backend.Context;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Envanter {
    private Amac amac;
    private IslenenVeriler islenenVeriler;
    private KisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi kisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi;
    private Organizasyon organizasyon;
    private RiskDegerlendirme riskDegerlendirme;
    private Surec surec;
    private Teknoloji teknoloji;
    private VerilerinYurtDisinaAktarimi verilerinYurtDisinaAktarimi;
    private VerilerinYurtIcineAktarimi verilerinYurtIcineAktarimi;
    private VeriMaskeleme veriMaskeleme;
    private Yedekleme yedekleme;
    private VeriSaklamaVeGuvenlik veriSaklamaVeGuvenlik;
    private int satirSayisi =1;
    private static Envanter envanter=null;
    public static Envanter getInstance() {
        if (envanter == null){
            envanter=new Envanter();
        }
        return envanter;
    }
    public Envanter() {
        amac = new Amac();
        islenenVeriler = new IslenenVeriler();
        kisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi=new KisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi();
        organizasyon = new Organizasyon();
        riskDegerlendirme = new RiskDegerlendirme();
        surec = new Surec();
        teknoloji = new Teknoloji();
        verilerinYurtDisinaAktarimi = new VerilerinYurtDisinaAktarimi();
        verilerinYurtIcineAktarimi = new VerilerinYurtIcineAktarimi();
        veriMaskeleme = new VeriMaskeleme();
        yedekleme = new Yedekleme();
        veriSaklamaVeGuvenlik = new VeriSaklamaVeGuvenlik();


    }
public  void setSatirSayisi ( int deger ){
        if ( satirSayisi < deger){
            satirSayisi=deger;
    }
}
public int getSatirSayisi() {
        return satirSayisi;

}
    public Amac getAmac() {
        return amac;
    }

    public void setAmac(Amac amac) {
        this.amac = amac;
    }


    public IslenenVeriler getIslenenVeriler() {
        return islenenVeriler;
    }

    public void setIslenenVeriler(IslenenVeriler ıslenenVeriler) {
        this.islenenVeriler = ıslenenVeriler;
    }

    public KisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi getKisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi() {
        return kisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi;
    }

    public void setKisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi(KisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi kisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi) {
        this.kisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi = kisiselVerilerinSilinmesiYokEdilmesiveAnonimlesitirilmesi;
    }

    public Organizasyon getOrganizasyon() {
        return organizasyon;
    }

    public void setOrganizasyon(Organizasyon organizasyon) {
        this.organizasyon = organizasyon;
    }

    public RiskDegerlendirme getRiskDegerlendirme() {
        return riskDegerlendirme;
    }

    public void setRiskDegerlendirme(RiskDegerlendirme riskDegerlendirme) {
        this.riskDegerlendirme = riskDegerlendirme;
    }

    public Surec getSurec() {
        return surec;
    }

    public void setSurec(Surec surec) {
        this.surec = surec;
    }

    public Teknoloji getTeknoloji() {
        return teknoloji;
    }

    public void setTeknoloji(Teknoloji teknoloji) {
        this.teknoloji = teknoloji;
    }

    public VerilerinYurtDisinaAktarimi getVerilerinYurtDisinaAktarimi() {
        return verilerinYurtDisinaAktarimi;
    }

    public void setVerilerinYurtDisinaAktarimi(VerilerinYurtDisinaAktarimi verilerinYurtDisinaAktarimi) {
        this.verilerinYurtDisinaAktarimi = verilerinYurtDisinaAktarimi;
    }

    public VerilerinYurtIcineAktarimi getVerilerinYurtIcineAktarimi() {
        return verilerinYurtIcineAktarimi;
    }

    public void setVerilerinYurtIcineAktarimi(VerilerinYurtIcineAktarimi verilerinYurtIcineAktarimi) {
        this.verilerinYurtIcineAktarimi = verilerinYurtIcineAktarimi;
    }

    public VeriMaskeleme getVeriMaskeleme() {
        return veriMaskeleme;
    }

    public void setVeriMaskeleme(VeriMaskeleme veriMaskeleme) {
        this.veriMaskeleme = veriMaskeleme;
    }

    public Yedekleme getYedekleme() {
        return yedekleme;
    }

    public void setYedekleme(Yedekleme yedekleme) {
        this.yedekleme = yedekleme;
    }

    public VeriSaklamaVeGuvenlik getVeriSaklamaVeGuvenlik() {
        return veriSaklamaVeGuvenlik;
    }

    public void setVeriSaklamaVeGuvenlik(VeriSaklamaVeGuvenlik veriSaklamaVeGuvenlik) {
        this.veriSaklamaVeGuvenlik = veriSaklamaVeGuvenlik;
    }
}
