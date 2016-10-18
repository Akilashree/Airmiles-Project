package stepdefinition;

import cucumber.api.java.en.And;
import pageobjects.PassengerInfoPage;

public class PassengerInfo extends DriverFactory{
	@And("^user selects gender '(.*?)'$")
	public void user_selects_gender(String Title) throws Throwable {
		new PassengerInfoPage(driver).user_selects_gender(Title);
	}
	@And("^user enters date of dirth '(.*?)' and '(.*?)' and '(.*?)'$")
	public void user_enters_DOB(String MM,String DD,String YYYY) throws Throwable {
		new PassengerInfoPage(driver).user_enters_DOB(MM,DD,YYYY);
	}
	@And("^user enters passport number '(.*?)'$")
	public void user_enters_passport_number(String passportNo) throws Throwable {
		new PassengerInfoPage(driver).user_enters_passport_number(passportNo);
	}
	@And("^user selects issuing country '(.*?)'$")
	public void user_selects_issuing_country(String issuingcountry) throws Throwable {
		new PassengerInfoPage(driver).user_selects_issuing_country(issuingcountry);
	}
	
	@And("^user selects nationality '(.*?)'$")
	public void user_selects_nationality(String national) throws Throwable {
		new PassengerInfoPage(driver).user_selects_nationality(national);
	}
	@And("^user enters passport expiry '(.*?)' and '(.*?)' and '(.*?)'$")
	public void user_enters_passport_expiry(String MM,String DD,String yearExpiry) throws Throwable {
		new PassengerInfoPage(driver).user_enters_passport_expiry(MM,DD,yearExpiry);
	}
	@And("^user clicks on next step payment button$")
	public void user_clicks_nextStepButton() throws Throwable {
		new PassengerInfoPage(driver).user_clicks_nextStepButton();
	}
	
	@And("^user confirms booking$")
	public void user_clicks_completeBookingButton() throws Throwable {
		new PassengerInfoPage(driver).user_clicks_completeBookingButton();
		
	}
  
	
}
