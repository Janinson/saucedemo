package com.saucedemo.automations.stepdefinitions;

import com.saucedemo.automations.steps.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class BuyStepDefinitions {

    @Steps
    HomeSteps homeSteps;
    @Steps
    AddProductSteps addProductSteps;
    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    InformationSteps informationSteps;
    @Steps
    CheckoutCompleteSteps checkoutCompleteSteps;

    @Given("^the user enters the website$")
    public void theUserEntersTheWebsite() {
        homeSteps.openBrowser();
    }

    @When("^the user enters user and password$")
    public void theUserEntersUserAndPassword() {
        homeSteps.enterUser();
        homeSteps.enterPassword();
        homeSteps.clickLogin();
    }

    @And("^click on the jacket$")
    public void clickOnTheJacket() {
        addProductSteps.selectProduct();
        addProductSteps.clickCartShopping();
        checkoutSteps.clickInCheckout();
        informationSteps.enterName();
        informationSteps.enterLastName();
        informationSteps.enterZip();
        informationSteps.clickContinue();
    }

    @Then("^you can see the text of thank you for your order on the screen$")
    public void youCanSeeTheTextOfThankYouForYourOrderOnTheScreen() {
        //corregido
        checkoutCompleteSteps.btnFinish();
        Assert.assertEquals(checkoutCompleteSteps.messageStep(), "THANK YOU FOR YOUR ORDER");
    }
}