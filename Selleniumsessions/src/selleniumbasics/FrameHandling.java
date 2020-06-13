package selleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://classic.crmpro.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("asitdas");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SArt$)129");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='New Contact']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Asit2");
        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Das2");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asitdas3214@globusoft.in");
        driver.findElement(By.xpath("//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='contactForm']/table/tbody/tr/td/input[2]")).click();
        Thread.sleep(3000 );
        driver.quit();
        

	}

}
