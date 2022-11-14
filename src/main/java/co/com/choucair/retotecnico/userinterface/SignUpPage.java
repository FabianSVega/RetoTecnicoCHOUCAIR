package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SignUpPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("Button that shows the form of signup")
            .located(By.xpath("//a[@class=\'unauthenticated-nav-bar__sign-up\']"));
}
