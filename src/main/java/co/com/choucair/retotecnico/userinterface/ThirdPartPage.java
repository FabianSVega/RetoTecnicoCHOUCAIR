package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ThirdPartPage extends PageObject {
    public static final Target OS_PC = Target.the("select one of computer")
            .located(By.xpath("(//span[@class=\'btn btn-default form-control ui-select-toggle\'])[1]"));
    public static final Target OS_SELECT = Target.the("select one of so computer")
            .located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));

    public static final Target VERSION = Target.the("select list version")
            .located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]"));

    public static final Target VERSION_SELECT = Target.the("select version")
            .located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[16]"));

    public static final Target LANGUAGE = Target.the("select one languaje")
            .located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]"));

    public static final Target LANGUAGE_SELECT = Target.the("select one language")
            .located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[11]"));

    public static final Target BUTTON_NEXT = Target.the("button next step")
            .located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));

}
