package org.abc;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Project1 {
	
	@Test
	private void tc2() {
		
		System.out.println("Tc2");
				
	}
	
	@Test
	private void tc1() {
		
		System.out.println("Tc1");
	}
	
	@AfterClass
	public void afterAllTc() {
		
		System.out.println("**Execution ends**");
	}
	
	@BeforeClass
	public void beforeAllTc() {
		
		System.out.println("**Execution starts**");
	}
	
	@BeforeMethod
	public void beforeTc() {
		
		System.out.println("**Tc started**");
	}
	
	@AfterMethod
	public void afterTc() {
		
		System.out.println("**Tc ends**");
	}

}
