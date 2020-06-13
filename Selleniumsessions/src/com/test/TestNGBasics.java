package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
//	setup system property for chrome
//	Launch the browser
//	Login To App
//	Enter URL
//	google Title test
//	Logut from App
//	closebrowser
//	deleteallcookies
	

    // Pre condition annotations-----Starting with @Before
	@BeforeSuite    //1----
	public void setUp() {
	System.out.println("setup system property for chrome");
	}
	
	@BeforeTest    //2-----
	public void launchBrowser() {
	System.out.println("Launch the browser");
	}
	
	@BeforeClass  //3------
	public void Login(){
	System.out.println("Login To App");
	}
	
	@BeforeMethod //4----
	public void enterURL(){
	System.out.println("Enter URL");
	}
	
	//Test cases-----Starts with @Test
	@Test         //5-----
	public void googleTitletest() {
		System.out.println("google Title test");
	}
	
	@Test
	public void searchtest() {
		System.out.println("searchtest");
	}
	
	//Post condition annotations---- Starting with @After
	@AfterMethod  //6------
	public void logout() {
	System.out.println("Logut from App");
	}
	
	@AfterTest   //8-------
	public void deleteallcookies() {
	System.out.println("deleteallcookies");
	}
	
	@AfterClass  //7--------
	public void closebrowser() {
	System.out.println("closebrowser");
	}
	
	@AfterSuite
    public void generateTestreport() {
		System.out.println("GenerateTestReport");
	}
	
	
	
	
	
	
	
	
	
	
}
