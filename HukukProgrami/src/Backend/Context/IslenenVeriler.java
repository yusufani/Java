package Backend.Context;

public class IslenenVeriler {
    private  String []islenenVeriler,islenenKisiselVeriKategorisi,islenenOzelNitelikliKisiselVeriKategorisi;
    private int rowCount;

    public IslenenVeriler() {
    }

    public IslenenVeriler(String[] islenenVeriler, String[] islenenKisiselVeriKategorisi, String[] islenenOzelNitelikliKisiselVeriKategorisi, int rowCount) {
        this.islenenVeriler = islenenVeriler;
        this.islenenKisiselVeriKategorisi = islenenKisiselVeriKategorisi;
        this.islenenOzelNitelikliKisiselVeriKategorisi = islenenOzelNitelikliKisiselVeriKategorisi;
        this.rowCount = rowCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public IslenenVeriler(String[] islenenVeriler, String[] islenenKisiselVeriKategorisi, String[] islenenOzelNitelikliKisiselVeriKategorisi) {
        this.islenenVeriler = islenenVeriler;
        this.islenenKisiselVeriKategorisi = islenenKisiselVeriKategorisi;
        this.islenenOzelNitelikliKisiselVeriKategorisi = islenenOzelNitelikliKisiselVeriKategorisi;
    }

    public String[] getIslenenVeriler() {
        return islenenVeriler;
    }

    public void setIslenenVeriler(String[] islenenVeriler) {
        this.islenenVeriler = islenenVeriler;
    }

    public String[] getIslenenKisiselVeriKategorisi() {
        return islenenKisiselVeriKategorisi;
    }

    public void setIslenenKisiselVeriKategorisi(String[] islenenKisiselVeriKategorisi) {
        this.islenenKisiselVeriKategorisi = islenenKisiselVeriKategorisi;
    }

    public String[] getIslenenOzelNitelikliKisiselVeriKategorisi() {
        return islenenOzelNitelikliKisiselVeriKategorisi;
    }

    public void setIslenenOzelNitelikliKisiselVeriKategorisi(String[] islenenOzelNitelikliKisiselVeriKategorisi) {
        this.islenenOzelNitelikliKisiselVeriKategorisi = islenenOzelNitelikliKisiselVeriKategorisi;
    }
}
