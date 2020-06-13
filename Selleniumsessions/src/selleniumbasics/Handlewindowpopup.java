package selleniumbasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Window Popup Modal')] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Follow On Twitter')] ")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentwindowId = it.next();
		System.out.println("Parent window Id :" + parentwindowId); 
		
		String childwindowId = it.next();
		System.out.println("Child window Id :" + childwindowId);
		
		 driver.switchTo().window(childwindowId);
		 System.out.println("child window pop-up :" + driver.getTitle());
		 driver.close();
		 
		 driver.switchTo().window(parentwindowId);
		 System.out.println("parent window title :" + driver.getTitle());
		 

		
		
		
		
		

	}

}
