package co.com.choucair.retotecnico.tasks;


import co.com.choucair.retotecnico.userinterface.ThirdPartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class ThirdPart implements Task {
    private ThirdPartPage thirdPartPage;
    public static ThirdPart onSignUp() {
        return Tasks.instrumented(ThirdPart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ThirdPartPage.OS_PC),
                Click.on(ThirdPartPage.OS_SELECT),
                Click.on(ThirdPartPage.VERSION),
                Click.on(ThirdPartPage.VERSION_SELECT),
                Click.on(ThirdPartPage.LANGUAGE),
                Click.on(ThirdPartPage.LANGUAGE_SELECT),
                Click.on(ThirdPartPage.BUTTON_NEXT)
        );

    }
}
