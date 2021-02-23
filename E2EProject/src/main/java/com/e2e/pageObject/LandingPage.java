package com.e2e.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	private By SignIn = By.cssSelector("a[href*='sign_in']");
	private By text = By.xpath("//*[@id='content']/div/div/h2");
	private By nav = By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul");
	By nt = By.xpath("//button[text()='NO THANKS']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public LoginPage getLogin() {
		//return driver.findElement(SignIn);
		driver.findElement(SignIn).click();
		LoginPage lop = new LoginPage(driver);
		return lop;
	}
	
	public WebElement getTitle() {
		return driver.findElement(text);
	}
	
	public WebElement getNav() {
		return driver.findElement(nav);
	}
	
	public int getPopupSize() {
		return driver.findElements(nt).size();
	}
	
	public WebElement getPopup() {
		return driver.findElement(nt);
	}
	
	

}
