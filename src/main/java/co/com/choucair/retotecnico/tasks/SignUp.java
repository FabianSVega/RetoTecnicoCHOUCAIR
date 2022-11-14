package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignUp implements Task{
    private SignUpPage signUpPage;


    public static SignUp onThePage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SignUpPage.SIGNUP_BUTTON));

    }
}
