package com.allianz.steps;

import com.allianz.handler.PageElementHandler;
import io.cucumber.java.en.When;

public class CoverDetailsSteps {
    @When("Displaying cover details content {string}")
    public void displayingCoverDetailsContent(String content) {
        PageElementHandler.checkContentVisibility(content);
    }
}
