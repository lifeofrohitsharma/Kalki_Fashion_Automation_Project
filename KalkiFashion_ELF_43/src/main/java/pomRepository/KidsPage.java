package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsPage {

	public KidsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "chat-icon")
	private WebElement chatIcon;

	@FindBy(xpath = "//a[text()='Boys']")
	private WebElement boysPageLink;

	@FindBy(xpath = "(//a[contains(text(),'Kalki Girls')]/../..)[1]")
	private WebElement productionSelection;

	@FindBy(xpath = "(//div[contains(text(),'Years')])[4]")
	private WebElement selectSizeIcon;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement addToCartButton;

	@FindBy(id = "exit_intend_close")
	private WebElement similarProductPopUpClose;

	@FindBy(xpath = "//span[text()='Remove']")
	private WebElement removeButtonAddToCart;

	@FindBy(xpath = "//h2[text()='Your Cart is empty']")
	private WebElement addToCartMessage;

	public WebElement getAddToCartMessage() {
		return addToCartMessage;
	}

	public WebElement getRemoveButtonAddToCart() {
		return removeButtonAddToCart;
	}

	public WebElement getSimilarProductPopUpClose() {
		return similarProductPopUpClose;
	}

	public WebElement getSelectSizeIcon() {
		return selectSizeIcon;
	}

	public WebElement getChatIcon() {
		return chatIcon;
	}

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

}
