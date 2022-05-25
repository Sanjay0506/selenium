package week2.day2.assignment4;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnLoginPages {



	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		driver.findElement(By.className("btn")).click();
		System.out.println("Page title is : " + driver.getTitle());
		driver.get("https://acme-test.uipath.com/logout");
		//			 driver.manage().window().minimize();
		driver.close();
	}
}
