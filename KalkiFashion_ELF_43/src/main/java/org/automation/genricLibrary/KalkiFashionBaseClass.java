package org.automation.genricLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class KalkiFashionBaseClass {
	public WebDriver driver;
	public Actions action;
	public WebDriverWait explicitWait;
	public JavascriptExecutor js;

	@Parameters("browserName")
	@BeforeClass
	public void browserSetup(@Optional("Chrome") String bname) throws Exception {

		// step1:Launching a browser
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Empty Chrome Browser is launched Successfully", true);
		} else if (bname.equalsIgnoreCase("edge")) {
			Reporter.log("empty edge browser is launched successfully", true);
		} else {
			throw new InvalidBrowserValueException();
		}
		driver.manage().window().maximize();
		Reporter.log("Browser Window is maximized");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Step2: Navigating to the url

		driver.get(ReadData.fromPropertyFile("url").toString());
		action = new Actions(driver);
		action.click().perform();

		String actualTitle = driver.getTitle();
		Assert.assertEquals(ReadData.fromPropertyFile("expectedTitle"), actualTitle, "Home page is not displayed");
		js = (JavascriptExecutor) driver;

	}

	@AfterClass
	public void browserTermination() {
		driver.quit();
	}

	@SuppressWarnings("serial")
	class InvalidBrowserValueException extends RuntimeException {
		public InvalidBrowserValueException() {
			super("Invalid Browser value is passed");
		}
	}
}