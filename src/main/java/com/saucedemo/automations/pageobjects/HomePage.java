package com.saucedemo.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class HomePage extends PageObject {

    By txtUserName = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login-button");

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}