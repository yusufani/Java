package Backend.Context;

import java.util.HashMap;

public class IslenenVeriler {
    private HashMap<String,String> islenenVeriler=new HashMap<>();
    private int rowCount;

    public IslenenVeriler() {
    }

    public HashMap<String, String> getIslenenVeriler() {
        return islenenVeriler;
    }

    public void setIslenenVeriler(HashMap<String, String> islenenVeriler) {
        this.islenenVeriler = islenenVeriler;
        if(islenenVeriler.size()>rowCount) rowCount=islenenVeriler.size();
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public IslenenVeriler(HashMap<String, String> islenenVeriler) {
        this.islenenVeriler = islenenVeriler;
    }

    @Override
    public String toString() {
        return "Islenen veriler yazdiriliyor \n " + getIslenenVeriler() + "\n" + getIslenenVeriler() + "\n";
    }
}