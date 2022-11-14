package co.com.choucair.retotecnico.tasks;


import co.com.choucair.retotecnico.userinterface.FirstPartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

public class FirstPart implements Task {
    private FirstPartPage firstPartPage;
    public static FirstPart onSignUp() {
        return Tasks.instrumented(FirstPart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("MFfarisA").into(FirstPartPage.FIRST_NAME),
                Enter.theValue("VFMMMf").into(FirstPartPage.LAST_NAME),
                Enter.theValue("MMFMfariaVeg@gmail.com").into(FirstPartPage.EMAIL),
                SendKeys.of("May").into(FirstPartPage.MONTH),
                SendKeys.of("13").into(FirstPartPage.DAY),
                SendKeys.of("1999").into(FirstPartPage.YEAR),
                Click.on(FirstPartPage.BUTTON_NEXT)
                );



    }
}
