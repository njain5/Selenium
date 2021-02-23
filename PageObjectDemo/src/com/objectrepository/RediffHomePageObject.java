package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePageObject {
	WebDriver driver;
	
	public RediffHomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	By search = By.id("srchword");
	By newsearchbtn = By.className("newsrchbtn");
	
	public WebElement sendproduct() {
		return driver.findElement(search);
	}
	
	public WebElement sub() {
		return driver.findElement(newsearchbtn);
	}
	
	
	
	

}
