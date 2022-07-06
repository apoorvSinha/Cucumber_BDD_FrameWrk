package Testng_D.base_steps;

import Testng_D.Objects.LoginObjects;
import Testng_D.Objects.LogsObjects;
import Utilities_testng.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public LoginObjects loginobjects ;
    public LogsObjects logs ;

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
            String browser = "chrome";
            if(browser.equalsIgnoreCase(OR.getProperty("Chromebrowser"))){
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();
                driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
            }
        }
    }

    @AfterSuite
    public void TearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    public static boolean NextPageControl(WebElement elem){
        boolean flag = false;
        String page = elem.getText();
        String[] page_str = page.split("[ -]");

        if (Integer.parseInt(page_str[1]) < Integer.parseInt(page_str[3])){
            flag = true;
        }

        return flag;

    }
}
