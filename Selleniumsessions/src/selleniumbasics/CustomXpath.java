package selleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://blog.jqueryui.com/");
		 driver.findElement(By.xpath("//input[@name='s']")).sendKeys("java");
		 driver.findElement(By.linkText("API Documentation")).click();
		 
		 

	}

}
