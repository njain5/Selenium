package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPageObject {
	WebDriver driver;
	
	public RediffLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	By username  = By.id("login1");
	By password = By.id("password");
	By submit = By.className("signinbtn");
	By home = By.linkText("rediff.com");
	
	public WebElement EmailId() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement login() {
		return driver.findElement(submit);
	}
	
	public WebElement home() {
		return driver.findElement(home);
	}

}
