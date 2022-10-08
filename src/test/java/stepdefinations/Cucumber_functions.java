package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber_functions {
	private static WebDriver driver = null;

	@Given("User wants to login into HRM")
	public void user_login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	}
	@When("Username and password are valid")
	public void credentials_entered() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@Then("User is able to login")
	public void logged_in() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	
	
	@Given("User wants to apply for leave")
	public void apply_leave() throws InterruptedException {
		driver.findElement(By.linkText("Leave")).click(); // Clicking on the leave element on sidebar
		driver.findElement(By.linkText("Apply")).click();  // clicking on apply button for leave
	}
	@When("User is logged into HRM")
	public void logged_hrm() {
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click(); // selecting an option from dropdown using the contains filter
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-11-11"); // sending the leave date
	}
	@Then("User can go into leave and then apply ")
	public void apply() {
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // clicking on submit application
	}
	
	
	@Given("User goes on the admin page")
	public void user_search() throws InterruptedException {
		driver.findElement(By.linkText("Admin")).click();
	}
	
	
	@Then("User can go into admin and search for his name and role")
	public void user_role() {
		Cucumber_functions obj  = new Cucumber_functions();
		  obj.search("Admin");
		  obj.search("Username","userrole");
	}
	
	
   void search(String c) {
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
