package co.com.choucair.retotecnico.stepdefinitions;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class UTestStepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}

    @Given("^than Fabian wants be part of UTest$")
    public void thanFabianWantsBePartOfUTest() {
        OnStage.theActorCalled("Fabian").wasAbleTo(OpenUp.thePage(),(SignUp.onThePage()));
    }

    @When("^he registers all his personal datas at UTest$")
    public void heRegistersAllHisPersonalDatasAtUTest() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(FirstPart.onSignUp(),(SecondPart.onSignUp()),(ThirdPart.onSignUp()),(FinalPart.onSignUP()));
    }

    @Then("^he registered and he sees (.*)$")
    public void heRegisteredAndHeSees(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
