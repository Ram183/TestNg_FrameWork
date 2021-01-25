package org.objectclasstestng;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_ToolsQa4 extends Base_Class{
	
	public Object_Class_ToolsQa4() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "firstName")
	private WebElement firstName;

	@FindBy(id = "lastName")
	private WebElement lastName;

	@FindBy(id = "userEmail")
	private WebElement emailId;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[1]")
	private WebElement gender;

	@FindBy(id = "userNumber")
	private WebElement phoneNumber;

	@FindBy(id = "subjectsContainer")
	private WebElement subject;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[4]")
	private WebElement hobbies;

	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement address;

	@FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
	private WebElement selectState;

	@FindBy(xpath = "//div[@class=' css-1wa3eu0-placeholder']")
	private WebElement selectCity;

	@FindBy(id = "submit")
	private WebElement submitButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
