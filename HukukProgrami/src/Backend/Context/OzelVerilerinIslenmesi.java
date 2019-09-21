package Backend.Context;

import java.util.HashMap;

public class OzelVerilerinIslenmesi {
    private int rowCount;

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public void setOzelIslenenVeriler(HashMap<String, String> ozelIslenenVeriler) {
        this.ozelIslenenVeriler = ozelIslenenVeriler;
        if(ozelIslenenVeriler.size()>rowCount) rowCount=ozelIslenenVeriler.size();
    }

    public HashMap<String, String> getOzelIslenenVeriler() {
        return ozelIslenenVeriler;
    }

    public OzelVerilerinIslenmesi() {
    }

    private HashMap<String,String> ozelIslenenVeriler=new HashMap<>();
    @Override
    public String toString() {
        return "Ozel Islenen veriler yazdiriliyor \n " + getOzelIslenenVeriler()  + "\n";
    }
}
