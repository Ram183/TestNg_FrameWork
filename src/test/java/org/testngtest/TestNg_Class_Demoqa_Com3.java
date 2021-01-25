package org.testngtest;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.baseclass.Base_Class;
import org.objectclasstestng.Object_Class_ToolsQa2;
import org.objectclasstestng.Object_Class_ToolsQa3;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Class_Demoqa_Com3 extends Base_Class {

	public static Object_Class_ToolsQa3 o;

	@BeforeClass(groups = "regression")
	public static void launch() {

		chromeBrowser("https://demoqa.com/automation-practice-form");
	}

	@AfterClass(groups = "smoke")
	public static void closeWindow() {

		driver.quit();
	}

	@Test(groups = "regression")
	public void tc1() throws Exception {

		o = new Object_Class_ToolsQa3();

		sendKeys(o.getFirstName(), excelCode(5, 0));

	}

	@Test(groups = "regression")
	public void tc2() throws Exception {

		o = new Object_Class_ToolsQa3();
		sendKeys(o.getLastName(), excelCode(5, 1));

	}

	@Test(groups = "regression")
	public void tc3() throws Exception {

		o = new Object_Class_ToolsQa3();
		sendKeys(o.getEmailId(), excelCode(5, 2));

	}

	@Test(groups = "sanity")
	public void tc4() {

		o = new Object_Class_ToolsQa3();
		clickButton(o.getGender());

	}

	@Test(groups = "sanity")
	public void tc5() throws Exception {

		o = new Object_Class_ToolsQa3();
		sendKeys(o.getPhoneNumber(), excelCode(5, 3));
	}

	@Test(groups = "sanity")
	public void tc6() throws Exception {

		o = new Object_Class_ToolsQa3();
		javaScriptValue(o.getSubject(), excelCode(5, 4));
		getAttribute(o.getSubject());

	}

	@Test(groups = "smoke")
	private void tc7() {

		o = new Object_Class_ToolsQa3();
		clickButton(o.getHobbies());

	}

	@Test(groups = "smoke")
	public void tc8() throws Exception {
		o = new Object_Class_ToolsQa3();
		sendKeys(o.getAddress(), excelCode(5, 5));

		Thread.sleep(3000);

	}

	@Test(groups = "smoke")

	public void tc9() throws InterruptedException, AWTException {

		o = new Object_Class_ToolsQa3();

		Thread.sleep(5000);

		clickButton(o.getSelectState());

		robotClass1();

	}

	@Test(groups = "smoke")

	public void tcc1() throws InterruptedException, AWTException {

		o = new Object_Class_ToolsQa3();

		Thread.sleep(8000);

		clickButton(o.getSelectCity());

		robotClass1();

		javaScriptClick(o.getSubmitButton());

	}

}
