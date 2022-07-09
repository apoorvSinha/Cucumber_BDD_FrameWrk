package Testng_D.Objects;

import Testng_D.base_steps.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects extends BaseSteps {
    WebDriver driver;
    public LoginObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='Email']")
    @CacheLookup
    static WebElement txtEmail;

    @FindBy(xpath = "//input[@id='Password']")
    @CacheLookup
    static
    WebElement txtPwd;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    @CacheLookup
    static
    WebElement txtLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    static
    WebElement linkLogout;


    public static void setUserName(String uName) {
        txtEmail.clear();
        txtEmail.sendKeys(uName);
    }

    public static void setPassword(String pwd) {
        txtPwd.clear();
        txtPwd.sendKeys(pwd);
    }

    public static void clickLogin() {
        txtLogin.click();
    }

    public static void clickLogout() {
        linkLogout.click();
    }

}
