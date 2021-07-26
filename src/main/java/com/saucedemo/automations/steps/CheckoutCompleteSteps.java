package com.saucedemo.automations.steps;

import com.saucedemo.automations.pageobjects.CheckoutCompletePage;

public class CheckoutCompleteSteps {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    public String messageStep(){
        return checkoutCompletePage.getDriver().findElement(checkoutCompletePage.getMessage()).getText();
    }

    public void btnFinish () {
        checkoutCompletePage.getDriver().findElement(checkoutCompletePage.getBtnFinish()).click();
    }

}