package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import userinterfaces.DemoBlazePage;

import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class HandlePopup implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Wait for the alert to be present (if necessary)
        try {
            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Accept the alert
            alert.accept();  // This can be changed to dismiss() or getText() depending on the alert type

        } catch (NoAlertPresentException e) {
            // Log or handle the case where no alert is present
           // System.out.println("No alert was found: " + e.getMessage());
        }
    }
    public static HandlePopup handle() {
        return instrumented(HandlePopup.class);
    }
}
