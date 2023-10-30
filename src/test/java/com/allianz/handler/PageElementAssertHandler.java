package com.allianz.handler;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.refresh;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageElementAssertHandler {
    private PageElementAssertHandler() {
    }

    public static SelenideElement getComponentWithValueByFormControlName(String inputAlias, String value) {
        return $(byAttribute("formcontrolname", inputAlias))
                .setValue(value)
                .pressTab();
    }

    public static void isElementInInvalidState(SelenideElement component) {
        assertTrue(Boolean.parseBoolean(component.getAttribute("aria-invalid")));
    }

    public static void cleanField(String inputAlias) {
        $(byAttribute("formcontrolname", inputAlias))
                .setValue("");
        refresh();
    }
}
