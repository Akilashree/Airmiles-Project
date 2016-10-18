package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerContactdetailsPage {
	WebDriver driver;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlddlTitle")
	public static WebElement salutation;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtFName")
	public static WebElement firstname;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtLName")
	public static WebElement lastname;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddlCountryS")
	public static WebElement selectCountry;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtAddress")
	public static WebElement streetName;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtCity")
	public static WebElement city;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtRegion")
	public static WebElement state;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtEmail")
	public static WebElement emailAddress;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtConEmail")
	public static WebElement confirmEmailAddress;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtPostCode")
	public static WebElement postalCode;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtPhone")
	public static WebElement phNumber;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_LinkButton2")
	public static WebElement nextTravellerInfoButton;

	public CustomerContactdetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void user_select_salutation(String Title) throws Throwable {
		Thread.sleep(200);
		salutation.sendKeys(Title);
	}

	public void user_enters_firstname(String fname) throws Throwable {
		Thread.sleep(200);
		firstname.sendKeys(fname);
	}

	public void user_enters_lastname(String lname) throws Throwable {
		Thread.sleep(200);
		lastname.sendKeys(lname);
	}

	public void user_select_country(String country) throws Throwable {
		Thread.sleep(200);
		selectCountry.sendKeys(country);
	}

	public void user_enters_street_address(String StreetName) throws Throwable {
		Thread.sleep(200);
		streetName.sendKeys(StreetName);
	}

	public void user_enters_city(String City) throws Throwable {
		Thread.sleep(200);
		city.sendKeys(City);
	}

	public void user_enters_state(String State) throws Throwable {
		Thread.sleep(200);
		state.sendKeys(State);
	}

	public void user_enters_email_address(String emailAddr) throws Throwable {
		Thread.sleep(200);
		emailAddress.sendKeys(emailAddr);
	}

	public void user_confirms_email_address(String confirmEmailAddr) throws Throwable {
		Thread.sleep(200);
		confirmEmailAddress.sendKeys(confirmEmailAddr);
	}

	public void user_enters_pincode(String pcode) throws Throwable {
		Thread.sleep(200);
		postalCode.sendKeys(pcode);
	}

	public void user_enters_telephone_number(String phNo) throws Throwable {
		Thread.sleep(200);
		phNumber.sendKeys(phNo);
	}

	public void user_clicks_nextTravelInfo_button() throws Throwable {
		Thread.sleep(200);
		nextTravellerInfoButton.click();
	}

}
