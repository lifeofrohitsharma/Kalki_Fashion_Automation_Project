package org.automation.signIn;

import org.testng.annotations.Test;

import java.io.File;

import org.automation.POM_repo.BasePage;
import org.automation.POM_repo.LoginPage;
import org.automation.genricLibrary.KalkiFashionBaseClass;
import org.automation.genricLibrary.ReadData;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;

public class SignIn_Page_088Test extends KalkiFashionBaseClass {

	/***
	 * SignIn_Page_088Test: verify that user is able to click on EyeIcon of Password
	 * Textfield.
	 * 
	 * @author Rohit
	 * 
	 * @throws Exception
	 */
	@Test(groups = "functionality")
	public void signin() throws Exception {

		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");

		// Step 2: Click on Sigup link...
		basepage.getKalkiFashionSignupLink().click();

		LoginPage loginpage = new LoginPage(driver);
		// Step 3: Enter valid email id...
		loginpage.getEmailIdTextField().sendKeys(ReadData.fromPropertyFile("email"));

		// Step 4: click on Singin button...
		loginpage.getSiginButton().click();

		// Step 5: Enter valid password in password textfield...
		loginpage.getPwdTextfield().sendKeys(ReadData.fromPropertyFile("password"));

		// Step 6: Click on the Eye Icon present in Enter password Textfield.
		loginpage.getEyeIconPswTextField().click();

		// Step 7: Taking Screenshot if the eyeicon really working.
		Actions action = new Actions(driver);
		action.clickAndHold(loginpage.getEyeIconPswTextField());
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/ss.png");
		FileHandler.copy(source, destination);

		Reporter.log("Check the reports for Verification", true);
	}
}