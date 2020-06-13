package selleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://html.com/input-type-file/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\DOCUMENT WARRENTY\\ShopAcer_ECN2201637278995.pdf");
		

	}

}
