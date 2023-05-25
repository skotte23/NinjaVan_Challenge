package pages.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage {
	
	static Logger mLog = Logger.getLogger(LoginPage.class);
	private WebDriver driver;
	
	private By emailInput = By.xpath("//input[@id='1-email']");
	private By passwordInput =By.xpath("//input[@id='2-password']");
	private By loginButton = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Open uRL on webPage
	public void openLoginPage(String loginPageUrl) {
		System.setProperty("webdriver.chrome.driver", "C:\\Tc_Selenium_Automation\\it-slms-selenium-auto\\lib\\3.141.5\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(loginPageUrl);
	}

	//Give Email ID in Email Text Box
	public void enterEmail(String email) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		//waitForPageLoad(emailInput);
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
		driver.findElement(emailInput).sendKeys(email);
	}
	//Give Password in Passowrd Text Box
	public void enterPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	//Clicking on Login Button
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
}
