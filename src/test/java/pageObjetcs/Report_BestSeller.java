package pageObjetcs;

import StepDefs.BaseSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_BestSeller {
    WebDriver ldriver;

    BaseSteps bs = new BaseSteps();

    public Report_BestSeller(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, rdriver);
    }

    @FindBy(xpath = "//li//a//p[contains(text(),'Reports')]")
    WebElement ReportMainMeu;
    @FindBy(xpath = "//li//a//p[contains(text(),' Bestsellers')]")
    WebElement BestSellerSubMenu;
    @FindBy(xpath = "//div[@class='card card-default']//div[@class='card-body']")
    WebElement getTableView;
    @FindBy(xpath = "//tbody//tr//td[1]")
    WebElement getNames;
    @FindBy(xpath = "//tbody//tr//td[3]")
    WebElement getAmount;

    public void ClickMainMenuOnReport() {
        ReportMainMeu.click();
    }

    public void CLickSubMenuReport() {
        BestSellerSubMenu.click();
    }

    public void getTableIntoView() {
        bs.js = (JavascriptExecutor) ldriver;

    }

    public void getNamesFromPage(){

    }
    public void getAmountFromPage(){

    }
}

