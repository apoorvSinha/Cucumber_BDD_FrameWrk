package pageObjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class manufacture_add_f {
    //navigation
    @FindBy(xpath = "//a//p[contains(text(),'Catalog')]")
    WebElement Catalog_MainPage;
    @FindBy(xpath = "//a//p[contains(text(),' Manufacturers')]")
    WebElement Manufacturer_sub_page;

    //manufacture info
    @FindBy(linkText = "Add new")
    WebElement Add_new_Manufacturer;
    @FindBy(xpath = "//div[@class='onoffswitch']//input")
    WebElement ModeSelected;
    @FindBy(xpath = "//input[@name='Name']")
    WebElement Name;
    //switch frame here
    @FindBy(xpath = "//body[@id='tinymce']")
    WebElement ManufacturerDescription;

    //display info
    @FindBy(xpath = "//input[@id='AllowCustomersToSelectPageSize']")
    WebElement CustomPageSizeAllowed;
    @FindBy(xpath = "//*[@id=\"nestedSetting2052218932\"]/div[1]/div[2]/span[1]/span/input[1]")
    WebElement PriceFromNotClicked;
    @FindBy(xpath = "//input[@id='PriceFrom']")
    WebElement PriceFromClicked;
    @FindBy(xpath = "//*[@id=\"nestedSetting2052218932\"]/div[2]/div[2]/span[1]/span/input[1]")
    WebElement PriceToNotClicked;
    @FindBy(xpath = "//input[@id='PriceTo']")
    WebElement PriceToClicked;
    @FindBy(xpath = "//input[@id='DisplayOrder']")
    WebElement DisplayOrder;

    //mappings set


}
