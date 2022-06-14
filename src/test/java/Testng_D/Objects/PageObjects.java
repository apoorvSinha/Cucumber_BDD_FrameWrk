package Testng_D.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
    public WebDriver ldriver;

    public PageObjects(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='Password']")
    @CacheLookup
    WebElement txtPwd;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    @CacheLookup
    WebElement txtLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement linkLogout;


    public void setUserName(String uName) {
        txtEmail.clear();
        txtEmail.sendKeys(uName);
    }

    public void setPassword(String pwd) {
        txtPwd.clear();
        txtPwd.sendKeys(pwd);
    }

    public void clickLogin() {
        txtLogin.click();
    }

    public void clickLogout() {
        linkLogout.click();
    }

}
