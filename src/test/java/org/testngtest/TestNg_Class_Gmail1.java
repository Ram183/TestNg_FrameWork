package org.testngtest;

import java.util.Date;

import org.baseclass.Base_Class;
import org.objectclasstestng.Object_Class_Gmail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Class_Gmail1 extends Base_Class {

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

	@DataProvider(name = "sample")
	public Object[][] data() {

		return new Object[][] {

				{ "davidufc18@gmail.com", "davidufc182965" }, { "ramgreens@gmail.com", "ramgreens@123a" },
				{ "javaselenium@gmail.com", "javaselenium@123a" } };

	}

	@Test(dataProvider = "sample")
	public void tc1(String email, String pass) throws Exception {

		Object_Class_Gmail o = new Object_Class_Gmail();

		sendKeys(o.getEmailOrPhoneNo(), email);

		clickButton(o.getNextButton());

		Thread.sleep(3000);

		driver.navigate().to(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

//		sendKeys(o.getPassword(), pass);
//
//		clickButton(o.getLogin());

	}

}
