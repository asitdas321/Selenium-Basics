package TestNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
    @Test
    public void test() {
    	String baseUrl = "https://www.toolsqa.com/";
    	
    	System.out.println("Launching Google Chrome browser");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get(baseUrl);
        String testTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);

    }

    
    @AfterMethod
    public void aftermethod() {
    	System.out.println("Finished Test on Chrome Browser");
    }
}
