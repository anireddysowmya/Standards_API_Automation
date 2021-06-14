package au.com.standards.API.steps;

import au.com.standards.API.businesslayer.testWeatherAPIOne;
import au.com.standards.API.businesslayer.testWeatherAPITwo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testSecondAPISteps {


	@Given("^user navigates to forecast API with base URI$")
	public void user_navigates_to_forecast_API_with_base_URI() {
		
		System.out.println("User successfully navigates to https://www.weatherbit.io/api/swaggerui/weather-api-v2#!/and");
		
		
	}

@And("^user enters all the required parameters and selects the method GET$")
	public void user_enters_all_the_required_parameters_and_selects_the_method_GET() {
	testWeatherAPITwo APITwo= new testWeatherAPITwo();
	APITwo.getPostalCodeAPI();
	
	
}

@Then("^user  extracts the timestamp_utc and weather value entries from body response$")
public void user_extracts_the_timestamp_utc_and_weather_value_entries_from_body_response() {
	System.out.println("timestamp_utc and weather value entries from body response extracted successfuly");
	
}










}
