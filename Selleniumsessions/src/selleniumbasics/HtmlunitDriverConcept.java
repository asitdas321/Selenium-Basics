package selleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlunitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\Chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Html webdriver is not available in selenium 3.x version.
		//htmlunitDriver = to use this concept we need to download the htmlunitDrive jar file 
		
		//Advantages
		//1. Testing is happening behind the scene
		//2. Very fast ----- execution of test cases ---very fast ---- performance of the script
		//3.not suitable for Actions class --- user actions --- mousemovement, drag and drop, doubleclick
		//4.ghost Driver ---- Headless browser
		                      //Htmlunit driver--- Java
		                      //PhantomJS ------ JavaScript
		                      
		
		WebDriver driver = new HtmlUnitDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic unit
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.testproject.io/signup/");
		System.out.println("Before login title is:====="+ driver.getTitle());
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Asit Das");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asit.loveforever.das@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Niru321@");
		driver.findElement(By.className("tp-checkbox-input-view")).click();
		driver.findElement(By.xpath("//div[@class='tp-submit-wrapper']")).click();
		System.out.println("After login title is:====="+ driver.getTitle());
	}

}
