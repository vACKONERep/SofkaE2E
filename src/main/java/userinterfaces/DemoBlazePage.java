package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/")
public class DemoBlazePage extends PageObject {
    public static final Target HOME_BUTTON = Target.the("Home button")
            .located(By.xpath("//a[@class='nav-link'][contains(.,'Home (current)')]"));

    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(org.openqa.selenium.By.xpath("//a[@href='#'][contains(.,'Add to cart')]"));
    public static final Target CART_BUTTON = Target.the("cart button")
            .locatedBy("#cartur");
    public static final Target PLACE_ORDER_BUTTON = Target.the("place order button")
            .located(org.openqa.selenium.By.xpath("//button[@type='button'][contains(.,'Place Order')]"));
    public static final Target PURCHASE_BUTTON = Target.the("purchase button")
            .locatedBy("#orderModal button.btn-primary");

    public static Target productLink(String productName) {
        return Target.the("product link for " + productName).locatedBy("//a[contains(text(),'{0}')]").of(productName);
    }

    public static final Target NAME_FIELD = Target.the("name field")
            .locatedBy("#name");
    public static final Target COUNTRY_FIELD = Target.the("country field")
            .locatedBy("#country");
    public static final Target CITY_FIELD = Target.the("city field")
            .locatedBy("#city");
    public static final Target CARD_FIELD = Target.the("credit card field")
            .locatedBy("#card");
    public static final Target MONTH_FIELD = Target.the("month field")
            .locatedBy("#month");
    public static final Target YEAR_FIELD = Target.the("year field")
            .locatedBy("#year");
    public static final Target PURCHASE_CONFIRMATION = Target.the("Purchase confirmation")
            .located(By.xpath("//button[@type='button'][contains(.,'Place Order')]"));
}