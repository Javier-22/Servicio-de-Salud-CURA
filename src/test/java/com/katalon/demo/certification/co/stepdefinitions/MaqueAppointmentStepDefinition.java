package com.katalon.demo.certification.co.stepdefinitions;

import com.katalon.demo.certification.co.models.DataModelCredentials;
import com.katalon.demo.certification.co.models.DataModelFillForm;
import com.katalon.demo.certification.co.questions.TheValidOption;
import com.katalon.demo.certification.co.tasks.FillForm;
import com.katalon.demo.certification.co.tasks.Login;
import com.katalon.demo.certification.co.userinterfaces.OpenUpPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;


import static com.katalon.demo.certification.co.utils.Constans.ACTOR_1;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MaqueAppointmentStepDefinition {

    OpenUpPage ulr;

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_1);
    }
    @Given("^that the user enter home page$")
    public void thatTheUserEnterHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(ulr));
    }


    @When("^the user is on the home page, login\\.$")
    public void theUserIsOnTheHomePageLogin(List<DataModelCredentials> dataModelCredentials) {
        theActorInTheSpotlight().attemptsTo(Login.with(dataModelCredentials.get(0)));
    }

    @And("^fill out the form to book an appointment$")
    public void fillOutTheFormToBookAnAppointment(List<DataModelFillForm> dataModelFillForms) {
        theActorInTheSpotlight().attemptsTo(FillForm.appointment(dataModelFillForms.get(0)));
    }

    @Then("^check confirmation message (.*)$")
    public void checkConfirmationMessage(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheValidOption.isEqual(), Matchers.equalTo(message)));
    }

    }







