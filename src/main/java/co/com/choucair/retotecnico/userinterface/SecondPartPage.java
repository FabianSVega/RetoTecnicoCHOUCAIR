package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SecondPartPage extends PageObject {

    public static final Target CITY = Target.the("text field city")
            .located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("text field postal code")
            .located(By.id("zip"));

    public static final Target BUTTON_NEXT= Target.the("button next device")
            .located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));


}
