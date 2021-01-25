package org.testngtest;

import java.util.Date;

import org.baseclass.Base_Class;

import org.objectclasstestng.Object_Class_ToolsQa1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class_ToolsQa extends Base_Class {

	@BeforeClass
	public static void launch() {

		chromeBrowser("https://demoqa.com/automation-practice-form");

		maximize();

		implictWait();
	}

	@AfterClass
	public static void closeWindow() {

		driver.quit();
	}

	@BeforeMethod
	public void programStartingTime() {

		Date d = new Date();
		System.out.println("Program Starts at: " + d);
	}

	@AfterMethod
	public void programEndTime() {

		Date d = new Date();
		System.out.println("Program End at: " + d);
	}

	@Test
	public void tc1() throws Exception {

		Object_Class_ToolsQa1 o = new Object_Class_ToolsQa1();

		sendKeys(o.getFirstName(), excelCode(5, 0));

		sendKeys(o.getLastName(), excelCode(5, 1));

		sendKeys(o.getEmailId(), excelCode(5, 2));

		clickButton(o.getGender());

		sendKeys(o.getPhoneNumber(), excelCode(5, 3));

		javaScriptValue(o.getSubject(), excelCode(5, 4));
		
		getAttribute(o.getSubject());

		clickButton(o.getHobbies());

		sendKeys(o.getAddress(), excelCode(5, 5));
		
		Thread.sleep(3000);
		
		clickButton(o.getSelectState());
		
		robotClass1();
		
		Thread.sleep(3000);
		
		clickButton(o.getSelectCity());
		
		robotClass1();

		javaScriptClick(o.getSubmitButton());
		
		Thread.sleep(3000);
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\Junit_Framework\\ScreenShot\\toolsQasnap.png");
	}

}
