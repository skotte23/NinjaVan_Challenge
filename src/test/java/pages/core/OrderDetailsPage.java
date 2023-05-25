package pages.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderDetailsPage extends BasePage {
	private WebDriver driver;
	private By printAirwayBillButton = By.xpath("//span[@data-key='print_pod']/..//span[contains(text(),'Print Proof of Delivery')]");
	private By verifyTrackingID = By.xpath("//div[@class='ant-row sc-dwztqd kcsTmj'][normalize-space()]");
	
	public OrderDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyOrderDetailsPage() {
		WebElement verifyTrackingIDElement = driver.findElement(verifyTrackingID);
		String ExpTrackingID = verifyTrackingIDElement.getText();
		if(TrackingPage.TrackignID.equalsIgnoreCase(ExpTrackingID)) {
			System.out.println("Order Dispaled details are verified");
		}
		else {
			System.out.println("Order Dispaled details are not correct");
		}
	}
	
	public void clickPrintAirwayBillButton() {
		waitForPageLoad(printAirwayBillButton);
		driver.findElement(printAirwayBillButton).click();
	}
	
	public PrintAirwayBillsDialog openPrintAirwayBillsDialog() {
		return new PrintAirwayBillsDialog(driver);
	}
}