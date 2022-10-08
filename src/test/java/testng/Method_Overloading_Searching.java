package testng;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Method_Overloading_Searching {
	 //WebDriver driver = new ChromeDriver();
	 private static WebDriver driver = null;
  @Test
  public void Search() {
	  System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();	//
	  Method_Overloading_Searching obj = new Method_Overloading_Searching();
	 // obj.login();
	  obj.search("Admin");
	  obj.search("Username","userrole");
  }
  
	
void search(String c) {
	 // WebDriver driver = new ChromeDriver();
	driver.findElement(By.xpath("//div[2]/input")).sendKeys(c);
	driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
//	
	void search(String a, String b) {
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(a);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(b);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
}

