package org.objectclasstestng;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Redbus extends Base_Class{

	public Object_Class_Redbus() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id= "signin-block")
	private WebElement signIn;
	
	@FindBy(id="signInLink")
	private WebElement signInLink;
	
	@FindBy(xpath="//iframe[@class='modalIframe']")
	private WebElement iframe;
	
	@FindBy(id="mobileNoInp")
	private WebElement mobileNo;
	
	@FindBy(xpath="//div[@id='otp-container']")
	private WebElement generateOtp;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getGenerateOtp() {
		return generateOtp;
	}

}
