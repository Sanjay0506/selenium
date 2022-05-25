package week4.day1.assignment7;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintRowValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		WebElement table = driver.findElement(By.xpath("//div[@class='render']/table/tbody"));

		List<WebElement> allRows = table.findElements(By.tagName("tr"));

		System.out.println("This is the total numbers of rows" + allRows.size());
		int libraryRow = 0;

		for(WebElement rowText : allRows)
		{
			libraryRow++;
			if(rowText.getText().equalsIgnoreCase("Absolute Usage"))
			{
				System.out.println(rowText.getText());
				System.out.println(libraryRow + " is the row number for the Absolute Usage");
			}
		}
		List<WebElement> Absoluterow = driver.findElements(By.xpath("//div[@class='render']/table/tbody//tr["+libraryRow+"]/td"));
		int size = Absoluterow.size();
		System.out.println(size);
		for(WebElement e: Absoluterow){
			System.out.println(e.getText());
		}  

	}
}
