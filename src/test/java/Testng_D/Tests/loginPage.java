package Testng_D.Tests;

import Testng_D.BaseSteps.BaseSteps;
import Testng_D.DataFetcher.fetcher;
import Testng_D.Objects.LoginObjects;
import Utilities.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginPage extends BaseSteps{
    WebDriver driver = null;
    @Test(dataProvider = "getCredentials")
    public void Login_f(String userName, String password){
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        loginobjects = new LoginObjects(driver);
        loginobjects.setUserName(userName);
        loginobjects.setPassword(password);
        loginobjects.clickLogin();
    }

    @DataProvider
    public Object[][] getCredentials(){
        excelReader = new ExcelReader("./src/test/java/Testng_D/DataFetcher/Credentials.xlsx");
        String sheetName = "login";
        if(excelReader.isSheetExist(sheetName)){
            int rowNum = excelReader.getRowCount(sheetName);
            int colNum = excelReader.getColumnCount(sheetName);
            Object[][] data = new Object[rowNum][colNum];
            for(int i=1; i<rowNum; i++){
                for(int j=0; j< colNum; j++){
                    data[i-1][j] = excelReader.getCellData(sheetName, i, j);
                }
            }
            return data;
        }
        else return null;
    }

}
