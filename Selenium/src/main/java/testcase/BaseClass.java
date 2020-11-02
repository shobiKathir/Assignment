package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;

	@Parameters({"username","password"})
	@BeforeMethod
	public void preCondition(String uName,String pWord) {
				
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys(uName);
	driver.findElementById("password").sendKeys(pWord);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();
	}
}

