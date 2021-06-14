package au.com.standards.API.businesslayer;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testWeatherAPITwo {

	public static String value;
	public Response response;
	
	

	public void getPostalCodeAPI(){
		
		String APIKey= "1cd17f4885ac4ff5af6d2680d94f3ebd";
		String endPoint="/forecast/3hourly";
	
    RestAssured.baseURI="https://api.weatherbit.io/v2.0";
 response= given().log().all().queryParam("postal_code", "2145").queryParam("key", 
		 APIKey).header("Content-Type", "application/json")
.when().get(endPoint);

  response.then().assertThat().statusCode(200);
 
   System.out.println("Timestamp value is :"+response.path("data.timestamp_utc"));
   System.out.println("Weather entries value are :"+response.path("data.weather"));
   
}
	
	public void extractValue() {
		
		 
		System.out.println("Timestamp value is :"+response.path("data.timestamp_utc"));
		   System.out.println("Weather entries value are :"+response.path("data.weather"));
		   
	}
	public static void main(String[] args) {
		testWeatherAPITwo step= new testWeatherAPITwo();
		step.getPostalCodeAPI();
		step.extractValue();
	}

	}
















