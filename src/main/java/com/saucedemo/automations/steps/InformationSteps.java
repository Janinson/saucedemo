package com.saucedemo.automations.steps;

import com.saucedemo.automations.pageobjects.InformationPage;
import com.saucedemo.automations.util.Data;

public class InformationSteps {

    InformationPage informationPage = new InformationPage();
    Data data = new Data();
    String [] dataInfo = data.getInfo();

    public void enterName () {
        informationPage.getDriver().findElement(informationPage.getTxtFirstName()).sendKeys(dataInfo[0]);
    }
    public void enterLastName () {
        informationPage.getDriver().findElement(informationPage.getTxtLastName()).sendKeys(dataInfo[1]);
    }
    public void enterZip () {
        informationPage.getDriver().findElement(informationPage.getZip()).sendKeys(dataInfo[2]);
    }
    public void clickContinue () {
        informationPage.getDriver().findElement(informationPage.getBtnContinue()).click();
    }
}