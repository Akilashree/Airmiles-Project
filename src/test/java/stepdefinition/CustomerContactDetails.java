package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageobjects.CustomerContactdetailsPage;

public class CustomerContactDetails extends DriverFactory {
	@And("^user enters salutation '(.*?)'$")
	public void user_select_salutation(String Title) throws Throwable {
		new CustomerContactdetailsPage(driver).user_select_salutation(Title);
	}

	@And("^user enters firstname '(.*?)'$")
	public void user_enters_firstname(String fname) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_firstname(fname);
	}

	@And("^user enters lastname '(.*?)'$")
	public void user_enters_lastname(String lname) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_lastname(lname);
	}

	@And("^user selects country from dropdown '(.*?)'$")
	public void user_select_country(String country) throws Throwable {
		new CustomerContactdetailsPage(driver).user_select_country(country);
	}

	@And("^user enters street address '(.*?)'$")
	public void user_enters_street_address(String StreetName) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_street_address(StreetName);
	}

	@And("^user enters city name '(.*?)'$")
	public void user_enters_city(String City) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_city(City);
	}

	@And("^user enters state name '(.*?)'$")
	public void user_enters_state(String State) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_state(State);
	}

	@And("^user enters email address '(.*?)'$")
	public void user_enters_email_address(String emailAddr) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_email_address(emailAddr);
	}

	@And("^user enters Confirm email address '(.*?)'$")
	public void user_confirms_email_address(String confirmEmailAddr) throws Throwable {
		new CustomerContactdetailsPage(driver).user_confirms_email_address(confirmEmailAddr);
	}

	@And("^user enters pin code '(.*?)'$")
	public void user_enters_pincode(String pcode) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_pincode(pcode);
	}

	@And("^user enters telephone number '(.*?)'$")
	public void user_enters_telephone_number(String phNo) throws Throwable {
		new CustomerContactdetailsPage(driver).user_enters_telephone_number(phNo);
	}

	@Then("^user clicks on next-step Travel Info button$")
	public void user_clicks_nextTravelInfo_button() throws Throwable {
		new CustomerContactdetailsPage(driver).user_clicks_nextTravelInfo_button();
	}

}
