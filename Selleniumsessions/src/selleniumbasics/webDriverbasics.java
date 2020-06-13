package selleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverbasics {

	public static void main(String[] args) 
	{
		//FF browser
		//geckodriver
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

//         // chrome driver
//		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://socinator.com/");
		
	}

}
