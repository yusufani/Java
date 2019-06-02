package Backend.Context;

public class Organizasyon {
    private  String   DirektorkukIsmı;
    private String   DepartmanIsmi;
    private  String  BilgiGirisiYapanKisi;

    public Organizasyon() {
    }

    public Organizasyon(String direktorkukIsmı, String departmanIsmi, String bilgiGirisiYapanKisi) {
        DirektorkukIsmı = direktorkukIsmı;
        DepartmanIsmi = departmanIsmi;
        BilgiGirisiYapanKisi = bilgiGirisiYapanKisi;
    }

    public String getDirektorkukIsmı() {
        return DirektorkukIsmı;
    }

    public void setDirektorkukIsmı(String direktorkukIsmı) {
        DirektorkukIsmı = direktorkukIsmı;
    }

    public String getDepartmanIsmi() {
        return DepartmanIsmi;
    }

    public void setDepartmanIsmi(String departmanIsmi) {
        DepartmanIsmi = departmanIsmi;
    }

    public String getBilgiGirisiYapanKisi() {
        return BilgiGirisiYapanKisi;
    }

    public void setBilgiGirisiYapanKisi(String bilgiGirisiYapanKisi) {
        BilgiGirisiYapanKisi = bilgiGirisiYapanKisi;
    }
}
