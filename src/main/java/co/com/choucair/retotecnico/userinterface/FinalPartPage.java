package co.com.choucair.retotecnico.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FinalPartPage extends PageObject {

    public static final Target PASSWORD = Target.the("box password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("box confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_ONE = Target.the("check one")
            .located(By.xpath("//span[@ng-class=\"{error: userForm.termOfUse.$error.required}\"]"));

    public static final Target CHECK_TWO = Target.the("check two")
            .located(By.xpath("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]"));

    public static final Target BUTTON_FINAL = Target.the("button of finish form")
            .located(By.xpath("//a[@class=\"btn btn-blue\"]"));

    public static final Target END_WORD = Target.the("welcome message for the user")
            .locatedBy("//div[@class=\"image-box-header\"]");
}
