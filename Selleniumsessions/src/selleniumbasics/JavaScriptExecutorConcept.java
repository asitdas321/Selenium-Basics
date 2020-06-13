package selleniumbasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://classic.freecrm.com/index.html");
		 driver.findElement(By.name("username")).sendKeys("asitdas321@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Niru321@");
	//	 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		 
		 
		 //executeScript---- this method is use to execute javaScript code 

		 WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		 
		 
		 flash(loginBtn, driver);   //highlight the element
		 
		 drawBorder(loginBtn,driver);  //draw a border
		 
		 //take the screenshot and store as a file format
		 File ScrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 //Now copy the screenshot to desired location using copyfile//method
		 FileHandler.copy(ScrFile,new File("E:\\VIDEOS\\screenshot.jpg"));
		 
		  //generate Alert
		 //generateAlert(driver,"There is an issue with login button on login page");
		 
		 //click on any element by using java script
		  clickElementByJS(loginBtn,driver);
		  
		 //refresh the page
		 //1. by using selenium
		 driver.navigate().refresh();
		 
		 //2. by using java script executor
		   refreshBrowserByJS(driver);
		   
		 //get the title of the page by js
		 System.out.println(getTitleByJS(driver));
		 
		 //get the page text
		 System.out.println(getPageInnerText( driver));
		 
		 //scroll pagedown
		// scrollPageDown(driver);
		 
		 //scroll into view
		 WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		 scrollIntoview(forgotPwdLink,driver);
		 
		 
		 
		 
	}

	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor Js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0; i < 100 ; i++) {
			changeColor("rgb(255,0,0)",element, driver);
			changeColor(bgcolor,element,driver);
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor Js = ((JavascriptExecutor) driver);
		Js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(20);
		}catch (InterruptedException e) {
		}
	}


		
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor Js = ((JavascriptExecutor) driver);
		Js.executeScript("arguments[0].style.border = '3px solid red'", element);
		
	}	

	public static void generateAlert(WebDriver driver, String message) {
	  JavascriptExecutor Js = ((JavascriptExecutor) driver);
	  Js.executeScript("alert('"+message+"')");
    }
  
    public static void clickElementByJS(WebElement element, WebDriver driver) {
	  JavascriptExecutor Js = ((JavascriptExecutor) driver);
	  Js.executeScript("arguments[0].click();",element);
    }
   public static void refreshBrowserByJS(WebDriver driver) {
	   JavascriptExecutor Js = ((JavascriptExecutor) driver); 
	   Js.executeScript("history.go(0)");
   }
   public static String getTitleByJS(WebDriver driver) {
	   JavascriptExecutor Js = ((JavascriptExecutor) driver); 
	   String title = Js.executeScript("return document.title;").toString();
	   return title;
   }
   public static String getPageInnerText(WebDriver driver) {
	   JavascriptExecutor Js = ((JavascriptExecutor) driver);
	   String pageText  = Js.executeScript("return document.documentElement.innerText;").toString();
	   return pageText;
	   
   }
   public static void scrollPageDown(WebDriver driver) {
	   JavascriptExecutor Js = ((JavascriptExecutor) driver);
	   Js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
   }
   public static void scrollIntoview(WebElement element, WebDriver driver) {
	   JavascriptExecutor Js = ((JavascriptExecutor) driver);
	   Js.executeScript("arguments[0].scrollIntoView(true);", element);
	   
   }
   
}

	
	
	
	
	
	

