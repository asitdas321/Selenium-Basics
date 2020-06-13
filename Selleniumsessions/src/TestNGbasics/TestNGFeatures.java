package TestNGbasics;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	@Test
	public void logintest() {
		System.out.println("LogIn test");
	}
	
	@Test(dependsOnMethods="logintest")
	public void homepagetest() {
		System.out.println("Homepage");
		}
	@Test(dependsOnMethods="logintest")
	public void searchpagetest() {
		System.out.println("Searchpage");
	}
	

}
