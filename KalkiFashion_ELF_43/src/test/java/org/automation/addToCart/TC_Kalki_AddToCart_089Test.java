package org.automation.addToCart;

import java.util.Set;

import org.automation.POM_repo.BasePage;
import org.automation.POM_repo.KidsPage;
import org.automation.genricLibrary.KalkiFashionBaseClass;
import org.automation.genricLibrary.ReadData;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Kalki_AddToCart_089Test extends KalkiFashionBaseClass {

	/***
	 * TC_Kalki_AddToCart_082Test: Verify user is able is click on the Add To cart
	 * button.
	 * 
	 * @author Rohit
	 * @throws InterruptedException
	 */
	@Test(groups = "system")
	public void clickOnimageDescription() throws InterruptedException {
		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");
		String parentPageWinID = driver.getWindowHandle();

		// Step 2: Navigating on kids module page...
		basepage.getKalkiFashionKidsLink().click();

		// Step 3: Selection of product...
		KidsPage kidspage = new KidsPage(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", kidspage.getProductionSelection());
		explicitWait.until(ExpectedConditions.elementToBeClickable(kidspage.getProductSelection()));
		kidspage.getProductSelection().click();
		Set<String> childPageWinID = driver.getWindowHandles();
		childPageWinID.remove(parentPageWinID);
		for (String WinID : childPageWinID) {
			driver.switchTo().window(WinID);
		}

		// Step 4: Scrolling and Selection of the element.
		explicitWait.until(ExpectedConditions.elementToBeClickable(kidspage.getAddToCartButton()));
		js.executeScript("arguments[0].scrollIntoView(false)", kidspage.getSelectSizeIcon());
		Thread.sleep(1000);
		explicitWait.until(ExpectedConditions.elementToBeClickable(kidspage.getSelectSizeIcon()));
		kidspage.getSelectSizeIcon().click();

		// Step 5: verify whether user is able to click on add to cart button...
		js.executeScript("arguments[0].scrollIntoView(false)", kidspage.getAddToCartButton());
		explicitWait.until(ExpectedConditions.elementToBeClickable(kidspage.getAddToCartButton()));
		Thread.sleep(1000);
		kidspage.getAddToCartButton().click();

		explicitWait.until(ExpectedConditions.elementToBeClickable(basepage.getUpdateButton()));
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("addTocartPageTitle"),
				"Add to cart button not working");

		Reporter.log("Product added to Shopping cart succesfully", true);

		// Step6: Removing the product from the Shooping cart...
		kidspage.getRemoveButtonAddToCart().click();
		Assert.assertEquals(kidspage.getAddToCartMessage().getText(),
				ReadData.fromPropertyFile("shoppingCartPageMessage"), "Product not been removed from the cart");

		Reporter.log("Product removed from the cart", true);
	}
}