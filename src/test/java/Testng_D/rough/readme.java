package Testng_D.rough;

import Utilities_testng.ExcelReader;

public class readme {
    public static void main(String[] args) {
        ExcelReader excelReader = new ExcelReader("./src/test/java/Testng_D/DataFetcher/Credentials.xlsx");
        String sheetName = "login";
        if(excelReader.isSheetExist(sheetName)){
            int rowNum = excelReader.getRowCount(sheetName);
            int colNum = excelReader.getColumnCount(sheetName);
            for(int i=0; i<rowNum; i++){
                for(int j=0; j< colNum; j++){
                    String res = excelReader.getCellData(sheetName, i ,j);
                    System.out.println(excelReader.getCellData(sheetName, i, j)+ "----");
                }
            }
        }
    }
}
