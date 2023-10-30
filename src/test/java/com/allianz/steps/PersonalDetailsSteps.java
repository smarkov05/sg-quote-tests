package com.allianz.steps;

import com.allianz.handler.PageElementHandler;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PersonalDetailsSteps {

    @Then("Write date {string} when require cover from")
    public void writeDateWhenRequireCoverFrom(String date) {
        PageElementHandler.writeContentToInputByFormControlName("startDate", date);
    }

    @Then("Write {string} to first name")
    public void writeToFirstName(String firstName) {
        PageElementHandler.writeContentToInputByFormControlName("firstName", firstName);
    }

    @Then("Write {string} to last name")
    public void writeToLastName(String lastName) {
        PageElementHandler.writeContentToInputByFormControlName("lastName", lastName);
    }

    @Then("Click appeals radio {string}")
    public void clickAppealsRadio(String choice) {
        PageElementHandler.clickRadioButtonByFormControlName("appeal", choice);
    }

    @Then("Choose {string} of marital status")
    public void chooseOfMaritalStatus(String choice) {
        PageElementHandler.chooseDropdownElementByFormControlName("maritalStatus", choice);
    }

    @Then("Choose {string} of gender")
    public void chooseOfGender(String choice) {
        PageElementHandler.chooseDropdownElementByFormControlName("gender", choice);
    }

    @Then("Write {string} of birthday")
    public void writeOfBirthday(String date) {
        PageElementHandler.writeContentToInputByFormControlName("dateOfBirth", date);
    }

    @Then("Choose {string} of nationality")
    public void chooseOfNationality(String choice) {
        PageElementHandler.chooseDropdownElementByFormControlName("nationality", choice);
    }

    @Then("Write number {string} to height in cm")
    public void writeNumberToHeightInCm(String height) {
        PageElementHandler.writeContentToInputByFormControlName("height", height);
    }

    @Then("Write number {string} to weight in kg")
    public void writeNumberToWeightInKg(String weight) {
        PageElementHandler.writeContentToInputByFormControlName("weight", weight);
    }

    @Then("Write {string} to email")
    public void writeToEmail(String email) {
        PageElementHandler.writeContentToInputByFormControlName("email", email);
    }

    @Then("Write {string} to full address in principal country of residence")
    public void writeToFullAddressInPrincipalCountryOfResidence(String address) {
        PageElementHandler.writeContentToInputByFormControlName("fullAddress", address);
    }

    @Then("Choose {string} of home country")
    public void chooseOfHomeCountry(String country) {
        PageElementHandler.chooseDropdownElementByFormControlName("homeCountry", country);
    }

    @Then("Choose {string} of phone prefix")
    public void chooseOfPhonePrefix(String phonePrefix) {
        PageElementHandler.chooseEmbeddedDropdownElementByFormControlName("phone", phonePrefix);
    }

    @Then("Write number {string} to phone number")
    public void writeNumberToPhoneNumber(String phone) {
        PageElementHandler.writeContentToEmbeddedInputByFormControlName("phone", phone);
    }

    @Then("Choose {string} of occupation")
    public void chooseOfOccupation(String occupation) {
        PageElementHandler.chooseDropdownElementByFormControlName("occupation", occupation);
    }

    @Then("Choose {string} of country of destination")
    public void chooseOfCountryOfDestination(String country) {
        PageElementHandler.chooseDropdownElementByFormControlName("countryOfResidence", country);
    }

    @Then("Click current domestic or insurance radio {string}")
    public void clickCurrentDomesticOrInsuranceRadio(String choice) {
        PageElementHandler.clickRadioButtonByFormControlName("currentInsurance", choice);
    }

    @When("Displaying additional option to fill with content {string}")
    public void displayingAdditionalOptionToFillWithContent(String content) {
        PageElementHandler.checkContentVisibility(content);
    }

    @Then("Write name of insurer {string}")
    public void writeNameOfInsurer(String insurerName) {
        PageElementHandler.writeContentToInputByFormControlName("name", insurerName);
    }

    @Then("Write {string} to policy number")
    public void writeToPolicyNumber(String policy) {
        PageElementHandler.writeContentToInputByFormControlName("policyNumber", policy);
    }

    @Then("Write {string} to start date")
    public void writeToStartDate(String date) {
        PageElementHandler.writeContentToInputByFormControlName("startDate", date, 1);
    }

    @Then("Click pre-existing condition radio {string}")
    public void clickPreExistingConditionRadio(String choice) {
        PageElementHandler.clickRadioButtonByFormControlName("preExistingMedicalConditions", choice);
    }

    @Then("Click {string} checkbox")
    public void clickCheckbox(String checkbox) {
        PageElementHandler.clickCheckboxByFormControlName("preExistingMedicalConditionsCheck", checkbox);
    }
}
