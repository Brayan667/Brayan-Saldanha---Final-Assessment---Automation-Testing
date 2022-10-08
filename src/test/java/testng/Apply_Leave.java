// This program automates the process of leave application in OrangeHRM website

package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apply_Leave {
  @Test //This is the test annotation used in TestNG
  public void HRM_leave_application() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click(); // Clicking on login button
		driver.findElement(By.linkText("Leave")).click(); // Clicking on the leave element on sidebar
		driver.findElement(By.linkText("Apply")).click();  // clicking on apply button for leave
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click(); // selecting an option from dropdown using the contains filter
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25"); // sending the leave date
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // clicking on submit application
  }
}
