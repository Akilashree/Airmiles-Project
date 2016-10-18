package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;
import pageobjects.UpdateProfilePage;

public class Login extends DriverFactory{
	// WebDriver driver = new ChromeDriver();
	// https://am-uat-site.airmiles.aimiasystems.com amUaTenv:amUaTenv@

	@Given("^user is on home page$")
	public void user_is_on_Home_Page() throws Throwable {
	//	Thread.sleep(3000);
		driver.get("https://amUaTenv:amUaTenv@am-uat-site.airmiles.aimiasystems.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		new LoginPage(driver).user_is_on_Home_Page();
	}
//User enters 'qa\\.tt(\\d+)@mailinator\\.com' and 'Aimia@(\\d+)'
	//\"(.*)\"
	
	
	@When("^User enters '(.*?)' and '(.*?)'$")
	public void user_enters_UserName_and_Password(String uname, String pwd) throws Throwable {
		new LoginPage(driver).user_enters_UserName_and_Password(uname, pwd);
	}

	@Then("^Message displayed Login Successful$")
	public void message_displayed_Login_Successfully() throws Throwable {
		new LoginPage(driver).message_displayed_Login_Successfully();
	}

	@When("^user is on my account page$")
	public void user_is_on_my_account_Page() throws Throwable {
		new UpdateProfilePage(driver).user_is_on_my_account_Page();
	}

	@When("^user is on update details page$")
	public void user_is_on_update_details_Page() throws Throwable {
		new UpdateProfilePage(driver).user_is_on_update_details_Page();
	}

	@When("^Enter '(.*?)' and '(.*?)'$")
	public void user_enters_firstname_and_lastname(String fname, String lname) throws Throwable {
		new UpdateProfilePage(driver).user_enters_firstname_and_lastname(fname, lname);
	}

	@And("^User saves the updated details$")
	public void user_saves_updated_details() throws Throwable {
		new UpdateProfilePage(driver).user_saves_updated_details();
	}
	
	

}
