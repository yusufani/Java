package Backend.Context;

public class Surec {
    private  String []  kisiselVerisiIslenenKisi,kisiselVerininToplanmaYontemi;
    private String isSureci,veriIsletmeFaaliyetininAciklanmasi;
    private final static String veriIslemeninHukukiNedeni = "";
    public Surec(String isSureci, String veriIsletmeFaaliyetininAciklanmasi, String[] kisiselVerisiIslenenKisi, String[] kisiselVerininToplanmaYontemi) {
        this.isSureci = isSureci;
        this.veriIsletmeFaaliyetininAciklanmasi = veriIsletmeFaaliyetininAciklanmasi;
        this.kisiselVerisiIslenenKisi = kisiselVerisiIslenenKisi;
        this.kisiselVerininToplanmaYontemi = kisiselVerininToplanmaYontemi;
    }

    public Surec() {
    }

    public String getIsSureci() {
        return isSureci;
    }

    public void setIsSureci(String isSureci) {
        this.isSureci = isSureci;
    }

    public String getVeriIsletmeFaaliyetininAciklanmasi() {
        return veriIsletmeFaaliyetininAciklanmasi;
    }

    public void setVeriIsletmeFaaliyetininAciklanmasi(String veriIsletmeFaaliyetininAciklanmasi) {
        this.veriIsletmeFaaliyetininAciklanmasi = veriIsletmeFaaliyetininAciklanmasi;
    }

    public String[] getKisiselVerisiIslenenKisi() {
        return kisiselVerisiIslenenKisi;
    }

    public void setKisiselVerisiIslenenKisi(String[] kisiselVerisiIslenenKisi) {
        this.kisiselVerisiIslenenKisi = kisiselVerisiIslenenKisi;
    }

    public String[] getKisiselVerininToplanmaYontemi() {
        return kisiselVerininToplanmaYontemi;
    }

    public void setKisiselVerininToplanmaYontemi(String[] kisiselVerininToplanmaYontemi) {
        this.kisiselVerininToplanmaYontemi = kisiselVerininToplanmaYontemi;
    }
}
