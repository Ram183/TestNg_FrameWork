package org.testngtest;

import java.util.Date;

import org.baseclass.Base_Class;
import org.objectclasstestng.Object_Class_FaceBook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Class_Facebook1 extends Base_Class{

	@BeforeClass
	public static void launch() {

		chromeBrowser("https://www.facebook.com/");

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

	@Test(groups="sanity")
	public void tc1() throws Exception {
		
		Object_Class_FaceBook ob = new Object_Class_FaceBook();
		
		sendKeys(ob.getUserName(), excelCode(1, 0));
	
		sendKeys(ob.getPassword(), excelCode(1, 1));
		
		clickButton(ob.getLogin());
		
		Thread.sleep(3000);
		
		getText(ob.getTextOfSiginMessage());
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\TestNg_FrameWork\\ScreenShot\\Facebook1.png");
}
	
	@Test(groups="smoke")
	public void tc2() throws Exception {
		
		driver.navigate().to("https://www.facebook.com/");
		
		Object_Class_FaceBook ob = new Object_Class_FaceBook();
		
		sendKeys(ob.getUserName(), "Selenium123@gmail.com");
	
		sendKeys(ob.getPassword(), "Selenium");
		
		clickButton(ob.getLogin());
		
		Thread.sleep(3000);
		
		getText(ob.getTextOfSiginMessage());
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\TestNg_FrameWork\\ScreenShot\\Facebook2.png");
}
	
	
	
}
