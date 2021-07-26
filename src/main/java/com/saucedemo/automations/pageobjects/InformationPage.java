package com.saucedemo.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InformationPage extends PageObject {

    By txtFirstName = By.id("first-name");
    By txtLastName = By.id("last-name");
    By zip = By.id("postal-code");
    By btnContinue = By.id("continue");

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getZip() {
        return zip;
    }

    public By getBtnContinue() {
        return btnContinue;
    }

}