package com.e2e.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.e2e.pageObject.ForgotPassword;
import com.e2e.pageObject.LandingPage;
import com.e2e.pageObject.LoginPage;
import com.e2e.resources.Base;

public class HomePage extends Base {

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String userName, String password, String text) throws IOException {
		
		driver.get(prop.getProperty("url"));

		LandingPage lp = new LandingPage(driver);
		LoginPage lop = lp.getLogin();

		//LoginPage lop = new LoginPage(driver);
		lop.getEmail().sendKeys(userName);
		lop.getPassword().sendKeys(password);
		System.out.println(text);
		lop.getSubmit().click();
		
		ForgotPassword fp = lop.getForgotPwd();
		fp.getForgotEmail().sendKeys("mycorrectEmail");
		fp.getForgotEmailSubmit().click();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "nonrestricteduser@test.com";
		data[0][1] = "password1";
		data[0][2] = "nonrestricteduser";

		data[1][0] = "restricteduser@test.com";
		data[1][1] = "password2";
		data[1][2] = "restricted user";

		return data;

	}

}
