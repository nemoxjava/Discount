package discount.com.tests;

import discount.com.pageobjects.DriverWrapper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	DriverWrapper driver;
	@BeforeTest
	public void setup(){
		//driver = DriverWrapper.get();
		driver = new DriverWrapper();
	}
	/*public void Cookies() {
		driver.deleteAllCookies();
	}*/
	
//	@BeforeClass
//	public void tLogin() {
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.Login("2", "123456");
//		sleep(1000);
//	}
	
	@AfterMethod
	@AfterTest 
	public void tearDown() {
		driver.quit();
	}
	
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
