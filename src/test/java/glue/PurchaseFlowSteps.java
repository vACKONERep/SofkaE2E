package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.AddToCart;
import tasks.CompletePurchaseForm;
import tasks.HandlePopup;
import userinterfaces.DemoBlazePage;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFlowSteps {
    Actor user = Actor.named("User");

    @Given("the user is on the homepage")
    public void userIsOnHomepage() {
        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(Serenity.getDriver()));
        user.attemptsTo(Open.url("https://www.demoblaze.com/"));
    }

    @When("the user adds the {string} to the cart")
    public void userAddsProductToCart(String product) {
        user.attemptsTo(AddToCart.withName(product));
    }

    @When("the user handles the pop-up message")
    public void userHandlesPopup() {
        user.attemptsTo(HandlePopup.handle());  // Handle the "Product added" pop-up
    }

    @When("the user returns to the homepage")
    public void userReturnsToHomepage() {
        user.attemptsTo(
                WaitUntil.the(DemoBlazePage.HOME_BUTTON, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(DemoBlazePage.HOME_BUTTON)
        );  // Click the "Return Home" button
    }

    @When("the user adds another phone to the cart")
    public void userAddsAnotherPhoneToCart() {
        user.attemptsTo(AddToCart.withName("Nokia lumia 1520"));  // Replace with the second phone name
    }

    @When("the user handles the second pop-up message")
    public void userHandlesSecondPopup() {
        user.attemptsTo(HandlePopup.handle());  // Handle the second "Product added" pop-up
    }

    @When("the user views the cart")
    public void userViewsCart() {
        user.attemptsTo(Click.on(DemoBlazePage.CART_BUTTON));  // Click on the cart button
    }

    @When("the user clicks the Place Order button")
    public void userClicksPlaceOrder() {
        user.attemptsTo(Click.on(DemoBlazePage.PLACE_ORDER_BUTTON));  // Click the Place Order button
    }

    @When("the user completes the purchase form with {string}, {string}, {string}, {string}, {string}, {string}")
    public void userCompletesForm(String name, String country, String city, String card, String month, String year) {
        user.attemptsTo(CompletePurchaseForm.withDetails(name, country, city, card, month, year));
    }

    @When("the user clicks the Purchase button")
    public void userClicksPurchase() {
        user.attemptsTo(Click.on(DemoBlazePage.PURCHASE_BUTTON));  // Click the Purchase button
    }

    @Then("the purchase should be completed successfully")
    public void purchaseShouldComplete() {
        user.attemptsTo(
                WaitUntil.the(DemoBlazePage.PURCHASE_CONFIRMATION, isVisible()).forNoMoreThan(3).seconds()
        );
        user.should(seeThat(WebElementQuestion.the(DemoBlazePage.PURCHASE_CONFIRMATION), isVisible()));

    }
}
