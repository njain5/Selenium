package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void demo() {
		System.out.println("This is first demo.");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("I am number one from last");
	}
	
	@Test
	public void demo2() {
		System.out.println("Second Demo");
	}

}
