package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightFinderPage {
	WebDriver driver;
	
	//data from not day that is not within the month Test case (1)
	@FindBy(xpath = ".//input[(@name='register')]")
	private WebElement register;
	@FindBy(xpath = ".//td/a[text()='Flights']")
	private WebElement flights;
	@FindBy(xpath = ".//input[(@name='tripType')][1]")
	private WebElement tripType;
	@FindBy(xpath = ".//select[(@name='passCount')]/option[(@value='2')]")
	private WebElement numPassengers;
	@FindBy(xpath = ".//select[(@name='fromPort')]/option[(@value='London')]")
	private WebElement cityDeparting;
	@FindBy(xpath = ".//select[(@name='fromMonth')]/option[(@value='2')]")
	private WebElement monthOn;
	@FindBy(xpath = ".//select[(@name='fromDay')]/option[(@value='31')]")
	private WebElement dayOn;
	@FindBy(xpath = ".//select[(@name='toPort')]/option[(@value='Paris')]")
	private WebElement cityArriving;
	@FindBy(xpath = ".//select[(@name='toMonth')]/option[(@value='4')]")
	private WebElement monthReturning;
	@FindBy(xpath = ".//select[(@name='toDay')]/option[(@value='31')]")
	private WebElement dayReturning;
	@FindBy(xpath = ".//input[(@value='Coach')]")
	private WebElement economyService;
	@FindBy(xpath = ".//select[(@name='airline')]/option[1]")
	private WebElement airlineNoPref;
	@FindBy(xpath = ".//input[(@name='findFlights')]")
	private WebElement findFlights;
	
	//data from not equals cities of arrival to departure Test case (2)
	@FindBy(xpath = ".//select[(@name='fromMonth')]/option[(@value='4')]")
	private WebElement monthOn2;
	@FindBy(xpath = ".//select[(@name='fromDay')]/option[(@value='15')]")
	private WebElement dayOn2;
	@FindBy(xpath = ".//select[(@name='toPort')]/option[(@value='London')]")
	private WebElement cityArriving2;
	@FindBy(xpath = ".//select[(@name='toMonth')]/option[(@value='5')]")
	private WebElement monthReturning2;
	@FindBy(xpath = ".//select[(@name='toDay')]/option[(@value='15')]")
	private WebElement dayReturning2;
	
	public flightFinderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public selectFlightPage validFlightFinder() {
		register.click();
		flights.click();
		tripType.click();
		numPassengers.click();
		cityDeparting.click();
		monthOn.click();
		dayOn.click();
		cityArriving.click();
		monthReturning.click();
		dayReturning.click();
		economyService.click();
		airlineNoPref.click();
		findFlights.click();
		
		return new selectFlightPage(driver);
	}
	
	public selectFlightPage validFlightFinder2() {
		register.click();
		flights.click();
		tripType.click();
		numPassengers.click();
		cityDeparting.click();
		monthOn2.click();
		dayOn2.click();
		cityArriving2.click();
		monthReturning2.click();
		dayReturning2.click();
		economyService.click();
		airlineNoPref.click();
		findFlights.click();
		
		return new selectFlightPage(driver);
	}
}