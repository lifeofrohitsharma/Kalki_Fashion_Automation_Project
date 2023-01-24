package org.automation.signIn;

import org.testng.annotations.Test;
import org.automation.POM_repo.BasePage;
import org.automation.POM_repo.LoginPage;
import org.automation.genricLibrary.KalkiFashionBaseClass;
import org.automation.genricLibrary.ReadData;
import org.testng.Assert;
import org.testng.Reporter;

public class SignIn_Page_086Test extends KalkiFashionBaseClass {

	/***
	 * SignIn_Page_086Test: verify that user is able to signin or not.
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

		// Step 6: click on sigin button...
		loginpage.getSiginButton().click();

		Reporter.log("User Siggned in succesfully...", true);
	}
}