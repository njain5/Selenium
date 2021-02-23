package com.e2e.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.e2e.resources.Base;
import com.e2e.resources.ExtentReporterNG;

public class Listeners extends Base implements ITestListener{
	
	ExtentReports er = ExtentReporterNG.getReportObject();
	ExtentTest test;
	
	//Creates classes thread safe.
	
	ThreadLocal<ExtentTest> thLocal = new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		
		test = er.createTest(result.getMethod().getMethodName());
		thLocal.set(test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//test.log(Status.PASS, "Test Passed");
		thLocal.get().log(Status.PASS, "Test Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		//test.fail(result.getThrowable());
		thLocal.get().fail(result.getThrowable());
		String failedMethod = result.getMethod().getMethodName();
		//Accessing driver of Failed class.
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		//Getting name of failed test case and passing it in Method.
		
		try {
			thLocal.get().addScreenCaptureFromPath(getScreenshotPath(failedMethod, driver), failedMethod);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		er.flush();
	}
	
	

}
