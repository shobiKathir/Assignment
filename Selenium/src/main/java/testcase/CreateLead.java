package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
	
	@Test(dataProvider = "passDynamicData")
	public void runCreateLead(String cName,String fName,String lName) {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		}
	
	@DataProvider
	public String[][] passDynamicData() throws IOException {
		
		ReadDataFromExcel rde = new ReadDataFromExcel();
		String[][] input = rde.callData();
		
		return input;
	}
}





 
