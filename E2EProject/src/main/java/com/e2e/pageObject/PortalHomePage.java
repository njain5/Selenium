package com.e2e.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	
	public WebDriver driver;
	
	private By searchBox = By.name("query");
	

	public PortalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}
	
	
	
	

}
