package discount.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverWrapper {
	WebDriver driver;
	
	static {
		//driverWrapper = new DriverWrapper(); 
	}
	
	private static DriverWrapper driverWrapper = new DriverWrapper(); ;
	public DriverWrapper(){
		//DriverWrapper.driverWrapper = new DriverWrapper();
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://discount.stage.codev.co.il");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static DriverWrapper get() {
		return driverWrapper;
	}
	
	public void click(By by) {
		find(by).click();
	}
	public void setText(By by, String i) {
		find(by).sendKeys(i);
	}
	public String getText(By by) {
		return find(by).getText();
		//return null;
	}
	
	public void deleteAllCookies() {
		this.driver.manage().deleteAllCookies();
	}

	public void ImplicitWait(int TimeOut) {
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
	}
	
	
	private WebElement find(By by) {
		try {
			WebElement el = driver.findElement(by);
			//TODO verify is clickable and displayed
			return el;
		}catch(Exception e) {
			System.err.println("Failed to find element By = " + by);
		}
		//TODO assert false - stop test
		return null;
	}

	public void quit() {
		driver.quit();		
	}

	public WebElement findElement(By by) {
		WebElement el = driver.findElement(by);
		return el;
	}

	public  Object findElement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	

}
