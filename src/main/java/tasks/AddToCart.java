package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.DemoBlazePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AddToCart implements Task {
    private final String product;

    public AddToCart(String product) {
        this.product = product;
    }

    public static AddToCart withName(String product) {
        return instrumented(AddToCart.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoBlazePage.productLink(product)),
                Click.on(DemoBlazePage.ADD_TO_CART_BUTTON)
        );
    }
}
