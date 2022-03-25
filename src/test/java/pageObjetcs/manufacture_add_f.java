package pageObjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class manufacture_add_f {
    @FindBy(xpath = "//a//p[contains(text(),'Catalog')]")
    WebElement Catalog_MainPage;
    @FindBy(xpath = "//a//p[contains(text(),' Manufacturers')]")
    WebElement Manufacturer_sub_page;

}
