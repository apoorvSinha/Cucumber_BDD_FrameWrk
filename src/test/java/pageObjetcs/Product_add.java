package pageObjetcs;

import StepDefs.BaseSteps;
import Utilities.utility_excel;
import io.cucumber.java.ht.Le;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Product_add {
    public WebDriver ldriver;
    BaseSteps bs = new BaseSteps();
    public Product_add(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//li//a//p[contains(text(),'Catalog')]")
    WebElement CatalogMainMenu;
    @FindBy(xpath = "//li//a//p[contains(text(),' Products')]")
    WebElement ProductsSubMenu;
    @FindBy(linkText = "Add new")
    WebElement AddNewProduct;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement SaveButton;

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
    @FindBy(xpath = "//input[@id='Width']")
    WebElement Width;
    @FindBy(xpath = "//select[@id='ManageInventoryMethodId']")
    WebElement inventoryMethod;


    public void ClickMainMenuCatalog(){
        CatalogMainMenu.click();
    }
    public void ClickSubMenuProduct(){
        ProductsSubMenu.click();
    }
    public void AddNewProductClick(){
        AddNewProduct.click();
    }
    public void SaveButtonClick(){
        //Actions action = new Actions(ldriver);
        //action.moveToElement(SaveButton);
        bs.js.executeScript("arguments[0].scrollIntoView(true);",SaveButton );
        SaveButton.click();
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
            }
        }
        //tax exempt selcted
        else {
            if (tx.equalsIgnoreCase("no")) {
                TaxExempt.click();
            }
        }
    }

    public void IsShippinEnabled(String shp){
        if(!ShippingEnabled.isSelected()){
            if(shp.equalsIgnoreCase("yes")){
                ShippingEnabled.click();
            }
        }
        else{
            if(shp.equalsIgnoreCase("no")){
                ShippingEnabled.click();
            }
        }
    }
    public void EnterProductSpecifications(String weight, String length, String width, String height){
        Weight.sendKeys(weight);
        Length.sendKeys(length);
        Height.sendKeys(height);
        Width.sendKeys(width);
    }
    public void SelectInventoryMethod(String method){
        Select sl = new Select(inventoryMethod);
        switch (method){
            case "Don't track inventory":
                sl.selectByVisibleText("Don't track inventory");
                break;
            case "Track inventory":
                sl.selectByVisibleText("Track inventory");
                break;
            case "Track inventory by product attributes":
                sl.selectByVisibleText("Track inventory by product attributes");
                break;
        }
    }

}
