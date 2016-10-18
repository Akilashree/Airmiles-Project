package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
//protected WebDriver driver = new ChromeDriver();	
		
public class DriverFactory {

    protected static WebDriver driver;


    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

   public void destroyDriver() {
	  // driver.close();
      // driver.quit();
      // driver = null;
    }
}