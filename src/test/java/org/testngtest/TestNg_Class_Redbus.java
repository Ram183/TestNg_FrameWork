package org.testngtest;

import java.util.Date;

import org.baseclass.Base_Class;
import org.objectclasstestng.Object_Class_Redbus;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Class_Redbus extends Base_Class{

	@BeforeClass
	public static void launch() {

		chromeBrowser("https://www.redbus.in/");

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
		
		Object_Class_Redbus ob = new Object_Class_Redbus();
		
		mousehOver(ob.getSignIn());
		
		clickButton(ob.getSignIn());
		
		clickButton(ob.getSignInLink());
		
		Thread.sleep(3000);
		
		iFrameTask(ob.getIframe());
		
		sendKeys(ob.getMobileNo(), excelCode(15, 0));
		
		Thread.sleep(100000);
		
		clickButton(ob.getGenerateOtp());
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\TestNg_FrameWork\\ScreenShot\\redubus.png");
		
	}
}
