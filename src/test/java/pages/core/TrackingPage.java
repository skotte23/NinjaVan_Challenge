package pages.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrackingPage extends BasePage {
	private WebDriver driver;
	private By searchButton = By.xpath("//button[contains(@class,'ant-btn')][normalize-space()='Search']");
	private By FirsttrackingIDLink = By.xpath("//span[contains(text(),'Requested Tracking ID')]//following::div[contains(@class,'sc-iwsKbI dQGHtX')][normalize-space()][1]");
	public static String TrackignID = "";
	
	public TrackingPage(WebDriver driver) {
		super(driver);
	}

	public void clickSearchButton() {
		waitForPageLoad(searchButton);
		driver.findElement(searchButton).click();
	}

	public void selectFirstTrackingID() {
		waitForPageLoad(FirsttrackingIDLink);
		WebElement firstTrackingID = driver.findElement(FirsttrackingIDLink);
		TrackignID = firstTrackingID.getText();
		driver.findElement(FirsttrackingIDLink).click();
	}

	public OrderDetailsPage goToOrderDetailsPage() {
		return new OrderDetailsPage(driver);
	}	
}
