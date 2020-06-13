package selleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Automation\\Selleniumsessions\\src\\selleniumbasics\\config.properties");
		
	    prop.load(ip);
	    
		System.out.println(prop.getProperty("name")); 
	   
		
		System.out.println(prop.getProperty("age"));	
		
		String url = prop.getProperty("URL");
        System.out.println(url);
        
        String browserName = prop.getProperty("browserName");
        System.out.println(browserName);
     
        if(browserName.equals("chrome")){
        	System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
   		    driver = new ChromeDriver();
   		    driver.manage().window().maximize();
 		    driver.manage().deleteAllCookies();
        }
        else if(browserName.equals("FF")){
        	
    		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver\\geckodriver.exe");
    		driver = new FirefoxDriver();
    		
        }
         driver.get(url);
         Thread.sleep(2000);
         driver.findElement(By.xpath(prop.getProperty("FirstName_Xpath"))).sendKeys(prop.getProperty("FirstName"));
         Thread.sleep(2000);
         driver.findElement(By.xpath(prop.getProperty("LastName_Xpath"))).sendKeys(prop.getProperty("LastName"));
         
         
         
         
         
	}

}
