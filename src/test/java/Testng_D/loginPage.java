package Testng_D;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginPage extends BaseSteps{
    BaseSteps bs ;
    WebDriver driver;
    PageObjects pg = new PageObjects(driver);

    @BeforeTest
    public void setup(){
        bs = new BaseSteps();
        bs.InitializeDriver();
    }
    @Test
    public void Login_f(){
        driver.get("https://https://www.flipkart.com/");
        pg.EnterEmailOrMobile();

    }




}
