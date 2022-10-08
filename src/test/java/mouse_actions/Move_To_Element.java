package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/");
        Actions act =  new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
        act.moveToElement(button).perform();
	}

}
