package selleniumbasics;

import java.io.File;
import java.io.IOException;

import javax.script.ScriptEngineFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshotconcept {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.facebook.com");
		File ScrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ScrFile,new File("E:\\VIDEOS\\screenshot.jpg"));
		
		

	}

}
