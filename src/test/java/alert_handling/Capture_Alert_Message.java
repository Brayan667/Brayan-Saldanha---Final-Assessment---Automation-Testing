package alert_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Alert_Message {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    //driver.switchTo().alert().dismiss();
	    String a = driver.switchTo().alert().getText();
	    System.out.println("The alert message displayed is: " + a);

	}

}