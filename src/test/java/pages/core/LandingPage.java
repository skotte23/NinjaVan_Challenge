package pages.core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class LandingPage extends BasePage {
	//private  WebDriver driver;
	private static LandingPage lndngPage = null;
	private By HeyMessage = By.xpath("//span[contains(text(),'Hey there!')]");
	private By trackingLink = By.xpath("//span[contains(text(),'Tracking')]");
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyLandingPage() throws InterruptedException {
		//Alert pop-up
		WebElement ele = driver.findElement(By.xpath("document.querySelector(\"i[aria-label='icon: close']\")"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		WebDriverWait wait1=new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.textToBePresentInElementLocated(HeyMessage, "Hey there!"));
		WebElement HeyElement = driver.findElement(HeyMessage);
		Assert.assertTrue(HeyElement.isDisplayed());
	}
	
	public TrackingPage goToTrackingPage() {
		driver.findElement(trackingLink).click();
		return new TrackingPage(driver);
	}
}
