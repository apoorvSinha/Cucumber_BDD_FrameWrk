package pageObjetcs;

import StepDefs.BaseSteps;
import Utilities.utility_excel;
import io.cucumber.java.ht.Le;
import org.openqa.selenium.By;
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
    @FindBy(xpath = "//div[@class='onoffswitch']//input")
    WebElement BasicModeSelected;
    @FindBy(xpath = "//div[@class='onoffswitch']")
    WebElement BasicMode;
    @FindBy(xpath = "//input[@id='Name']")
    WebElement ProductName;
    @FindBy(xpath = "//textarea[@id='ShortDescription']")
    WebElement ShortDescription;
    @FindBy(id = "FullDescription_ifr")
    WebElement FullDescription;
    @FindBy(xpath = "//input[@id='Sku']")
    WebElement Sku;
    @FindBy(xpath = "//div[@role='listbox']")
    WebElement Categories;

    @FindBy(xpath = "//*[@id=\"product-price-area\"]/div[2]/span[1]/span/input[1]")
    WebElement PricenotClcked;
    @FindBy(xpath = "//input[@id='Price']")
    WebElement PriceClicked;
    @FindBy(xpath = "//input[@id='IsTaxExempt']")
    WebElement TaxExempt;
    @FindBy(xpath = "//select[@id='TaxCategoryId']")
    WebElement TaxCategory;
    @FindBy(xpath = "//input[@id='IsShipEnabled']")
    WebElement ShippingEnabled;
    @FindBy(xpath = "//div[@id='product-shipping-area']//*[@class=\"nested-setting\"]/div[1]/div[2]/span[1]/span/input[1]")
    WebElement WeightNotClicked;
    @FindBy(xpath = "//input[@id='Weight']")
    WebElement Weight;
    @FindBy(xpath = "//div[@id='product-shipping-area']//div[@class='nested-setting']//div[2]/div[2]/span[1]//input[1]")
    WebElement lengthNotlciked;
    @FindBy(xpath = "//input[@id='Length']")
    WebElement Length;
    @FindBy(xpath = "//div[@id='product-shipping-area']//div[@class='nested-setting']//div[4]/div[2]/span[1]//input[1]")
    WebElement heightNotClciked;
    @FindBy(xpath = "//input[@id='Height']")
    WebElement Height;
    @FindBy(xpath = "//div[@id='product-shipping-area']//div[@class='nested-setting']//div[3]/div[2]/span[1]//input[1]")
    WebElement WidthNotClicked;
    @FindBy(xpath = "//input[@id='Width']")
    WebElement Width;
    @FindBy(xpath = "//div[@id='product-inventory-area']//div[2]//select")
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
        Actions action = new Actions(ldriver);
        action.moveToElement(SaveButton);

        //bs.js.executeScript("arguments[0].scrollIntoView(true);",SaveButton );
        SaveButton.click();
    }
    public void CheckifBasic(){
        if(BasicModeSelected.isSelected()){
            BasicMode.click();
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

    public void SelectCategory(String category){
        Categories.click();

        switch (category) {
            case "Computers":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Computers')]")).click();
                break;
            case "Computers >> Desktops":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Computers >> Desktops')]")).click();
                break;
            case "Computers >> Notebooks":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Computers >> Notebooks')]")).click();
                break;
            case "Computers >> Software":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Computers >> Software')]")).click();
                break;
            case "Electronics":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Electronics')]")).click();
                break;
            case "Electronics >> Camera & photo":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Electronics >> Camera & photo')]")).click();
                break;
            case "Electronics >> Cell phones":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Electronics >> Cell phones')]")).click();
                break;
            case "Electronics >> Others":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Electronics >> Others')]")).click();
                break;
            case "Apparel":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Apparel')]")).click();
                break;
            case "Apparel >> Shoes":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Apparel >> Shoes')]")).click();
                break;
            case "Apparel >> Clothing":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Apparel >> Clothing')]")).click();
                break;
            case "Apparel >> Accessories":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Apparel >> Accessories')]")).click();
                break;
            case "Digital downloads":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Digital downloads')]")).click();
                break;
            case "Books":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Books')]")).click();
                break;
            case "Jewelry":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Jewelry')]")).click();
                break;
            case "Gift Cards":
                ldriver.findElement(By.xpath("//ul[@class='k-list k-reset']//li[contains(text(),'Gift Cards')]")).click();
                break;
        }
        ldriver.findElement(By.xpath("//label[contains(text(),'Categories')]")).click();
    }

    public void SelectCategoryObsolute(String category) {
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
        PricenotClcked.click();
        PriceClicked.sendKeys(price);
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
        WeightNotClicked.click();
        Weight.sendKeys(weight);
        lengthNotlciked.click();
        Length.sendKeys(length);
        heightNotClciked.click();
        Height.sendKeys(height);
        WidthNotClicked.click();
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
