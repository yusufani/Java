package Test;

import Backend.Output.Excel;

public class Test {
    public static void main(String[] args) {
        Excel excel = Excel.getInstance();

        excel.writeToExcel();
    }
}
