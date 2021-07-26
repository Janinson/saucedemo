package com.saucedemo.automations.steps;

import com.saucedemo.automations.pageobjects.AddProductPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductSteps {

    AddProductPage addProductPage = new AddProductPage();

    public void selectProduct () {
        WebDriverWait wait = new WebDriverWait(addProductPage.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(addProductPage.getBtnAddToCart()));
        addProductPage.getDriver().findElement(addProductPage.getBtnAddToCart()).click();
    }

    public void clickCartShopping () {
        addProductPage.getDriver().findElement(addProductPage.getLinkCart()).click();
    }
}