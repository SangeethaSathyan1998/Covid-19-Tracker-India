package covidSteps;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import commonUtilities.BaseClass;
import covidPageObjects.covidPageObjects;
import io.cucumber.java.*;

public class covidSteps extends BaseClass {
	covidPageObjects covidpageobjects = new covidPageObjects();

	public covidSteps() {
		PageFactory.initElements(driver, covidpageobjects);
	}

	@Before
	public void initialize() throws ClassNotFoundException, IOException {
		selectBrowser();
	}

	@After
	public void cleanup() throws IOException {
		driver.close();
		driver.quit();
	}

	public void isSiteLoaded() throws IOException {
		try {
			BaseClass.waitInSeconds(3);
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//Project.properties");
			prop.load(file);
			String pageUrl = prop.getProperty("url");
			driver.manage().window().maximize();		
			driver.get(pageUrl);
			log.info("Page loaded successfully: " + pageUrl);
		} catch (Exception e) {
			log.error("Error loading the page", e);
		}
	}
	// ..........................................................................

	public void isUserOnLandingPage() {
		BaseClass.waitInSeconds(2);
		String expectedText = "COVID-19 Tracker - India";
		String actualText = covidpageobjects.ismainpage.getText();
		assertEquals(actualText,expectedText);
		
	}

	public void selectDropdown() {
		BaseClass.waitInSeconds(2);
		BaseClass.selectDropdownByIndex(covidpageobjects.selectdropdown, 11);
		BaseClass.waitInSeconds(5);
		covidpageobjects.totalcases.click();
	}

	public void isTotalCaseDiplayed() {
		BaseClass.waitInSeconds(2);
		System.out.println(covidpageobjects.resultcardtitle.getText());
//		Boolean totalCases = covidpageobjects.totalcases.isDisplayed();
//		if(totalCases = true)
//		{
//			System.out.println("Total Cases displayed");
//		}
//		else
//		{
//			System.out.println("Total Cases not displayed");
//		}

		String totalValue = covidpageobjects.totalcases.getText();
		log.info(totalValue);

	}

	public void isActiveCasesDisplayed() {
		BaseClass.waitInSeconds(2);
//		Boolean activecases = covidpageobjects.activecases.isDisplayed();
//		if(activecases = true)
//		{
//			System.out.println("Active Cases displayed");
//		}
//		else
//		{
//			System.out.println("Active Cases not displayed");
//		}

		String activevalue = covidpageobjects.activecases.getText();
		log.info(activevalue);

	}

	public void isRecoveredDisplayed() {
		BaseClass.waitInSeconds(2);
//		Boolean recoveredcases = covidpageobjects.recovered.isDisplayed();
//		if(recoveredcases = true)
//		{
//			System.out.println("Recovered Cases displayed");
//		}
//		else
//		{
//			System.out.println("Recovered Cases not displayed");
//		}

		String recoveredvalue = covidpageobjects.recovered.getText();
		log.info(recoveredvalue);

	}

	public void isDeathsDisplayed() {
		BaseClass.waitInSeconds(2);
//		Boolean deathcases = covidpageobjects.deaths.isDisplayed();
//		if(deathcases = true)
//		{
//			System.out.println("Death Cases displayed");
//		}
//		else
//		{
//			System.out.println("Death Cases not displayed");
//		}
//		
		String deathvalue = covidpageobjects.deaths.getText();
		log.info(deathvalue);

	}

	public void isPieDisplayed() {
		BaseClass.waitInSeconds(2);
		assertTrue(covidpageobjects.piechart.isDisplayed());
		BaseClass.waitInSeconds(2);
		covidpageobjects.totalcheckboxpie.click();
		BaseClass.waitInSeconds(2);
		covidpageobjects.recoveredcheckboxpie.click();
		BaseClass.waitInSeconds(2);
		covidpageobjects.actvecasescheckboxpie.click();
		BaseClass.waitInSeconds(2);
		covidpageobjects.deathcheckboxpie.click();
		BaseClass.waitInSeconds(2);
		covidpageobjects.downloadpie.click();
		BaseClass.waitInSeconds(2);
	}
	
	public void islineChartDisplayed() {
		BaseClass.waitInSeconds(4);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,600)");
	    BaseClass.waitInSeconds(3);
		assertTrue(covidpageobjects.graph.isDisplayed());
		BaseClass.waitInSeconds(2);
		covidpageobjects.totalcheckboxgraph.click();
		BaseClass.waitInSeconds(2);
		covidpageobjects.recoveredcheckboxgraph.click();
		BaseClass.waitInSeconds(2);
		covidpageobjects.actvecasescheckboxgraph.click();
		BaseClass.waitInSeconds(2);
		covidpageobjects.deathcheckboxgraph.click();
		covidpageobjects.downloadchart.click();
		BaseClass.waitInSeconds(2);
	}
	
	
	// ............................................................................
}
