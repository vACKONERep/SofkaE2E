package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.DemoBlazePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletePurchaseForm implements Task {
    private final String name, country, city, card, month, year;

    public CompletePurchaseForm(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    public static CompletePurchaseForm withDetails(String name, String country, String city, String card, String month, String year) {
        return instrumented(CompletePurchaseForm.class, name, country, city, card, month, year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(DemoBlazePage.NAME_FIELD),
                Enter.theValue(country).into(DemoBlazePage.COUNTRY_FIELD),
                Enter.theValue(city).into(DemoBlazePage.CITY_FIELD),
                Enter.theValue(card).into(DemoBlazePage.CARD_FIELD),
                Enter.theValue(month).into(DemoBlazePage.MONTH_FIELD),
                Enter.theValue(year).into(DemoBlazePage.YEAR_FIELD)
        );
    }
}
