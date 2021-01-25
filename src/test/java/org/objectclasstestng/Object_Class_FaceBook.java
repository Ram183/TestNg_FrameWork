package org.objectclasstestng;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Object_Class_FaceBook extends Base_Class{

	public Object_Class_FaceBook() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="u_0_b")
	private WebElement login;
	
	@FindBy(xpath="//div[@class='_9ay7']")
	private WebElement textOfSiginMessage;

	public WebElement getTextOfSiginMessage() {
		return textOfSiginMessage;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
}
