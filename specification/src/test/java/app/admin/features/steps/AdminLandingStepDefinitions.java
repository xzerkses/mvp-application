package app.admin.features.steps;

import app.admin.features.steps.serenity.AdminSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AdminLandingStepDefinitions {

    @Steps
    AdminSteps adminSteps;

    @Given("I am an '(.*)' of the application")
    public void asAnAdministrator(String role){
    //throw new PendingEception();
        adminSteps.logRole(role);
    }

    @When("I am landing on the first page")
    public void landingOnFirstPage(){
        adminSteps.gotoFirstPage();
    }

    @Then("I shoud see welcome message '(.*)'")
    public void seeGiveInformation(String message){
        adminSteps.verifyPageContentHasMessage(message);
    }
}

