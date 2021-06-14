package au.com.standards.API.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;


		

	@RunWith(Cucumber.class)				
	@CucumberOptions(
			features= {"src/test/java/au/com/standards/API/features"},
					tags= {"@firsttest"},
	glue= "au/com/standards/API/steps",
	
	monochrome = true

	)

	public class testRunnerAPI_BDD {






}
