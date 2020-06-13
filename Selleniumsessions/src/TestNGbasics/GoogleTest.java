package TestNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority=1,groups="titletest")
	public void googletitletest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="logotest")
    public void googlelogo() {
    	boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
    }
    
	@Test(priority=3,groups="linktest")
	public void linktest() {
	    boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="searchtest")
	public void searchtext() {
		boolean b = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).isDisplayed();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
}
