package org.automation.addToCart;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.KalkiFashionBaseClass;
import genericLibrary.ReadData;
import pomRepository.BasePage;

/***
 * TC_Kalki_AddToCart_081Test: Verify user is able is click on the kids button
 * available on the Homepage.
 * 
 * @author Rohit
 * 
 * @throws InterruptedException
 */

public class TC_Kalki_AddToCart_081Test extends KalkiFashionBaseClass {

	@Test(groups = "Functional")
	public void clickOnimageDescription() throws InterruptedException {
		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");

		// Step 2: Navigating on kids module page...
		basepage.getKalkiFashionKidsLink().click();
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("kidsPageTitle"), "You are not on Kids Page");
		Reporter.log("You are on Kids module Page", true);
	}
}