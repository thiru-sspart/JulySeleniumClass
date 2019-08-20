package org.sspart.testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondSelenium {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("In after suite");
	
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("In after Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("In before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("In after Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In before MEthod");
	}
	
	@AfterMethod
	public void afterMEthod() {
		System.out.println("In after MEthod");
	}
	
	@Test
	public void testcase01() {
		System.out.println("In tc01");
	}
	
	@Test
	public void testcase02() {
		System.out.println("In tc02");
	}
}
