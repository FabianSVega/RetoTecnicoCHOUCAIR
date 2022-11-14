package co.com.choucair.retotecnico.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FoundWordPage extends PageObject {
    public static final Target WELCOMEMSG = Target.the("welcome message")
            .locatedBy("//div[@class=\"image-box-header\"]");

}
