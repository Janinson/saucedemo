package com.saucedemo.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {

    By btnCheckout = By.id("checkout");

    public By getBtnCheckout() {
        return btnCheckout;
    }

}