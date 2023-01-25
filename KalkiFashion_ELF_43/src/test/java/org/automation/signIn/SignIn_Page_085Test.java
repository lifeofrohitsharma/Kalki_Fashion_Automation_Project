package org.automation.signIn;

import org.testng.annotations.Test;

import genericLibrary.KalkiFashionBaseClass;
import genericLibrary.ReadData;
import pomRepository.BasePage;
import pomRepository.LoginPage;

import org.testng.Assert;
import org.testng.Reporter;

/***
 * SignIn_Page_085Test: verify that user is able to click on the signup link
 * button or not.
 * 
 * @author Rohit
 * 
 * @throws Exception
 */

public class SignIn_Page_085Test extends KalkiFashionBaseClass {

	@Test(groups = "Functional")
	public void signin() throws Exception {

		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");

		// Step 2: Click on Sigup link...
		basepage.getKalkiFashionSignupLink().click();
		LoginPage loginpage = new LoginPage(driver);
		Assert.assertEquals(loginpage.getSignInLogo().getText(), ReadData.fromPropertyFile("sigInPageText"),
				"SignIn button is not clicked");

		Reporter.log("User clicked on SignIn button successfully", true);
	}
}