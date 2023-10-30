package com.allianz.handler;

import static com.codeborne.selenide.Condition.innerText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.cssSelector;

public class PageElementHandler {

    private PageElementHandler() {
    }

    public static void checkContentVisibility(String text) {
        $(byText(text)).shouldBe(visible);
    }

    public static void writeContentToInputByFormControlName(String inputAlias, String text) {
        writeContentToInputByFormControlName(inputAlias, text, 0);
    }

    public static void writeContentToInputByFormControlName(String inputAlias, String text, int index) {
        $$(byAttribute("formcontrolname", inputAlias))
                .get(index)
                .setValue(text)
                .pressEnter();
    }

    public static void writeContentToEmbeddedInputByFormControlName(String inputAlias, String text) {
        $(byAttribute("formcontrolname", inputAlias))
                .find(cssSelector("input"))
                .setValue(text)
                .pressEnter();
    }

    public static void clickRadioButtonByFormControlName(String radioAlias, String choice) {
        $(byAttribute("formcontrolname", radioAlias))
                .find(byTagAndText("span", choice))
                .click();
    }

    public static void chooseDropdownElementByFormControlName(String dropdownAlias, String choice) {
        // click on dropdown
        $(byAttribute("formcontrolname", dropdownAlias))
                .click();
        // click on dropdown element
        $(byTagAndText("span", choice))
                .click();
    }

    public static void chooseEmbeddedDropdownElementByFormControlName(String dropdownAlias, String choice) {
        // click on dropdown
        $(byAttribute("formcontrolname", dropdownAlias)).find(cssSelector("nx-dropdown")).click();
        // click on dropdown
        $(byTagAndText("span", choice)).click();
    }

    public static void clickCheckboxByFormControlName(String checkboxAlias, String checkbox) {
        $$(byAttribute("formcontrolname", checkboxAlias))
                .filter(innerText(checkbox))
                .get(0)
                .find(cssSelector("span"))
                .click();
    }

    public static void clickButtonByName(String buttonName) {
        $$(byTagName("button"))
                .filter(innerText(buttonName))
                .get(0)
                .click();
    }
}
