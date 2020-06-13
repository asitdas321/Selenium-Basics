package selleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.amazon.com");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 
		 
		 

	}

}
