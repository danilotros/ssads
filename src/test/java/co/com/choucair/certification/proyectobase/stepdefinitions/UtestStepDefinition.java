package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinition {
    @Before
    public void set_the_stage(){
        setTheStage(new OnlineCast());
    }
    @Given("^He stay into the platform$")
    public void heStayIntoThePlatform() throws Exception {
        theActorCalled("Daniel").wasAbleTo(
                OpenUp.thePage()
        );
    }


    @When("^He fill the data into the forms$")
    public void heFillTheDataIntoTheForms(List<UtestData> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                FillFormPersonalInformation.whit(data),
                FillFormAddress.whit(data),
                FillFormDevice.whit(data),
                FillFormValidation.whit(data)
        );
    }

    @Then("^He register in the platform$")
    public void heRegisterInThePlatform(List<UtestData> data) throws Exception {
            theActorInTheSpotlight().should(seeThat(Answer.toThe(data)));
    }

}
