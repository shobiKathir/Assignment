package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PepperFry {
	public static void main(String[] args) throws  InterruptedException  {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-infobars");
		 options.addArguments("--disable-notifications");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(8000);
		driver.findElementByXPath("(//a[@class='popup-close'])[6]").click();
		
		
		/*WebElement furniture = driver.findElementByXPath("//div[@id='menu_wrapper']//a");
		//a[@class='level-top active']
		
		Actions act = new Actions(driver);
		act.clickAndHold(furniture).perform();
		WebElement officeChair = driver.findElementByXPath("//div[@id='meta-furniture']/div[1]/div[3]/div[2]/div[12]/a[1]");
		Thread.sleep(2000);
		officeChair.click();*/
	
	}
}
