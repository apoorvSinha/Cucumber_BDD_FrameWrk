package Testng_D.Objects;

import Testng_D.base_steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LogsObjects extends BaseSteps{
    static WebDriver driver;

    public LogsObjects(WebDriver driver){
        LogsObjects.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//li//a//p[contains(text(),'System')]")
    static
    WebElement SystemMainMenu;
    @FindBy(xpath = "//a//p[contains(text(),'Log')]")
    static
    WebElement LogSubMenu;
    @FindBy(xpath = "//*[@id=\"LogLevelId\"]")
    static
    WebElement SelectLoglevel;
    @FindBy(xpath = "//*[@id=\"search-log\"]")
    static
    WebElement SearchButton;
    @FindBy(xpath = "//*[@id=\"log-grid_next\"]/a/i")
    static
    WebElement NextButton;
    @FindBy(xpath = "//table//tr//td[3]")
    static
    List<WebElement> logMessages;


    public static void ClickSystemMainMenu(){
        SystemMainMenu.click();
    }


    public static void ClickLogsSubMenu(){
        LogSubMenu.click();
    }
    public static void ClickLogLevel(String lg_level){
        Select slc = new Select(SelectLoglevel);
        if(lg_level.equalsIgnoreCase("warning")){
            slc.selectByVisibleText("Warning");
        }
        else if(lg_level.equalsIgnoreCase("Debug")){
            slc.selectByVisibleText("Debug");
        }
        else if(lg_level.equalsIgnoreCase("Information")){
            slc.selectByVisibleText("Information");
        }
        else if(lg_level.equalsIgnoreCase("Error")){
            slc.selectByVisibleText("Error");
        }
        else if(lg_level.equalsIgnoreCase("Fatal")){
            slc.selectByVisibleText("Fatal");
        }

    }
    public static void getAllMessages(){
        int msg_number = 1;
        for(WebElement logMessage : logMessages){
            System.out.println("message "+msg_number+" is: "+logMessage.getText());
            msg_number++;
        }
    }


    public static void ClickSearchButton(){
        SearchButton.click();
    }
    public static void ClickNextButton() throws InterruptedException {
        while(BaseSteps.NextPageControl(driver.findElement(By.xpath("//div[@class='dataTables_info']")))){
            NextButton.click();
            Thread.sleep(5000);
            getAllMessages();
        }
    }
}
