package Backend.Context;

public class RiskDegerlendirme {
    private  String [] ilgiliKisiselVerilerIcinRiskler,riskTanimi,riskinEtkiDegeri,riskinOlmaOlasiligi,riskDegeri;

    public RiskDegerlendirme() {
    }

    public String[] getIlgiliKisiselVerilerIcinRiskler() {
        return ilgiliKisiselVerilerIcinRiskler;
    }

    public void setIlgiliKisiselVerilerIcinRiskler(String[] ilgiliKisiselVerilerIcinRiskler) {
        this.ilgiliKisiselVerilerIcinRiskler = ilgiliKisiselVerilerIcinRiskler;
    }

    public String[] getRiskTanimi() {
        return riskTanimi;
    }

    public void setRiskTanimi(String[] riskTanimi) {
        this.riskTanimi = riskTanimi;
    }

    public String[] getRiskinEtkiDegeri() {
        return riskinEtkiDegeri;
    }

    public void setRiskinEtkiDegeri(String[] riskinEtkiDegeri) {
        this.riskinEtkiDegeri = riskinEtkiDegeri;
    }

    public String[] getRiskinOlmaOlasiligi() {
        return riskinOlmaOlasiligi;
    }

    public void setRiskinOlmaOlasiligi(String[] riskinOlmaOlasiligi) {
        this.riskinOlmaOlasiligi = riskinOlmaOlasiligi;
    }

    public String[] getRiskDegeri() {
        return riskDegeri;
    }

    public void setRiskDegeri(String[] riskDegeri) {
        this.riskDegeri = riskDegeri;
    }

    public RiskDegerlendirme(String[] ilgiliKisiselVerilerIcinRiskler, String[] riskTanimi, String[] riskinEtkiDegeri, String[] riskinOlmaOlasiligi, String[] riskDegeri) {
        this.ilgiliKisiselVerilerIcinRiskler = ilgiliKisiselVerilerIcinRiskler;
        this.riskTanimi = riskTanimi;
        this.riskinEtkiDegeri = riskinEtkiDegeri;
        this.riskinOlmaOlasiligi = riskinOlmaOlasiligi;
        this.riskDegeri = riskDegeri;
    }
}
