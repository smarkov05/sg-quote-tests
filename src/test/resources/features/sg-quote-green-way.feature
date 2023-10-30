Feature: Green way for fill base minimal necessary data

  Background: Open sg-quote main page
    Given Open page "https://allianz-sg-quote-dev.azcare.allianz.com/index.html"

  Scenario: Put all data to all inputs and add max as possible additional option
    When Content "Personal details" is visible
    Then Write date "30/12/2023" when require cover from
    Then Click appeals radio "Mrs."
    Then Write "Cucum" to first name
    Then Write "Ber" to last name
    Then Choose "Divorced" of marital status
    Then Choose "Male" of gender
    Then Write "01/01/2000" of birthday
    Then Choose "Bermuda" of nationality
    Then Write number "192" to height in cm
    Then Write number "88" to weight in kg
    Then Write "cucum-test-mail@cbtm.cmm" to email
    Then Write "11 Great George St, London SW1P 3AD, United Kingdom" to full address in principal country of residence
    Then Choose "France" of home country
    Then Choose "France (+33)" of phone prefix
    Then Write number "1234455" to phone number
    Then Choose "Civil Services" of occupation

    #dropdown Destination country are disable for some reason
#    Then Choose "Brazil" of country of destination

    Then Click current domestic or insurance radio "Current insurance details"
    When Displaying additional option to fill with content "Policy number"
    Then Write name of insurer "PZU"
    Then Write "SomEPoLICynmb12313" to policy number
    Then Write "26/10/2023" to start date
    Then Click pre-existing condition radio "NO"
    When Displaying additional option to fill with content "Moratorium (MORI)"
    Then Click "Agree" checkbox
    Then Click button "NEXT"

    When Displaying cover details content "Select your core plan"


##    add one dependant
#    Then Click button "Add dependant"
#    When Displaying additional option to fill with content "Policy number" number times "2"
#    Then Click dependant type radio "Child"
#
#    Then Write "" to first name
#    Then Write "" to last name
#    Then Write "" of birthday
#    Then Choose "" of gender
#    Then Write "" to email
#    Then Choose "" of home country
#    Then Choose "" of nationality
#
#    Then Choose "" of occupation
#    Then Choose "" of country of destination
#
#    Then Click current domestic or insurance radio "Current insurance details" index "1"
#    When Displaying additional option to fill with content "Policy number" number times "2"
#    Then Write name of insurer ""
#    Then Write "" to policy number
#    Then Write "" to start date