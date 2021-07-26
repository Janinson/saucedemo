package com.saucedemo.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutCompletePage extends PageObject {

    By message = By.xpath("//*[@id='checkout_complete_container']/h2");

    By btnFinish = By.id("finish");

    public By getMessage() {
        return message;
    }

    public By getBtnFinish() {
        return btnFinish;
    }

}