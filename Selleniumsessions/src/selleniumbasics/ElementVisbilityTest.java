package selleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisbilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://register.freecrm.com/register/");
		
		//1.isDisplayed() method:Applicable for all the elements
		boolean b1 = driver.findElement(By.name("action")).isDisplayed();
		System.out.print(b1); //true
		
		//2.isEnabled method:
		boolean b2 = driver.findElement(By.name("action")).isEnabled();
		System.out.print(b2); //true
		
		//select I agree checkbox
		driver.findElement(By.name("terms")).click();
		boolean b3 = driver.findElement(By.name("terms")).isEnabled();
		System.out.println(b3); //true
		
		//3.isSelected() method is only applicable for dropdown, checkbox, radiobutton
		
		boolean b4 = driver.findElement(By.name("terms")).isSelected();
		System.out.println(b4);//true
		
		//deselect the checkbox:
		driver.findElement(By.name("terms")).click();
		boolean b5 = driver.findElement(By.name("terms")).isSelected();
		System.out.println(b5); //false
		
	
	}

}
