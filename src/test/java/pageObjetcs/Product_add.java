package pageObjetcs;

import Utilities.utility_excel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Product_add {
    public WebDriver ldriver;

    public Product_add(WebDriver rdriver) {
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

    public static void getValuesFromSheet() throws IOException {

        HashMap<String, String> data = utility_excel.ExternalDataFetcher();
        for (Map.Entry<String, String> e : data.entrySet()) {

        }
    }

    public void EnterProductName(String name) {
        ProductName.sendKeys(name);
    }

    public void EnterShortDiscription(String description) {
        ShortDescription.sendKeys(description);
    }

    public void EnterFullDescription(String detail_description) {
        FullDescription.sendKeys(detail_description);
    }

    public void EnterSKU(String sku) {
        Sku.sendKeys(sku);
    }

    public void SelectCategory(String category) {
        Select sl = new Select(Categories);
        switch (category) {
            case "Computers":
                sl.selectByVisibleText("Computers");
                break;
            case "Computers >> Desktops":
                sl.selectByVisibleText("Computers >> Desktops");
                break;
            case "Computers >> Notebooks":
                sl.selectByVisibleText("Computers >> Notebooks");
                break;
            case "Computers >> Software":
                sl.selectByVisibleText("Computers >> Software");
                break;
            case "Electronics":
                sl.selectByVisibleText("Electronics");
                break;
            case "Electronics >> Camera & photo":
                sl.selectByVisibleText("Electronics >> Camera & photo");
                break;
            case "Electronics >> Cell phones":
                sl.selectByVisibleText("Electronics >> Cell phones");
                break;
            case "Electronics >> Others":
                sl.selectByVisibleText("Electronics >> Others");
                break;
            case "Apparel":
                sl.selectByVisibleText("Apparel");
                break;
            case "Apparel >> Shoes":
                sl.selectByVisibleText("Apparel >> Shoes");
                break;
            case "Apparel >> Clothing":
                sl.selectByVisibleText("Apparel >> Clothing");
                break;
            case "Apparel >> Accessories":
                sl.selectByVisibleText("Apparel >> Accessories");
                break;
            case "Digital downloads":
                sl.selectByVisibleText("Digital downloads");
                break;
            case "Books":
                sl.selectByVisibleText("Books");
                break;
            case "Jewelry":
                sl.selectByVisibleText("Jewelry");
                break;
            case "Gift Cards":
                sl.selectByVisibleText("Gift Cards");
                break;


        }
    }

    public void EnterPrice(String price) {
        Price.sendKeys(price);
    }

    public void TaxCategorySelection(String taxCategory) {
        Select sl = new Select(TaxCategory);
        switch (taxCategory) {
            case "Books":
                sl.selectByVisibleText("Books");
                break;
            case "Electronics & Software":
                sl.selectByVisibleText("Electronics & Software");
                break;
            case "Downloadable Products":
                sl.selectByVisibleText("Downloadable Products");
                break;
            case "Jewelry":
                sl.selectByVisibleText("Jewelry");
                break;
            case "Apparel":
                sl.selectByVisibleText("Apparel");
                break;
        }

    }

    public void TaxExempt(String tx) {

        if (!TaxExempt.isSelected()) {
            if (tx.equalsIgnoreCase("yes")) {
                TaxExempt.click();
            } else {
                TaxCategorySelection(tx);
            }
        }
        //tax exempt selcted
        else {
            if (tx.equalsIgnoreCase("no")) {
                TaxExempt.click();
                TaxCategorySelection(tx);
            }
        }

    }

    public void IsShippinEnabled(String shp){
        if(!ShippingEnabled.isSelected()){
            if(shp.equalsIgnoreCase("no")){

            }
        }
    }

}
