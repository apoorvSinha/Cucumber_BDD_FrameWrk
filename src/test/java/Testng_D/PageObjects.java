package Testng_D;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
    public WebDriver ldriver;

    public PageObjects(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(linkText = "Login")
    WebElement loginBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")   //using absolute bcoz variable IDs
    WebElement MobileOrEmail;
    @FindBy(linkText = "login")
    WebElement loginBtn2;

    public void ClickLoginBtn(){
        loginBtn.click();
    }
    public void EnterEmailOrMobile(){
        MobileOrEmail.click();
    }
    public void EnterPassword(){
        loginBtn2.click();
    }

}
