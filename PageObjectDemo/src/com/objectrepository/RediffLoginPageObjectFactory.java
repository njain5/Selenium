package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageObjectFactory {
	WebDriver driver;
	
	public RediffLoginPageObjectFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*By username  = By.id("login1");
	By password = By.id("password");
	By submit = By.className("signinbtn");
	By home = By.linkText("rediff.com");*/
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="signinbtn")
	WebElement submit;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	public WebElement EmailId() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement login() {
		return submit;
	}
	
	public WebElement home() {
		return home;
	}

}
