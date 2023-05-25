package pages.core;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintAirwayBillsDialog extends BasePage {
	private WebDriver driver;
	private By printAirwayButton =By.xpath("//span[@data-key='print_pod']/..//span[contains(text(),'Print Proof of Delivery')]");
	private By perPage = By.xpath("//div[@aria-label='1 bills Per page");
	private By printButton = By.xpath("//button[@type='Print']");

	public PrintAirwayBillsDialog(WebDriver driver) {
		super(driver);
	}
	
	public void ClickonPrintAirwayButton() {
		//Thread.sleep(10000);
		String currentHandle= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
			String getTabname = driver.getTitle();
			if(getTabname.equalsIgnoreCase("Ninja Dashboard")) {
				if(!actual.equalsIgnoreCase(currentHandle)) {
					//Switch to the opened tab
					driver.switchTo().window(actual);
				//	Thread.sleep(3000);
					JavascriptExecutor js = (JavascriptExecutor)driver;
					WebElement btnAPrintAirway = driver.findElement(printAirwayButton);
					js.executeScript("arguments[0].click();", btnAPrintAirway);
				}
			}
		}
	}

	public void selectOneBillPerPage() {
		WebElement optionOnePerPage = driver.findElement(perPage);
		optionOnePerPage.click();
	}

	public void clickPrintButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement printDialogButton = driver.findElement(printButton);
		js.executeScript("arguments[0].click();", printDialogButton);
	}
}