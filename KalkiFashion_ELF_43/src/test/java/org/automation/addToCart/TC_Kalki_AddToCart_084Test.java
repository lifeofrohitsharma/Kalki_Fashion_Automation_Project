package org.automation.addToCart;

import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.KalkiFashionBaseClass;
import genericLibrary.ReadData;
import pomRepository.BasePage;
import pomRepository.KidsPage;

/***
 * TC_Kalki_AddToCart_084Test: Verify user is able is click on the image
 * description available on Kids module page.
 * 
 * @author Rohit
 * 
 * @throws InterruptedException
 */

public class TC_Kalki_AddToCart_084Test extends KalkiFashionBaseClass {

	@Test(groups = "Functional")
	public void clickOnimageDescription() throws InterruptedException {
		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");
		String parentPageWinID = driver.getWindowHandle();

		// Step 2: Navigating on kids module page...
		basepage.getKalkiFashionKidsLink().click();
		KidsPage kidspage = new KidsPage(driver);
		try {
			// Step 3: Selection of product...
			js.executeScript("arguments[0].scrollIntoView(true)", kidspage.getProductionSelection());
			kidspage.getProductSelection().click();
			Set<String> childPageWinID = driver.getWindowHandles();
			childPageWinID.remove(parentPageWinID);
			for (String WinID : childPageWinID) {
				driver.switchTo().window(WinID);
			}
			Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("productSelection"),
					"Product has not been clicked");
			Reporter.log("Product has been clicked", true);
		} catch (Exception e) {
			kidspage.getSimilarProductPopUpClose().click();
		}
	}
}