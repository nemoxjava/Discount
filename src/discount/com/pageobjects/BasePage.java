package discount.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
	private static final Object Logo = null;
	protected DriverWrapper driver;
	
	public BasePage(DriverWrapper driver) {
		this.driver = driver;
	}
	public void Click(By by) {
		driver.click(by);
	}
	
	protected void setText(WebElement el, String value) {
		System.out.println("Set Value: " + value);
		el.sendKeys(value);
	}
	
	protected void setText(By by, String value) {
		System.out.println("Set Value: " + value);
		driver.findElement(by).sendKeys(value);;
	}
	
	protected String getText(By by) {
		return driver.getText(by);
	}
	
	public void FindLogo(By by) {
		if(driver.findElement(By.xpath("//*[@id=app]/header/div/div[1]/a/h2")) != null)
		System.out.print("Image displayed.");
		else
			System.out.print("Image not displayed.");
	}
	public static Object getLogo() {
		return Logo;
	}
	
	/*public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}
	public void forgetPassw(WebElement el) {
		el.click();
	}
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectText (WebElement el, String value) {
		Select textSelect = new Select(el);
		textSelect.deselectByVisibleText(value);
		sleep(1000);
	}*/

}
