package org.automation.signIn;

import org.testng.annotations.Test;
import org.automation.POM_repo.BasePage;
import org.automation.POM_repo.LoginPage;
import org.automation.genricLibrary.KalkiFashionBaseClass;
import org.automation.genricLibrary.ReadData;
import org.testng.Assert;
import org.testng.Reporter;

public class SignIn_Page_087Test extends KalkiFashionBaseClass {

	/***
	 * SignIn_Page_087Test verify that user is able to enter the data into emailid
	 * textfield or not.
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
		loginpage.getEmailIdTextField().clear();

		// Step 4: validation Part...
		loginpage.getEmailIdTextField().sendKeys(ReadData.fromPropertyFile("email"));
		System.out.println(loginpage.getEmailIdTextField().getAttribute("value"));
		Assert.assertEquals(loginpage.getEmailIdTextField().getText(), ReadData.fromPropertyFile("email"),
				"Email-ID Textfield is not working.");

		Reporter.log("Email-ID Textfield is working fine", true);
	}
}