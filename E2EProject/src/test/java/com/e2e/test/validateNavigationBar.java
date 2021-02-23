package com.e2e.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.e2e.pageObject.LandingPage;
import com.e2e.pageObject.LoginPage;
import com.e2e.resources.Base;

public class validateNavigationBar extends Base {
	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getNav().isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
