package web_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
	   // The fields present on the login page are: Username and password (Test fields) and Login (button) and forgot password
		
		//Targetting a field using name attribute
		
		driver.findElement(By.name("username")).sendKeys("Admin"); // Username field
		driver.findElement(By.name("password")).sendKeys("admin123"); // password field
		
		//For login and forgot password, there is no name attribute or Id attribute, so they can be targetted using Xpath.
		
		//Targetting all the fields using xpath
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin"); // username field
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); // password field
		//driver.findElement(By.xpath("//button")).click(); // login button
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p")).click(); // forgot password
		
//		
		
		

	}

}
