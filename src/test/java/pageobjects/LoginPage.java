package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;

	@FindBy(how = How.ID, using = "disableIdLogin")
	public static WebElement log_in;

	@FindBy(how = How.ID, using = "login-modal-email-field")
	public static WebElement email_id;

	@FindBy(how = How.ID, using = "login-modal-password-field")
	public static WebElement passwrd;

	@FindBy(how = How.ID, using = "loginLabel")
	public static WebElement login_button;

	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void user_is_on_Home_Page() throws Throwable {

		System.out.println("step0");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", log_in);
		Thread.sleep(2000);
		System.out.println("step1");

	}

	public void user_enters_UserName_and_Password(String uname, String pwd) throws Throwable {
		System.out.println("Step2");
		email_id.sendKeys(uname);

		System.out.println("Step3");
		passwrd.sendKeys(pwd);

		System.out.println("Step4");
		login_button.click();

		System.out.println("Step5");

	}

	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");

	}

}
