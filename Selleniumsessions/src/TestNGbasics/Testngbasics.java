package TestNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
		
//	@BeforeSuite-------setup system property for chrome
//	@BeforeTest---------login to App
//	@BeforeClass---------launch Chrome Browser
//	@BeforeMethod---------Enter URL
//	@Test-------------google title test
//	@AfterMethod---------Logout from App
//	@BeforeMethod---------Enter URL
//	@Test-----------Search test
//	@AfterMethod---------Logout from App
//	@AfterClass-----------Close Browser
//	@AfterTest------------deletecookies
	
	//Pre-condition Annotation------starting with Before
	@BeforeSuite  //1
	public void setUp() {
	System.out.println("@BeforeSuite-------setup system property for chrome");
	}
	
	@BeforeTest   //2
	public void login() {
	System.out.println("@BeforeTest---------login to App");
	}
	
	@BeforeClass   //3
	public void launchbrowser() {
	System.out.println("@BeforeClass---------launch Chrome Browser");
	}
	
	@BeforeMethod  //4
	public void enterURL() {
	System.out.println("@BeforeMethod---------Enter URL");
	}
	
	// test cases--------- starting with @test
	@Test   //5
	public void googletitletest() {
	System.out.println("@Test-------------google title test");
	}
	
	@Test
	public void searhtest() {
		System.out.println("@Test-----------Search test");
	}
	
	// Pre-condition Annotation------starting with Before
	@AfterMethod  //6
	public void logout() {
	System.out.println("@AfterMethod---------Logout from App");
	}
	
	@AfterClass    //7
	public void closebrowser() {
	System.out.println("@AfterClass-----------Close Browser");
	}
	
	@AfterTest   //8
	public void deletecookies() {
	System.out.println("@AfterTest------------deletecookies");
	}
	
	@AfterSuite  //9
	public void Generatetestreport() {
	System.out.println("@AfterSuite------------Generate Test Report");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
