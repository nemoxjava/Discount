package discount.com.tests;

import discount.com.pageobjects.LoginPage;
import discount.com.pageobjects.createEventPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test(priority = 1) //runs first
public class createEvent extends BaseTest {
private static final WebElement ClickToBackOffice = null;

/*
	public createEvent(DriverWrapper driver) {
		//super(driver);
		
	}*/
	
	@Test
	public void createTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login("1", "1234@qwer");
		createEventPage eventPage = new createEventPage(driver);
		eventPage.enterBackOffice(ClickToBackOffice);
	}
	/*createEventPage tryOne = new createEventPage(driver) {
		//tryOne.
	}*/
}
