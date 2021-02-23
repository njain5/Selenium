package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.RediffHomePageObject;
import com.objectrepository.RediffLoginPageObject;

public class RediffLoginTest {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPageObject rlpo =new RediffLoginPageObject(driver);
		rlpo.EmailId().sendKeys("test@gmail.com");
		rlpo.Password().sendKeys("password");
		rlpo.login().click();
		rlpo.home().click();
		
		RediffHomePageObject rh = new RediffHomePageObject(driver);
		rh.sendproduct().sendKeys("trimmer");
		rh.sub().click();
	}

}
