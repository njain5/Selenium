package com.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports er;
	
	@BeforeTest
	public void config() {
		//ExtentReports --> 
		//ExtentSparkReporter ->Responsible for creating report and expects path where report is to be created.
		String path = System.getProperty("user.dir")+ "\\reports\\index.html";
		ExtentSparkReporter esr = new ExtentSparkReporter(path);
		esr.config().setReportName("Web Automation Results");
		esr.config().setDocumentTitle("Test Results");
		
		er = new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("Tester", "Nikhil");
		
	}
	@Test
	public void initialDemo() {
		ExtentTest test = er.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		test.addScreenCaptureFromBase64String("Status");
		er.flush();
	}

}
