package week2.day2.assignment4;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//		 driver.manage().window().minimize();
		//		 driver.close();

		
	
	}

}
