Feature: Get State code value from Weatherbit API

//Background: User generates API key for Authorisation
//Given I am an authorized user

@firsttest
Scenario: User can get the current Weather when given lat and lon
Given user navigates to Weatherbit API with base URI
And user enters all the required parameters for the weather API and selects the method GET
Then user  extracts the state_code value from body response

