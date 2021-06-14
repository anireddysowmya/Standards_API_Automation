package au.com.standards.API.businesslayer;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import io.restassured.specification.RequestSpecification;

public class testWeatherAPIOne {
	public static String value;
	public Response response;
	
	

	public void getStateCode(){
		
		String APIKey= "7cc85afe653545afb73eb63711f6773c";
	String endPoint= "/current";
    RestAssured.baseURI="https://api.weatherbit.io/v2.0";
 response= given().log().all().queryParam("lat", "40.730610").queryParam("lon", "-73.935242").queryParam("key", 
		 APIKey).header("Content-Type", "application/json")
.when().get(endPoint);

  response.then().assertThat().statusCode(200);
 
   System.out.println("State code value is :"+response.path("data.state_code"));
   
}
	
	public void extractValue() {
		
		 
		 System.out.println(response.path("data.state_code"));
	}
	public static void main(String[] args) {
		testWeatherAPIOne step= new testWeatherAPIOne();
		step.getStateCode();
		step.extractValue();
	}

	}












