package selleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopuphandle {

	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-default'] ")).click();
        Alert alert = driver.switchTo().alert();  // To move from main window to alert window
		System.out.println(alert.getText());
		String text = alert.getText();     //To check alert message coming correct or not
		if(text.equals("I am an alert box!"))  //
		{
			System.out.println("Correct alert message"); //
		}
		else
		{
			System.out.println("In-correct alert message"); //
		}
		Thread.sleep(2000);
		alert.accept();  // click on okay button
	//	alert.dismiss();  // click on cancel button
		driver.close();
		
		
		
		
		

	}

}
