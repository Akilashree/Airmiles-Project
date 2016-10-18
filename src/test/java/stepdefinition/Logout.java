package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LogOutPage;

public class Logout extends DriverFactory {
	@When("^User click logout$")
	public void User_click_logout() throws Throwable {
		new LogOutPage(driver).User_click_logout();
	}

	@Then("^Logged Out Successfully$")
	public void logout() throws Throwable {
		new LogOutPage(driver).logout();
		driver.quit();
	}
}
