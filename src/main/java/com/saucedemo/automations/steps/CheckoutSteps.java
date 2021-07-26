package com.saucedemo.automations.steps;

import com.saucedemo.automations.pageobjects.CheckoutPage;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    public void clickInCheckout () {
        checkoutPage.getDriver().findElement(checkoutPage.getBtnCheckout()).click();
    }
}