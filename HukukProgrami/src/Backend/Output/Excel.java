package Backend.Output;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Excel {
    public static final String EXCELNAME="Envanter2.xlsx";
    public  static int LASTROW=7;
    private int currentRow;
    private static Excel excel=null;
    private XSSFWorkbook wb ;
    private XSSFSheet envanter;
    public static Excel getInstance(){
        if(excel == null ){
            excel = new Excel();
        }
        return excel;
    }

    public Excel() {

        FileInputStream myxls = null;
        try {
            myxls = new FileInputStream(EXCELNAME);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            wb=new XSSFWorkbook(myxls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        envanter = wb.getSheetAt(0);
        currentRow=envanter.getLastRowNum();

    }
    public void writeToExcel ()  {
        System.out.println(currentRow);
        Row row = envanter.createRow(++currentRow);




        try  (OutputStream fileOut = new FileOutputStream(EXCELNAME)) {
            wb.write(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




        try {
            wb.close() ; // KAPAMAYI UNUTMA
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
