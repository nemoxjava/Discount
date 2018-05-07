package discount.com.pageobjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage {
	
	By user =  By.id("edit-employeeidinput");
	By password = By.id("edit-passwordinput");
	By btnLogin = By.id("edit-submitloginbutton");
	By forgotPasswordLink = By.xpath("//*[@id=\"edit-forgotpasswordbutton\"]");
	public LoginPage (DriverWrapper driver) {
		super(driver);
		
	}
	
	//Action Methods
	
	public void Login(String i, String j) {
		setText(this.user, i);
		setText(this.password, j);
		Click(btnLogin);
	}
	
	

	public void forgotPassword() {
		Click(forgotPasswordLink);
	}
	
	
	//Validation Methods
	
	
	
	private String getErrorMsg() {
		return getText(By.xpath("//*[@id=\"app\"]/main/section/div[1]/div/div"));
		/*WebElement error = driver.findElement(By.xpath("//*[@id=\"app\"]/main/section/div[1]/div/div"));
		return error.getText();*/
	}
	
	//is there an error
	
	public boolean errorMsgExist() {
		try { 
			//TODO
			//driver.findElement(By.cssSelector("#app > main > section > div.top-part > div > div"));
			return true;
		}
		catch (Exception err) {
			return false;
		}
	}
	
	//Current Page URL
	
	public String getPageURL() {
		return "";
		/*String address = driver.getCurrentUrl();
		return address;*/
		
	}

	public void verifyErrorMsg(String expected) {
		Assert.assertEquals(expected, getErrorMsg());		
	}

	public void verifyLogo() {
		if(driver.findElement(By.xpath("//*[@id=app]/header/div/div[1]/a/h2")) != null)
			System.out.print("Image displayed.");
			else
				System.out.print("Image not displayed.");		
	}
		

}
