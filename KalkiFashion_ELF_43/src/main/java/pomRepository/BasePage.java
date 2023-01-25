package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@aria-label='store logo']")
	private WebElement kalkiFashionHomePageLink;

	@FindBy(xpath = "//button[text()='Update Cart']")
	private WebElement updateButton;

	@FindBy(xpath = "//span[text()='Sign in / SignUp']")
	private WebElement kalkiFashionSignupLink;

	@FindBy(id = "wishlist_count")
	private WebElement kalkiFashionWishlistIcon;

	@FindBy(id = "search-input")
	private WebElement kalkiFashionSearchBar;

	@FindBy(xpath = "(//a[text()='Salwar Kameez '])[2]")
	private WebElement kalkiFashionSalwarKameezLink;

	@FindBy(xpath = "(//a[text()='Blouse'])[2]")
	private WebElement kalkiFashionBlouseLink;

	@FindBy(xpath = "//a[text()='Lehengas'])[3]")
	private WebElement kalkiFashionLehengasLink;

	@FindBy(xpath = "(//a[text()='Indo Western'])[2]")
	private WebElement kalkiFashionIndoWesternLink;

	@FindBy(xpath = "(//a[text()='Kurtis'])[2]")
	private WebElement kalkiFashionKurtisLink;

	@FindBy(xpath = "(//a[text()='Bridal'])[3]")
	private WebElement kalkiFashionBridalLink;

	@FindBy(xpath = "(//a[text()='Men'])[2]")
	private WebElement kalkiFashionMenLink;

	@FindBy(xpath = "(//a[text()='Accessories'])[2]")
	private WebElement kalkiFashionAccessoriesLink;

	@FindBy(xpath = "(//a[text()='Kids'])[2]")
	private WebElement kalkiFashionKidsLink;

	@FindBy(xpath = "(//a[text()='Collection'])[2]")
	private WebElement kalkiFashionCollectionLink;

	@FindBy(xpath = "(//a[text()='New'])[2]")
	private WebElement kalkiFashionNewLink;

	@FindBy(xpath = "(//a[text()=' Sale '])[2]")
	private WebElement kalkiFashionSaleLink;

	public WebElement getUpdateButton() {
		return updateButton;
	}

	public WebElement getKalkiFashionHomePageLink() {
		return kalkiFashionHomePageLink;
	}

	public WebElement getKalkiFashionSignupLink() {
		return kalkiFashionSignupLink;
	}

	public WebElement getKalkiFashionWishlistIcon() {
		return kalkiFashionWishlistIcon;
	}

	public WebElement getKalkiFashionSearchBar() {
		return kalkiFashionSearchBar;
	}

	public WebElement getKalkiFashionSalwarKameezLink() {
		return kalkiFashionSalwarKameezLink;
	}

	public WebElement getKalkiFashionBlouseLink() {
		return kalkiFashionBlouseLink;
	}

	public WebElement getKalkiFashionLehengasLink() {
		return kalkiFashionLehengasLink;
	}

	public WebElement getKalkiFashionIndoWesternLink() {
		return kalkiFashionIndoWesternLink;
	}

	public WebElement getKalkiFashionKurtisLink() {
		return kalkiFashionKurtisLink;
	}

	public WebElement getKalkiFashionBridalLink() {
		return kalkiFashionBridalLink;
	}

	public WebElement getKalkiFashionMenLink() {
		return kalkiFashionMenLink;
	}

	public WebElement getKalkiFashionAccessoriesLink() {
		return kalkiFashionAccessoriesLink;
	}

	public WebElement getKalkiFashionKidsLink() {
		return kalkiFashionKidsLink;
	}

	public WebElement getKalkiFashionCollectionLink() {
		return kalkiFashionCollectionLink;
	}

	public WebElement getKalkiFashionNewLink() {
		return kalkiFashionNewLink;
	}

	public WebElement getKalkiFashionSaleLink() {
		return kalkiFashionSaleLink;
	}
}