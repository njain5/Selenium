package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(timeOut = 4000)
	public void WebLoginCarLoan() {
		System.out.println("I will not fail this script till 4 second. ");
	}
	
	@Test(enabled = false)
	public void MobileLoginCarLoan() {
		System.out.println("This test will get skipped");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am number one");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogoutCarLoan() {
		System.out.println("Smoke testing");
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Run before every method.");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Run after every method.");
	}
	
	@Test(dataProvider = "getData")
	public void MobileHomepageCarLoan(String username, String pwd) {
		System.out.println("This executes first as L depends on M");
		System.out.println(username);
		System.out.println(pwd);
		
	}
	
	@Test(dependsOnMethods= {"MobileHomepageCarLoan","MobileLogoutCarLoan"})
	public void LoginAPICarLoan() {
		System.out.println("Dependent method");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combo username and pwd
		//2nd combo username and pwd
		//3rd combo username and pwd
		Object[][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		data[2][0] = "secondusername";
		data[2][1] = "secondpassword";
		return data;
	}

}
