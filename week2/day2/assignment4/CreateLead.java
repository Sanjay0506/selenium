package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {

	public static void main(String[] args) {
//		0.Driver setup
		WebDriverManager.chromedriver().setup();
//		1. Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		//		2. Load the URL: http://leaftaps.com/opentaps/control/main
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BOFA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AISH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("H");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Page title is : " + driver.getTitle());
		driver.close();

	}

}
