package web_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard_Page {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		
		//Logging into the Orange HRM 
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin"); //Entering Username
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); //Entering Password
		driver.findElement(By.xpath("//button")).click(); //clicking on login button
		
		
		//Now we are in the dashboard page 
		
		// The 4 sidebar elements chosen to be targetted are leave , time , recruitment , and myinfo
		
		//Usually all the elements in HTML won't be having the name and Id attribute, so we can't use the name and Id locator for them
		//Here also , for the above mentioned elements the name and Id is not present so we will go with xpath
		
		driver.findElement(By.xpath("//li[3]//a")).click();  //clicking on leave element
//		driver.findElement(By.xpath("//li[4]//a")).click();  //clicking on time element 
//		driver.findElement(By.xpath("//li[5]//a")).click();  //clicking on recruitment element
//		driver.findElement(By.xpath("//li[6]//a")).click();  //clicking on myinfo element
		
		
		// Anoter way of locating the elements is by using linktext. This can be used only when the element to be targetted lies inside 
		//the achor tag 
		
		
		
//		driver.findElement(By.linkText("Leave")).click();  //clicking on leave element
//		driver.findElement(By.linkText("Time")).click();  //clicking on time element 
//		driver.findElement(By.linkText("Recruitment")).click();  //clicking on recruitment element
//		driver.findElement(By.linkText("My Info")).click();  //clicking on myinfo element
		
		
		
		
		
		
		
		
		
		
	}

}
