package Testng_D.Tests;

import Testng_D.base_steps.BaseSteps;
import Testng_D.Objects.LoginObjects;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class LoginPage extends BaseSteps{
    public LoginPage lp;
    public LoginPage(){
        this.lp = new LoginObjects(WebDriver driver);
        PageFactory.initElements(driver, this.lp);
    }
    @Test(dataProvider = "getCredentials", priority = 1)
    public void Login_f(String userName, String password){
        loginobjects.setUserName(userName);
        loginobjects.setPassword(password);
        loginobjects.clickLogin();
    }

    @DataProvider
    public Object[][] getCredentials() throws IOException {
        String sheetName = "login";
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
        Object[][] data = new Object[1][2];
        //to remove first 2 data for headings
        for(int i=1; i< 2; i++){
            for(int j=1; j<=2; j++){
                data[i-1][j-1] = a.get(i+j);
            }
        }
        return data;

    }

}
