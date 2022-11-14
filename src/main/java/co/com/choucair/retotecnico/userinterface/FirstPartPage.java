package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FirstPartPage extends PageObject {
    public static final Target FIRST_NAME = Target.the("input box for first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("input box for last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("input box for email")
            .located(By.id("email"));

    public static final Target MONTH =Target.the("month select")
            .located(By.id("birthMonth"));
    public static final Target DAY =Target.the("day select")
            .located(By.id("birthDay"));
    public static final Target YEAR =Target.the("year select")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT = Target.the("button next: location")
            .located(By.xpath("//a[@class=\"btn btn-blue\"]"));
}
