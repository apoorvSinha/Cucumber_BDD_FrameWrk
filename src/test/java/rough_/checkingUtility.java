package rough_;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class checkingUtility {
    public static void main(String[] args) {
        String[][] result = FetchData("./src/test/java/Testng_D/DataFetcher/Credentials.xlsx", "login", 2, 2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
        }

    }


    public static String[][] FetchData(String path, String sheetName, int rowNum, int colNum) {
        String[][] valuesNHead = new String[0][];
        try {
            File f = new File(path);
            FileInputStream fis = new FileInputStream(f);
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            valuesNHead = new String[rowNum][colNum];

            for (int i = 0; i < rowNum; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colNum; j++) {
                    Cell cell = row.getCell(j);
                    valuesNHead[i][j] = cell.getStringCellValue();
                }
            }
        } catch (Exception r) {
            System.out.println("File ni mil rahi");
        }
        return valuesNHead;
    }
}
