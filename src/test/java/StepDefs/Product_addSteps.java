package StepDefs;

import Utilities.utility_excel;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjetcs.Product_add;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Product_addSteps extends BaseSteps {
    WebDriver driver = getWebDriver();

    public static String getValuesFromSheet(String key) throws IOException {

        HashMap<String, String> data = utility_excel.ExternalDataFetcher();
        String value=null;
        for (Map.Entry<String, String> e : data.entrySet()) {
            if(e.getKey().equalsIgnoreCase(key)){
                value = e.getValue();
            }
        }
        return value;
    }

    @Given("user clicks on catalog on main menu")
    public void user_clicks_on_catalog_on_main_menu() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        pa = new Product_add(driver);
        pa.ClickMainMenuCatalog();
    }


    @Given("user clicks on Products in sub menu")
    public void user_clicks_on_products_in_sub_menu() {
        pa.ClickSubMenuProduct();
    }
    @Then("user clicks on add new button")
    public void user_clicks_on_add_new_button() {
        pa.AddNewProductClick();
    }
    @Then("user verifies that Basic input is selected")
    public void user_verifies_that_basic_input_is_selected() {
        pa.CheckifBasic();
    }
    @Then("user enters all the details in the fields")
    public void user_enters_all_the_details_in_the_fields() throws IOException, InterruptedException {
        //driver.findElement(By.xpath("//div[@class='card card-secondary card-outline collapsed-card']//div[contains(text(),'Product info')]")).click();
        Thread.sleep(2000);

        pa.EnterProductName(getValuesFromSheet("Product Name"));
        pa.EnterShortDiscription(getValuesFromSheet("Short description"));
        pa.EnterFullDescription(getValuesFromSheet("Full description"));
        pa.EnterSKU(getValuesFromSheet("SKU"));
        pa.SelectCategory(getValuesFromSheet("Categories"));

        //driver.findElement(By.xpath("//div[@class='card card-secondary card-outline collapsed-card']//div[contains(text(),'Prices')]")).click();
        Thread.sleep(2000);
        pa.EnterPrice(getValuesFromSheet("Prices"));
        pa.TaxExempt(getValuesFromSheet("Tax exempt"));
        pa.TaxCategorySelection(getValuesFromSheet("Tax category"));
        pa.IsShippinEnabled(getValuesFromSheet("Shipping enabled"));
        if(getValuesFromSheet("Shipping enabled").equalsIgnoreCase("yes")){
            String weight = getValuesFromSheet("weight");
            String length = getValuesFromSheet("length");
            String width = getValuesFromSheet("width");
            String height = getValuesFromSheet("height");
            pa.EnterProductSpecifications(weight,length,width,height);
        }

        Thread.sleep(2000);
        pa.SelectInventoryMethod(getValuesFromSheet("Inventory method"));

    }
    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        pa.SaveButtonClick();
    }

}
