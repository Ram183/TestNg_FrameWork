package org.testngtest;

import java.io.IOException;

import org.baseclass.Base_Class;
import org.testng.annotations.Test;

public class TestNg_Class_Greens_Technology1 extends Base_Class {

	@Test
	private void launchBrowser() throws IOException {

		chromeBrowser("http://www.greenstechnologys.com/");

		maximize();

		implictWait();

		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\TestNg_FrameWork\\ScreenShot\\Greens_Technology.png");

	}

}
