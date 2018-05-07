package discount.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class createEventPage extends BasePage{
	
	By newEvent;
	By newEventBy;
	By nameEvent;
	By sugEvent;
	By vaadMeamen;
	By vaadMeargen;
	By category;
	By tatCategory;
	By kvuzatAvoda;
	By emsheh;
	WebElement ClickToBackOffice;
	
	public createEventPage (DriverWrapper driver) throws InterruptedException {
		super(driver);
		newEvent = (By) driver.findElement(By.linkText("/manage/elements/add"));
		newEventBy = By.linkText("/manage/elements/add");
		nameEvent = (By) driver.findElement(By.id("edit-element-name"));
		sugEvent = (By) driver.findElement(By.cssSelector("#edit-element-type-id"));
		vaadMeamen = (By) driver.findElement(By.cssSelector("#edit-owner-type-id"));
		vaadMeargen = (By) driver.findElement(By.cssSelector("#edit-organizer-type-id"));
		category = (By) driver.findElement(By.cssSelector("#edit-category"));
		tatCategory = (By) driver.findElement(By.cssSelector("#edit-sub-category"));
		kvuzatAvoda = (By) driver.findElement(By.cssSelector("#edit-job-category"));
		emsheh = (By) driver.findElement(By.id("edit-continue"));
		ClickToBackOffice = (WebElement) driver.findElement(By.xpath("//*[@id=\"app\"]/a"));
	}
	
	// Actions Methods
	
	public void Event1 (WebElement el, String value, String text) {
		setText(this.newEvent,text);
		setText(this.nameEvent, text);
		setText(newEventBy, value);
		setText(this.sugEvent, value);
		setText(this.vaadMeamen, value);
		setText(this.vaadMeargen, value);
		setText(this.category, value);
		setText(this.tatCategory, value);
		setText(this.kvuzatAvoda, value);
		Click((By) el);
		
	}
	public void enterBackOffice(WebElement ClickToBackOffice) {
		ClickToBackOffice.click();
	}
	
	//Validation Methods
	
		public String getErrorMsg() {
			By error = (By) driver.findElement(By.linkText("/manage/elements/add"));
			return ((WebElement) error).getText();
		}
		
		

}
