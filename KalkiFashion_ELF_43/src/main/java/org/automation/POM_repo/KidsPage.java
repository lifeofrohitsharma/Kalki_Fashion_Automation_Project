package org.automation.POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsPage {

	public KidsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Boys']")
	private WebElement boysPageLink;

	@FindBy(xpath = "(//a[contains(text(),'Kalki Girls')]/../..)[1]")
	private WebElement productionSelection;

	@FindBy(xpath = "(//div[contains(text(),'Years')])[2]")
	private WebElement elementToBeScrolled;

	@FindBy(id = "product-addtocart-button")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getProductSelection() {
		return productionSelection;
	}

	public WebElement getBoysPageLink() {
		return boysPageLink;
	}

	public WebElement getProductionSelection() {
		return productionSelection;
	}

	public WebElement getElementToBeScrolled() {
		return elementToBeScrolled;
	}

}
