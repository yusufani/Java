package Backend.Context;

public class Teknoloji {
    private  String [] politikaOnerileri,guvenlikOnerileri;

    public Teknoloji() {
    }

    public String[] getPolitikaOnerileri() {
        return politikaOnerileri;
    }

    public void setPolitikaOnerileri(String[] politikaOnerileri) {
        this.politikaOnerileri = politikaOnerileri;
    }

    public String[] getGuvenlikOnerileri() {
        return guvenlikOnerileri;
    }

    public void setGuvenlikOnerileri(String[] guvenlikOnerileri) {
        this.guvenlikOnerileri = guvenlikOnerileri;
    }

    public Teknoloji(String[] politikaOnerileri, String[] guvenlikOnerileri) {
        this.politikaOnerileri = politikaOnerileri;
        this.guvenlikOnerileri = guvenlikOnerileri;
    }
}
