package Testng_D;

import Testng_D.BaseSteps.BaseSteps;
import Testng_D.Objects.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginPage {
    WebDriver driver = null;
    BaseSteps bs ;
    PageObjects pg;
    @BeforeMethod
    public void setup(){
        bs = new BaseSteps();
        driver = bs.InitializeDriver();
        pg = new PageObjects(driver);
        driver.get("https://www.google.co.in");
    }
    @Test
    public void Login_f(){
        driver.get("https://www.bing.com/");
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        pg.clickLogin();

    }

}
