package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Sign In']")
	private WebElement signInPageTitle;

	@FindBy(id = "email_id")
	private WebElement emailIdTextField;

	@FindBy(id = "signinsubmit")
	private WebElement siginButton;

	@FindBy(id = "userpassword")
	private WebElement pwdTextfield;

	@FindBy(id = "userpassword_show")
	private WebElement eyeIconPswTextField;

	@FindBy(id = "use_mobile_instead")
	private WebElement useMobileNoLink;

	@FindBy(id = "mobile_number")
	private WebElement mobileNumberTextField;

	public WebElement getMobileNumberTextField() {
		return mobileNumberTextField;
	}

	public WebElement getUseMobileNoLink() {
		return useMobileNoLink;
	}

	public WebElement getSignInPageTitle() {
		return signInPageTitle;
	}

	public WebElement getEyeIconPswTextField() {
		return eyeIconPswTextField;
	}

	public WebElement getPwdTextfield() {
		return pwdTextfield;
	}

	public WebElement getSiginButton() {
		return siginButton;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getSignInLogo() {
		return signInPageTitle;
	}
}
