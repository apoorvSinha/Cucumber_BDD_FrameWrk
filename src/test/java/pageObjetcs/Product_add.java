package pageObjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Product_add {
    public WebDriver ldriver;
    public Product_add(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//input[@id='Name']")
    WebElement ProductName;
    @FindBy(xpath = "//textarea[@id='ShortDescription']")
    WebElement ShortDescription;
    @FindBy(id = "FullDescription_ifr")
    WebElement FullDescription;
    @FindBy(xpath = "//input[@id='Sku']")
    WebElement Sku;
    @FindBy(xpath = "//select[@id='SelectedCategoryIds']")
    WebElement Categories;
    @FindBy(xpath = "//input[@id='Price']")
    WebElement Price;
    @FindBy(xpath = "//input[@id='IsTaxExempt']")
    WebElement TaxExempt;
    @FindBy(xpath = "//select[@id='TaxCategoryId']")
    WebElement TaxCategory;
    @FindBy(xpath = "//input[@id='IsShipEnabled']")
    WebElement ShippingEnabled;
    @FindBy(xpath = "//input[@id='Weight']")
    WebElement Weight;
    @FindBy(xpath = "//input[@id='Length']")
    WebElement Length;
    @FindBy(xpath = "//input[@id='Height']")
    WebElement Height;
    @FindBy(xpath = "//select[@id='ManageInventoryMethodId']")
    WebElement inventoryMethod;

}
