package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan() {
		System.out.println("Smoke testing 1");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileLoginHomeLoan(String urlname) {
		System.out.println(urlname);
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		
	}

}
