package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePageObjectFactory {
	WebDriver driver;
	
	public RediffHomePageObjectFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*By search = By.id("srchword");
	By newsearchbtn = By.className("newsrchbtn");*/
	
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(className="newsrchbtn")
	WebElement newsearchbtn;
	
	public WebElement sendproduct() {
		return search;
	}
	
	public WebElement sub() {
		return newsearchbtn;
	}
	
	
	
	

}
