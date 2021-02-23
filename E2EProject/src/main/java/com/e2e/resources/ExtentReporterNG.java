package com.e2e.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports er;
	
	public static ExtentReports getReportObject() {
		//ExtentReports --> 
				//ExtentSparkReporter ->Responsible for creating report and expects path where report is to be created.
				String path = System.getProperty("user.dir")+ "\\reports\\index.html";
				ExtentSparkReporter esr = new ExtentSparkReporter(path);
				esr.config().setReportName("Web Automation Results");
				esr.config().setDocumentTitle("Test Results");
				
				er = new ExtentReports();
				er.attachReporter(esr);
				er.setSystemInfo("Tester", "Nikhil");
				return er;
	}

}
