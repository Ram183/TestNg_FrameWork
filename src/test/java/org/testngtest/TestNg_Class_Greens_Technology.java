package org.testngtest;

import org.baseclass.Base_Class;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNg_Class_Greens_Technology extends Base_Class{

	
	@Parameters("browser")
	@Test
	private void tc1(String name) {
		if (name.contains("chrome")) {
			chromeBrowser("http://www.greenstechnologys.com/");
		}else if (name.contains("firefox")) {
			firefoxBrowser("http://www.greenstechnologys.com/");
		}else {
			edgeBrowser("http://www.greenstechnologys.com/");
		}
		
	}
	
}
