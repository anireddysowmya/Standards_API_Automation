Feature: Get timestamp_utc, weather value entries from Weatherbit API
//Note: This feature file doesn't execute as the API Key comes under 'pricing plan' for forecast endpoint from Weatherbit API

@forecast
Scenario: User can get the forecast details  from Weatherbit API when given postal code
Given user navigates to forecast API with base URI
And user enters all the required parameters and selects the method GET
Then user  extracts the timestamp_utc and weather value entries from body response