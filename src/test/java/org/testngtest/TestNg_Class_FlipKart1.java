package org.testngtest;

import org.baseclass.Base_Class;
import org.objectclasstestng.Object_Class_Flipkart2;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Class_FlipKart1 extends Base_Class{

	
	@Parameters("browser")
	@Test
	private void tc1(String name) throws Exception {
		if (name.contains("chrome")) {
			chromeBrowser("https://www.flipkart.com/account/login");
		}else if (name.contains("firefox")) {
			firefoxBrowser("https://www.flipkart.com/account/login");
		}else {
			edgeBrowser("https://www.flipkart.com/account/login");
		}
		
		maximize();
		
		implictWait();
		
		Object_Class_Flipkart2 ob = new Object_Class_Flipkart2();
		
		sendKeys(ob.getEmail(), excelCode(18, 0));
		
		sendKeys(ob.getPassword(), excelCode(18, 1));
		
		clickButton(ob.getLogin());
		
	}
	
}
