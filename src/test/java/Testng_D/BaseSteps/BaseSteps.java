package Testng_D.BaseSteps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseSteps {

    protected WebDriver driver;
    public WebDriver InitializeDriver(){
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
       }
        return driver;
    }
}
