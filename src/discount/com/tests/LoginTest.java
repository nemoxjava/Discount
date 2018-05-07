package discount.com.tests;

import discount.com.pageobjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	// @BeforeClass
	//
	// public void tLogin() {
	//
	//
	// }
	@Test(priority = 1) // runs first
	public void loginAdmin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login("1", "1234@qwer");
		loginPage.FindLogo(By.xpath("//*[@id=app]/header/div/div[1]/a/h2"));
		loginPage.Click(By.xpath("//*[@id=\"app\"]/nav[1]/ul/li[2]/a"));
		loginPage.Click(By.xpath("//*[@id=\"app\"]/nav[1]/ul/li[3]/a"));
		loginPage.Click(By.xpath("//*[@id=\"app\"]/nav[1]/ul/li[4]/a"));
		loginPage.Click(By.xpath("//*[@id=\"app\"]/nav[1]/ul/li[5]/a"));
		loginPage.Click(By.xpath("//*[@id=\"app\"]/nav[1]/ul/li[6]/a/span"));
		loginPage.Click(By.xpath("//*[@id=\"app\"]/nav[1]/ul/li[7]/a"));
		//loginPage.verifyErrorMsg("expected");
		}
	
	@Test(priority = 2) //runs second
	public void LoginWorker() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login("107701", "zxasqw12");
		sleep(5000);
		loginPage.FindLogo(By.xpath("//*[@id=app]/header/div/div[1]/a/h2"));
	}
}
