package Cucumber_d.StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import Cucumber_d.pageObjetcs.manufacture_add_f;

public class Manufacture_add_steps extends BaseSteps {

    @Given("user clicks on catalog main menu")
    public void user_clicks_on_catalog_main_menu() {
        maf = new manufacture_add_f();
        WebDriver driver = getWebDriver();
    }


    @Then("user clicks on manufacturer sub menu")
    public void user_clicks_on_manufacturer_sub_menu() {

    }
    @Then("user switches the Advanced switch on")
    public void user_switches_the_advanced_switch_on() {

    }
    @Then("user enters all the details of manufacturer")
    public void user_enters_all_the_details_of_manufacturer() {

    }
    @Then("user should get confirmation message in next page")
    public void user_should_get_confirmation_message_in_next_page() {

    }

}
