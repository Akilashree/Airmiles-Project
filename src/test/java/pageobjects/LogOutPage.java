package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage{

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'login-text no-pad')]")
	public static WebElement logOutButton;
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn yes-to-logout')]")

	public static WebElement logOutConfirm;

	public LogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void User_click_logout() throws Throwable {
		Thread.sleep(4000);
		System.out.println("in log out block");

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logOutButton);

		Thread.sleep(2000);
		System.out.println("Logout clicked");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logOutConfirm);

		System.out.println("button clciked");
	}

	public void logout() throws Throwable {
		System.out.println("Logout successfully");
		Thread.sleep(2000);
	}

}
