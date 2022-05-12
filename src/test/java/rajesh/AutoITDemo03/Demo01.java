package rajesh.AutoITDemo03;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepo.homePageObjects;

public class Demo01 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Selenium\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpg2png.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		homePageObjects hp=new homePageObjects(driver);
		hp.upload().click(); //using page object and pageObjectFactory
//		driver.findElement(By.cssSelector("label[aria-label='Upload Files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Java Selenium\\AutoIT\\AutoITDemo02.exe");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Download All']")));
		boolean tell=driver.findElement(By.xpath("//span[text()='Download All']")).isDisplayed();
		System.out.println(tell);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		WebElement element=driver.findElement(By.xpath("//div[@class=\"files page__files\"]/div[3]/button"));
		
		Actions a=new Actions(driver);
		a.moveToElement(element).click().perform();

}
	
}
