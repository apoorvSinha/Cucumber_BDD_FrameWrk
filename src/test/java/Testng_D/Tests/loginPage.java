package Testng_D.Tests;

import Testng_D.BaseSteps.BaseSteps;
import Testng_D.DataFetcher.fetcher;
import Testng_D.Objects.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class loginPage {
    WebDriver driver = null;
    BaseSteps bs ;
    PageObjects pg;
    fetcher fetch;
    @BeforeMethod
    public void setup(){
        bs = new BaseSteps();
        driver = bs.InitializeDriver();
        pg = new PageObjects(driver);
    }
    @Test
    public void Login_f(){
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        fetch = new fetcher();
        String[][] gm = fetch.FetchData("./src/test/java/Testng_D/DataFetcher/Credentials.xlsx", "login", 2, 2);


    }

}
