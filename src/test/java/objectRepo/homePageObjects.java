package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageObjects {
	WebDriver driver;

	public homePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//use anyone out of pageObjects and pageObjectFactory
	
	//*****************pageObjects**********************************
	By upload=By.cssSelector("label[aria-label='Upload Files']");
	
	public WebElement upload() {
		return driver.findElement(upload);
	}
	
	
	/*
	//***********pageObjectFactory*****************************
	@FindBy(css="label[aria-label='Upload Files']")
	WebElement upload;
	
	public WebElement upload() {
		return upload;
	}
	*/
	

}
