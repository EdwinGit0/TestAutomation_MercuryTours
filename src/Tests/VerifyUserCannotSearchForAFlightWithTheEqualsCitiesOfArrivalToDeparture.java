package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.flightFinderPage;
import Page.selectFlightPage;

public class VerifyUserCannotSearchForAFlightWithTheEqualsCitiesOfArrivalToDeparture {
	String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
	public WebDriver driver;
	private flightFinderPage fliFinderPage;
	private selectFlightPage selFlightPage;
	
	@Test
	public void veriNotCitiesEquals() {
	    
		fliFinderPage = new flightFinderPage(driver);
		selFlightPage = new selectFlightPage(driver);
		fliFinderPage.validFlightFinder2();
	    Assert.assertFalse(selFlightPage.IsTitleDisplayed("Select a Flight: Mercury Tours"), "Message was not displayed");
	}
	
	@BeforeTest
	public void setup() {
		String adress = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", adress +"\\src\\Chrome_driver\\chromedriver.exe");					
		driver = new ChromeDriver();					  									
		driver.get(baseUrl);
		
	}
	
    @AfterTest
    public void quit() {   	
    	driver.close();	
    }
}
