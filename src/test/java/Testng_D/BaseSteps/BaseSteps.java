package Testng_D.BaseSteps;

import Testng_D.Objects.LoginObjects;
import Utilities_testng.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseSteps {
    public ExcelReader excelReader;
    Properties OR = new Properties();
    FileInputStream fis;
    public WebDriver driver;
    public LoginObjects loginobjects;

    @BeforeSuite
    public void setup(){
        //loading object repository
        try{
            fis = new FileInputStream("./src/test/resources/ObjectRepository/OR.properties");
            OR.load(fis);
        }catch(IOException E){
            E.printStackTrace();
        }

        if(driver==null){
            //initiating edge driver as execution environment
            String browser = "edge";
            if(browser.equalsIgnoreCase(OR.getProperty("Edgebrowser"))){
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }
        }
    }

    @AfterSuite
    public void TearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
