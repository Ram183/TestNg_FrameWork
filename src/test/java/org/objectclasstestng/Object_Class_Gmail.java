package org.objectclasstestng;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Gmail extends Base_Class {

	public Object_Class_Gmail() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='h-c-header__nav-li-link '])[4]")
	private WebElement signIn;

	@FindBy(id = "identifierId")
	private WebElement emailOrPhoneNo;

	@FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
	private WebElement nextButton;

	@FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
	private WebElement password;

	@FindBy(xpath = "(//div[@class='VfPpkd-RLmnJb'])[1]")
	private WebElement login;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmailOrPhoneNo() {
		return emailOrPhoneNo;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
