package stepdefinition;

import org.junit.After;
import org.junit.Before;

import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory {
	

	
	 @Given("^userss is on home pagesss$")
	    public void setup() throws Throwable {
		 driver.get("https://amUaTenv:amUaTenv@am-uat-site.airmiles.aimiasystems.com");
	        driver.manage().window().maximize();
	    }

	    @Before
	    public void beforeScenario(){
	        System.out.println("this will run before the actual scenario");
	    }

	    @After
	    public void afterScenario(){
	        System.out.println("this will run after scneario is finished, even if it failed");
	    }

}
