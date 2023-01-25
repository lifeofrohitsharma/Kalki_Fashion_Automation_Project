package org.automation.signIn;

import org.testng.annotations.Test;

import genericLibrary.KalkiFashionBaseClass;
import genericLibrary.ReadData;
import pomRepository.BasePage;
import pomRepository.LoginPage;

import org.testng.Assert;
import org.testng.Reporter;

/***
 * SignIn_Page_085Test: verify that user is able to click on the use mobile
 * number button. button or not.
 * 
 * @author Rohit
 * 
 * @throws Exception
 */

public class SignIn_Page_090Test extends KalkiFashionBaseClass {

	@Test(groups = "Functional")
	public void signin() throws Exception {

		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");

		// Step 2: Click on mobile number button...
		basepage.getKalkiFashionSignupLink().click();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.getUseMobileNoLink().click();

		// validation of use Mobile number button...
		if (loginpage.getMobileNumberTextField().isEnabled()) {
			Reporter.log("Use Mobile Number button is working", true);
		} else {
			Reporter.log("Use Mobile Number button is not working", true);

		}

	}
}