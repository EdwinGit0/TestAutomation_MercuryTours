package Page;


import org.openqa.selenium.WebDriver;

public class selectFlightPage {
	 WebDriver driver;
	
	public selectFlightPage(WebDriver driver) {
		this.driver = driver;
	}
	 public boolean IsTitleDisplayed(String message) {
	    	return driver.getTitle().equals(message);
	    } 
}
