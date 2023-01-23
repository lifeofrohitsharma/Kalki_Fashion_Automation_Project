package org.automation.POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email_id")
	private WebElement emailIdTextField;

	@FindBy(id = "signinsubmit")
	private WebElement siginButton;

	@FindBy(id = "userpassword")
	private WebElement pwdTextfield;

	public WebElement getPwdTextfield() {
		return pwdTextfield;
	}

	public WebElement getSiginButton() {
		return siginButton;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}
}
