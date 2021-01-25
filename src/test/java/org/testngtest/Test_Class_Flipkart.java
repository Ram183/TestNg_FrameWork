package org.testngtest;

import java.util.Date;

import org.baseclass.Base_Class;

import org.objectclasstestng.object_Class_Flipkart1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class_Flipkart extends Base_Class {

	@BeforeClass
	public static void launch() {

		chromeBrowser("https://www.flipkart.com/account/login");

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
	
		object_Class_Flipkart1 o = new object_Class_Flipkart1();
		
		sendKeys(o.getEmailId(), excelCode(18, 0));
		
		sendKeys(o.getPassword(), excelCode(18, 1));
		
		clickButton(o.getLogin());
		
		Thread.sleep(3000);
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\Junit_Framework\\ScreenShot\\flipkart.png");
	}
}
