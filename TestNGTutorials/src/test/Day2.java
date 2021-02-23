package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void demo2() {
		System.out.println("This is Day2");
	}
	
	@BeforeTest
	public void runbeforetest() {
		System.out.println("I run before each test");
	}
	
	@AfterTest
	public void runaftertest() {
		System.out.println("I run after each test");
	}
	
	@BeforeClass
	public void runbeforeclass() {
		System.out.println("I run before executing any method in class");
	}
	
	@AfterClass
	public void runafterclass() {
		System.out.println("I run after executing any method in class");
	}
	

}
