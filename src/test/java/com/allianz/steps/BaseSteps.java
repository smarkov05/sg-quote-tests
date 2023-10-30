package com.allianz.steps;

import com.allianz.handler.PageElementHandler;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    @BeforeAll
    public static void setUpSelenide() {
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.timeout = Duration.of(120, ChronoUnit.SECONDS).toMillis();
    }

    @Given("Open page {string}")
    public void openPage(String url) {
        open(url);
    }

    @When("Content {string} is visible")
    public void contentIsVisible(String text) {
        PageElementHandler.checkContentVisibility(text);
    }


    @Then("Click button {string}")
    public void clickButton(String buttonName) {
        PageElementHandler.clickButtonByName(buttonName);
    }

}
