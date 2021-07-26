package com.saucedemo.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddProductPage extends PageObject {

    By btnAddToCart = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By linkCart = By.id("shopping_cart_container");

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public By getLinkCart() {
        return linkCart;
    }
}