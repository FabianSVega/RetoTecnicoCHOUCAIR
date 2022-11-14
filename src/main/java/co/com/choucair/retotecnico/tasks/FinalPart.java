package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.FinalPartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FinalPart implements Task {
    private FinalPartPage finalPartPage;
    public static FinalPart onSignUP() {
        return Tasks.instrumented(FinalPart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Fabian987654321@").into(FinalPartPage.PASSWORD),
                Enter.theValue("Fabian987654321@").into(FinalPartPage.CONFIRM_PASSWORD),
                Click.on(FinalPartPage.CHECK_ONE),
                Click.on(FinalPartPage.CHECK_TWO),
                Click.on(FinalPartPage.BUTTON_FINAL)

        );

    }
}
