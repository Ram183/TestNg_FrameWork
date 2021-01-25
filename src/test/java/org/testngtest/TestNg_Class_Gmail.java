package org.testngtest;

import java.util.Date;

import org.baseclass.Base_Class;
import org.objectclasstestng.Object_Class_Gmail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Class_Gmail extends Base_Class {

	@BeforeClass
	private void launchBrowser() {

		chromeBrowser("https://mail.google.com/");

		maximize();

		implictWait();
	}

	@AfterClass
	private void endingBrowser() {

		driver.quit();
	}

	@BeforeMethod
	private void processingTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void processingEnding() {

		Date d = new Date();
		System.out.println(d);
	}

	@Parameters({"username","password"})
	@Test
	public void tc1(String email, String pass) throws Exception {

		Object_Class_Gmail o = new Object_Class_Gmail();

		sendKeys(o.getEmailOrPhoneNo(), email);

		clickButton(o.getNextButton());
		
		Thread.sleep(3000);

		sendKeys(o.getPassword(), pass);

		clickButton(o.getLogin());

	}

}
