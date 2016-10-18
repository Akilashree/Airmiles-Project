package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PassengerInfoPage {
	WebDriver driver;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlAdultTravel_ctl00_ddlGender")
	public static WebElement gender;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlAdultTravel_ctl00_txtDOB")
	public static WebElement DOB;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlAdultTravel_ctl00_txtPassportNo")
	public static WebElement passportNumber;
	
	//xpath=
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlAdultTravel_ctl00_txtCountry")
	public static WebElement issuingCtry;
	
	@FindBy(how = How.ID, using = "litnum_00_98")
	public static WebElement selectIssuingCtry;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlAdultTravel_ctl00_txtNationality")
	public static WebElement Nationality;
	
	//
	@FindBy(how = How.XPATH, using = ".//*[@id='litnumn_00_98']")
	public static WebElement selectNationality;
	
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlAdultTravel_ctl00_txtPassExDt")
	public static WebElement passportExpiry;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_LinkButton4")
	public static WebElement nextStepPaymentButton;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnBook")
	public static WebElement completeBooking;
	
	

	public PassengerInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void user_selects_gender(String Title) throws Throwable {
		System.out.println("Passenger details");
		Thread.sleep(300);
		gender.sendKeys(Title);
		System.out.println("Gender entered");
	}
	
	public void user_enters_DOB(String MM,String DD,String YYYY) throws Throwable {
		System.out.println("DOB details");
		Thread.sleep(300);
		DOB.sendKeys(MM);
		DOB.sendKeys(DD);
		DOB.sendKeys(YYYY);
		System.out.println("DOB entered");
	}
	
	public void user_enters_passport_number(String passportNo) throws Throwable {
		System.out.println("passpory details");
		Thread.sleep(300);
		passportNumber.sendKeys(passportNo);
		System.out.println("passpory entered");
	}
	
	public void user_selects_issuing_country(String issuingcountry) throws Throwable {
		System.out.println("issuing country details");
		Thread.sleep(300);
		issuingCtry.sendKeys(issuingcountry);
		issuingCtry.sendKeys(Keys.DOWN);
		selectIssuingCtry.click();
		//issuingCtry.sendKeys(Keys.DOWN);
		//issuingCtry.sendKeys(Keys.ENTER);
		System.out.println("issuing country entered");
	}
		
	public void user_selects_nationality(String national) throws Throwable {
		System.out.println("nationality details");
		Thread.sleep(300);
		Nationality.sendKeys(national);
		Nationality.sendKeys(Keys.DOWN);
		selectNationality.click();
		//Nationality.sendKeys(Keys.DOWN);
		//Nationality.sendKeys(Keys.ENTER);
		System.out.println("nationality entered");
	}
	
	public void user_enters_passport_expiry(String MM,String DD,String yearExpiry) throws Throwable {
		System.out.println("passport expiry details");
		Thread.sleep(300);
		passportExpiry.sendKeys(MM);
		passportExpiry.sendKeys(DD);
		passportExpiry.sendKeys(yearExpiry);
		System.out.println("passport expiry entered");
	}

	public void user_clicks_nextStepButton() throws Throwable {
		System.out.println("in next step button block");
		Thread.sleep(2000);
		nextStepPaymentButton.click();
		System.out.println("next step button clicked");
	}
	public void user_clicks_completeBookingButton() throws Throwable {
		System.out.println("complete booking block");
		Thread.sleep(2000);
		completeBooking.click();
		System.out.println("complete booking clicked");
	}
	
  
}