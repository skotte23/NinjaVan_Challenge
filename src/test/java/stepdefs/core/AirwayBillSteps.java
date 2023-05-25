package stepdefs.core;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.core.LandingPage;
import pages.core.LoginPage;
import pages.core.OrderDetailsPage;
import pages.core.PrintAirwayBillsDialog;
import pages.core.TrackingPage;
import cucumber.api.java.en.And;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.IOException;
import java.net.URL;

public class AirwayBillSteps {
	static Logger mLog = Logger.getLogger(AirwayBillSteps.class);
	//GlobalVariable glbVar = GlobalVariable.getInstance();
	
	public AirwayBillSteps() {
		super();
		AirwayBillSteps.mLog.trace("Start of MainWorkAreaStepdef()");

	}
	
	private LoginPage loginPage;
	private LandingPage landingPage;
	private TrackingPage trackingPage;
	private OrderDetailsPage orderDetailsPage;
	private PrintAirwayBillsDialog printAirwayBillsDialog;
	
	private WebDriver driver;
	public static String TrackingID=null;
	@Given("Shipper opened the Ninja Dashboard login page at {string}")
	public void openLoginPage(String loginPageUrl) {
		AirwayBillSteps.mLog.trace("public void i_am_on_the_home_page_after_login_as( String stepId, String userId )");
		AirwayBillSteps.mLog.info("1" + " on the home page after login as " + loginPageUrl);
		try {
			loginPage = new LoginPage(driver);
			loginPage.openLoginPage(loginPageUrl);
		}
		catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Failed to Open login page:" + e.getMessage());
		}
		
	}
	
	@Given("shipper had an order created under his account")
	public void createOrder() {
		// Logic to create an order
	}
	@When("shipper login by using credentials {string} and {string}")
	public void login(String email, String password) {
		try {
			loginPage.enterEmail(email);;
			loginPage.enterPassword(password);
			loginPage.clickLoginButton();
			
			landingPage = new LandingPage(driver);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Then("shipper arrived at landing page")
	public void verifyLandingPage() throws InterruptedException {
		try {
			landingPage.verifyLandingPage();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("shipper go to the tracking page")
	public void goToTrackingPage() throws InterruptedException {
		try {
			trackingPage = landingPage.goToTrackingPage();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@And("shipper click search button")
	public void clickSearchButton() throws InterruptedException {
		try {
			trackingPage.clickSearchButton();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@And("shipper select the first tracking ID in the table")
	public void selectFirstTrackingID() throws InterruptedException {
		try {
			trackingPage.selectFirstTrackingID();
			orderDetailsPage = trackingPage.goToOrderDetailsPage();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("QA verify that the Order Details page is shown")
	public void verifyOrderDetailsPage() {
		try {
			orderDetailsPage.verifyOrderDetailsPage();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("shipper click Print Airway Bill button")
	public void clickPrintAirwayBillButton() throws InterruptedException {		
		try {
			printAirwayBillsDialog.ClickonPrintAirwayButton();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@And("shipper select 1 bill per page in Print Airway Bills dialog")
	public void selectOneBillPerPage() {
		try {
			printAirwayBillsDialog.selectOneBillPerPage();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("shipper click print button in Print Airway Bills dialog")
	public void clickPrintButton() {
		try {
			printAirwayBillsDialog.clickPrintButton();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("QA verify that the tracking ID text in the pdf")
	public void verifyTrackingIDInPDF() {
		// Logic to verify the tracking ID in the generated PDF
		String pdfUrl = driver.getCurrentUrl();
		String trackingIDInPDF = extractTextFromPDF(pdfUrl);
		if (TrackingID.equals(trackingIDInPDF)) {
			System.out.println("Tracking ID in PDF matches the expected value.");
		}
		else {
			System.out.println("Tracking ID in PDF does not match the expected value.");
		}

		// Close the PDF window/tab and switch back to the main window
		driver.close();
	}
	
	private String extractTextFromPDF(String pdfUrl) {
		String text = "";
		try (PDDocument document = PDDocument.load(new URL(pdfUrl).openStream())) {
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			text = pdfTextStripper.getText(document);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
	
	@After
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}