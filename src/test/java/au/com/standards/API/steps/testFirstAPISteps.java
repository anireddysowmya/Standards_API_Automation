package au.com.standards.API.steps;

import java.util.concurrent.TimeUnit;

import au.com.standards.API.businesslayer.testWeatherAPIOne;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testFirstAPISteps {


	@Given("^user navigates to Weatherbit API with base URI$")
	public void user_navigates_to_Weatherbit_API_with_base_URI() {
		
		System.out.println("User successfully navigates to https://www.weatherbit.io/api/swaggerui/weather-api-v2#!/and");
		
		
	}

@And("^user enters all the required parameters for the weather API and selects the method GET$")
	public void user_enters_all_the_required_parameters_for_the_weather_API_and_selects_the_method_GET() {
	testWeatherAPIOne APIOne= new testWeatherAPIOne();
	APIOne.getStateCode();
	
	
}

@Then("^user  extracts the state_code value from body response$")
public void user_extracts_the_state_code_value_from_body_response() {
	System.out.println("State code value from body response extracted successfuly");
	
}


















}
