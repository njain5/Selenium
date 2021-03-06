package com.e2e.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	private By emailId = By.id("user_email");
	private By password = By.id("user_password");
	private By loginSubmit  = By.xpath("//input[@value='Log In']");
	private By forgotpwd = By.cssSelector("[href*='password/new']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(emailId);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(loginSubmit);
	}
	
	public ForgotPassword getForgotPwd() {
		driver.findElement(forgotpwd).click();
		return new ForgotPassword();
		
	}
	
	

}
