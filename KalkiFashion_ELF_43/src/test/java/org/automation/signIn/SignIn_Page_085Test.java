package org.automation.signIn;

import org.testng.annotations.Test;
import org.automation.POM_repo.BasePage;
import org.automation.POM_repo.LoginPage;
import org.automation.genricLibrary.KalkiFashionBaseClass;
import org.automation.genricLibrary.ReadData;
import org.testng.Assert;
import org.testng.Reporter;

public class SignIn_Page_085Test extends KalkiFashionBaseClass {

	/***
	 * SignIn_Page_085Test: verify that user is able to click on the signup link
	 * button or not.
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
		Assert.assertEquals(loginpage.getSignInLogo().getText(), ReadData.fromPropertyFile("sigInPageText"),
				"SignIn button is not clicked");

		Reporter.log("User clicked on SignIn button successfully", true);
	}
}