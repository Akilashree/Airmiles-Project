package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage {
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@href='/en-qa/myaccount']")
	public static WebElement myAccount_link;

	@FindBy(how = How.XPATH, using = "html/body/div[2]/div[3]/div/div/div[2]/a/button")
	public static WebElement updateDetails_link;

	@FindBy(how = How.ID, using = "firstName")
	public static WebElement firstName;
	@FindBy(how = How.ID, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.ID, using = "completeProfileButton")
	public static WebElement profileButton;
//	@FindBy(how = How.XPATH, using = "html/body/div[2]/div[5]/div/div/div/button")
//	@FindBy(how = How.CLASS_NAME, using = "btn alp-success-popup center-block")
	
	
	@FindBy(how = How.LINK_TEXT, using = "OK")
	public static WebElement updateConfirm;

	public UpdateProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void user_is_on_my_account_Page() throws Throwable {
		Thread.sleep(2000);
		myAccount_link.click();
		System.out.println("On my account page");
	}

	public void user_is_on_update_details_Page() throws Throwable {
		Thread.sleep(2000);
		updateDetails_link.click();
		System.out.println("On update details page");
	}

	public void user_enters_firstname_and_lastname(String fname, String lname) throws Throwable {
		Thread.sleep(2000);
		firstName.clear();
		firstName.sendKeys(fname);
		lastName.clear();
		lastName.sendKeys(lname);
		profileButton.click();
		System.out.println("profileButton clicked");
	}

	public void user_saves_updated_details() throws Throwable {
		Thread.sleep(2000);
		updateConfirm.click();
		System.out.println("Details are saved successfully");
	}
}
