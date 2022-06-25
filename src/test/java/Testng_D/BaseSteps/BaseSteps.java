package Testng_D.BaseSteps;

import Testng_D.Objects.LoginObjects;
import Utilities.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseSteps {
    public ExcelReader excelReader;
    public LoginObjects loginobjects;

    @BeforeSuite
    public void setup(){

    }
}
