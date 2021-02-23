package com.e2e.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	public WebDriver driver;
	
	private By em = By.id("user_email");
	private By sendIns = By.xpath("//input[@type='email']");
	
	public WebElement getForgotEmail() {
		return driver.findElement(em);
	}
	
	public WebElement getForgotEmailSubmit() {
		return driver.findElement(sendIns);
	}
	

}
