package Testng_D.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
    public static void main(String[] args) throws IOException {
//		for(String str: getData("login")){
//			System.out.println(str);
//		}
        for(int i=1; i< 2; i++){
            for(int j=1; j<=2; j++){
                System.out.println(getData("login").get(i+j));
            }
        }
    }

    public static ArrayList<String> getData(String sheetName) throws IOException {

        File f = new File("./src/test/java/Testng_D/DataFetcher/Credentials.xlsx");
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        ArrayList<String> a = new ArrayList<String>();

        // GET Sheet with the name
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                XSSFSheet sheet = workbook.getSheetAt(i); // getting data sheet
                Iterator<Row> rows = sheet.iterator(); // iterate through each row
                while (rows.hasNext()) {
                    Row r = rows.next();
                    Iterator<Cell> iterator = r.cellIterator();
                    while (iterator.hasNext()) {
                        Cell cell = iterator.next();
                        if (cell.getCellType() == CellType.STRING) {
                            a.add(cell.getStringCellValue());
                        } else if (cell.getCellType() == CellType.NUMERIC) {
                            a.add(String.valueOf(cell.getNumericCellValue()));
                        }
                    }
                }
            }

        }

        return a;

    }

}
