package com.saucedemo.automations.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/buy.feature",
        glue = "com.saucedemo.automations.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class BuyRunner {

}