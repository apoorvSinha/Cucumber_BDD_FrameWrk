package Utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class utility_excel {
    //https://www.geeksforgeeks.org/collections-in-java-2/
    public static HashMap<String, String> ExternalDataFetcher() throws IOException {
        File fl = new File("src/test/java/Utils_loc/data.xlsx");
        FileInputStream fis= null;
        try {
            fis = new FileInputStream(fl);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found at location");
        }
        String labels= null;
        String values =null;

        //using hashmap to get key value pair from data sheet

        HashMap<String, String> hm = new HashMap<String, String>();
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Product_info");
        for(int i=0; i< 14; i++){
            XSSFRow row = sheet.getRow(i);
            for (int j=0; j<2; j++ ){
                XSSFCell cell = row.getCell(j);
                if(j==0){
                    labels = cell.getStringCellValue();
                }
                else {
                    values = cell.getStringCellValue();
                }
                hm.put(labels, values);
            }

        }
        return hm;
    }
}
