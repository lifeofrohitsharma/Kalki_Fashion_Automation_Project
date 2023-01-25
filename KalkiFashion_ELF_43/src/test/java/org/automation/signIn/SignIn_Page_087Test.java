package org.automation.signIn;

import org.testng.annotations.Test;

import genericLibrary.KalkiFashionBaseClass;
import genericLibrary.ReadData;
import pomRepository.BasePage;
import pomRepository.LoginPage;

import org.testng.Assert;
import org.testng.Reporter;

/***
 * SignIn_Page_087Test verify that user is able to enter the data into emailid
 * textfield or not.
 * 
 * @author Rohit
 * 
 * @throws Exception
 */

public class SignIn_Page_087Test extends KalkiFashionBaseClass {

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
		// Step 3: Enter valid email id...
		loginpage.getEmailIdTextField().clear();

		// Step 4: validation Part...
		loginpage.getEmailIdTextField().sendKeys(ReadData.fromPropertyFile("email"));
		System.out.println(loginpage.getEmailIdTextField().getAttribute("value"));
		Assert.assertEquals(loginpage.getEmailIdTextField().getText(), ReadData.fromPropertyFile("email"),
				"Email-ID Textfield is not working.");

		Reporter.log("Email-ID Textfield is working fine", true);
	}
}