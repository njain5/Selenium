package com.e2e.test;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.e2e.pageObject.LandingPage;
import com.e2e.pageObject.LoginPage;
import com.e2e.resources.Base;

public class validateTitle extends Base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is Initialized.");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Landing Page.");
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED CO123URSES");
		log.info("Text Validation Successful");
		// lp.getTitle().getText();

		/*
		 * LoginPage lop = new LoginPage(driver); lop.getEmail().sendKeys("Test");
		 * lop.getPassword().sendKeys("test123"); //System.out.println(text);
		 * lop.getSubmit().click();
		 */
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
