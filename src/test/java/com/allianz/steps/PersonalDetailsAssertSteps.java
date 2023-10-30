package com.allianz.steps;

import com.allianz.handler.PageElementAssertHandler;
import io.cucumber.java.en.When;


public class PersonalDetailsAssertSteps {

    @When("To field {string} enter value {string} component should be in invalid state")
    public void toFieldEnterValueComponentShouldBeInInvalidState(String inputAlias, String value) {
        var firstNameElement = PageElementAssertHandler.getComponentWithValueByFormControlName(inputAlias, value);
        PageElementAssertHandler.isElementInInvalidState(firstNameElement);
        PageElementAssertHandler.cleanField(inputAlias);
    }

}
