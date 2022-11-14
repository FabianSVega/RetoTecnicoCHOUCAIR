package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.SecondPartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class SecondPart implements Task {
    private SecondPartPage secondPartPage;
    public static SecondPart onSignUp() {
        return Tasks.instrumented(SecondPart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SendKeys.of("Bogotá").into(SecondPartPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(SecondPartPage.CITY),
                Hit.the(Keys.ENTER).into(SecondPartPage.CITY),
                Enter.theValue("111166").into(SecondPartPage.POSTAL_CODE),
                Click.on(SecondPartPage.BUTTON_NEXT)

        );

    }
}
