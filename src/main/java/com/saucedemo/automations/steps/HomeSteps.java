package com.saucedemo.automations.steps;

import com.saucedemo.automations.pageobjects.HomePage;
import com.saucedemo.automations.util.Data;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    HomePage homePage = new HomePage();
    Data data = new Data();
    String [] dataUser = data.getData();

    @Step
    public void openBrowser () {
        homePage.open();
    }

    @Step
    public void enterUser () {
        homePage.getDriver().findElement(homePage.getTxtUserName()).sendKeys(dataUser[0]);
    }

    @Step
    public void enterPassword () {
        homePage.getDriver().findElement(homePage.getTxtPassword()).sendKeys(dataUser[1]);
    }

    @Step
    public void clickLogin () {
        homePage.getDriver().findElement(homePage.getBtnLogin()).click();
    }

}