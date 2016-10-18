package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	WebDriver driver;

	// "//*[@href='/en-qa/redeem']"
	// html/body/div[2]/div[1]/nav/div/div[2]/div/div/span[2]/div/div[2]/div[1]/ul/li[3]/a
	//html/body/div[2]/div[1]/nav/div/div[2]/div/div/span[2]/div/div[2]/div[1]/ul/li[3]/a
	//.//*[@id='header-navbar-collapse']/div/div/span[2]/div/div[2]/div[1]/ul/li[3]/a
	//.//*[@id='header-navbar-collapse']/div/div/span[2]/div/div[2]/div[1]/ul/li[3]/a
	
	
	@FindBy(how = How.LINK_TEXT, using = "REDEEM AIR MILES")
	public static WebElement redeem_lnk;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'flighthotel')]")
	public static WebElement travel_lnk;

	// *[@class='category-img-arrow']//p[contains(text(),'VIEW MORE')]
	@FindBy(how = How.XPATH, using = "//*[@href='/en-qa/redeemcat/FLIGHT/ssotravelshop.html']")
	public static WebElement evoucher_lnk;
	
	//id='ssoBookNow'
	//html/body/div[2]/div[2]/div[1]/div/div[4]/div/div[1]/form/div/div[3]/button
	//button[contains(@class,'btn btn-default btn-large collect-now-button-style-spend')]
	@FindBy(how = How.CSS, using = "#ssoBookNow")
	public static WebElement bookNow_button;
	// .Btn
	// *[@class='BtnHolder']//button[contains(@class,'btn')]
	@FindBy(how = How.CSS, using = ".Btn")
	public static WebElement banner_close_button;

	@FindBy(how = How.ID, using = "ctl00_FlghtMLink")
	public static WebElement Flight_text;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_lnkTravelPlan_1")
	public static WebElement oneWay_radio_button;
	// id= ctl00_ContentPlaceHolder1_txtFrom
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtFrom")
	public static WebElement enterFromDepatureCity;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtTo")
	public static WebElement toDepatureCity_textBox;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txtDepChg")
	public static WebElement datePicker;
	@FindBy(how = How.XPATH, using = "html/body/div[1]/table/tbody/tr[5]/td[7]")
	public static WebElement departure_date;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnSearch")
	public static WebElement searchFlight;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlFlights_ctl00_btnSlct")
	public static WebElement selectDepartureButton;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_dlOutFlights_ctl00_AddCart")
	public static WebElement addFlightToCart;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btnOpenCart")
	public static WebElement proceedToCheckOut;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_LinkButton2")
	public static WebElement clickProceedToCheckOut;
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_CheckBox1")
	public static WebElement acceptTC;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void user_clicks_on_Redeem_Airmiles_link() throws Throwable {
		System.out.println("Step2");
		Thread.sleep(2000);
		redeem_lnk.click();
	}

	public void user_clicks_on_Travel_category() throws Throwable {
		Thread.sleep(2000);
		travel_lnk.click();
	}

	public void user_clicks_on_Evoucher_catalog() throws Throwable {
		Thread.sleep(2000);
		evoucher_lnk.click();
		System.out.println("evoucher link clicked");
	}

	public void user_clicks_on_Book_Now() throws Throwable {
		
		System.out.println("in booknow block");
		Thread.sleep(3000);
	//	bookNow_button.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookNow_button);
		Thread.sleep(3000);

		// System.out.println("book now button clicked");
		// Alert alert = driver.switchTo().alert();
		// System.out.println("popup");
		// String alertMessage =driver.switchTo().alert().getText();
		// System.out.println(alertMessage);
		// alert.accept();
		// System.out.println("continue pop up clicked clicked");
		banner_close_button.click();
		System.out.println("banner closed");
	}

	public void user_selects_oneway_round() throws Throwable {
		Thread.sleep(200);
		oneWay_radio_button.click();
	}

	public void user_enters_from_departure_city(String FromCity) throws Throwable {
		// enterFromDepatureCity.sendKeys(FromCity);
		Thread.sleep(300);
		
		WebElement DropDownPath = enterFromDepatureCity;
		DropDownPath.sendKeys(FromCity);
		Thread.sleep(300);
		DropDownPath.sendKeys(Keys.DOWN);
		Thread.sleep(300);
		DropDownPath.sendKeys(Keys.UP);
		Thread.sleep(300);
		DropDownPath.sendKeys(Keys.TAB);
		Thread.sleep(300);
	}

	public void user_enters_to_departure_city(String ToCity) throws Throwable {

		Thread.sleep(300);

		WebElement DropDownPath = toDepatureCity_textBox;
		DropDownPath.sendKeys(ToCity);
		Thread.sleep(300);
		DropDownPath.sendKeys(Keys.DOWN);
		Thread.sleep(300);
		DropDownPath.sendKeys(Keys.UP);
		Thread.sleep(300);
		DropDownPath.sendKeys(Keys.TAB);
		Thread.sleep(300);

	}

	public void user_selects_date_from_date_picker() throws Throwable {
		datePicker.click();
		departure_date.click();
		/*
		 * driver.findElement(By.id("datepicker")).click();
		 * 
		 * List<WebElement> allDates= driver.findElements(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']//td"));
		 * 
		 * for(WebElement ele:allDates) {
		 * 
		 * String date=ele.getText();
		 * 
		 * if(date.equalsIgnoreCase("28")) { ele.click(); break; }
		 * 
		 * }
		 */
	}

	public void user_clicks_search_flights() throws Throwable {
		searchFlight.click();
		Thread.sleep(3000);
	}

	public void user_clicks_on_Select_departure() throws Throwable {
		selectDepartureButton.click();

	}

	public void user_clicks_on_Add_to_cart() throws Throwable {
		Thread.sleep(3000);
		addFlightToCart.click();
	}

	public void user_selects_proceed_to_checkout() throws Throwable {
		Thread.sleep(3000);
		proceedToCheckOut.click();
	}

	public void user_clicks_on_proceed_to_checkout() throws Throwable {
		Thread.sleep(2000);
		clickProceedToCheckOut.click();
	}

	public void user_accepts_terms_and_conditions() throws Throwable {
		Thread.sleep(3000);
		acceptTC.click();
	}

}
