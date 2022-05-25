package week4.day1.assignment7;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		List<WebElement> cols = driver.findElements(By.tagName("td"));
		for (WebElement columns : cols) {

			System.out.println(" The columns are " + columns.getText());

		}
		for (WebElement rowss : rows) {

			System.out.println(" The rows are " + rowss.getText());
		}

		System.out.println("The rows count is " +rows.size());
		System.out.println(" The columns count is " +cols.size());

		String progres = driver.findElement(By.xpath("//tr[5]/td[2]")).getText();
		System.out.println("progress value of 'Learn to interact with Elements' " +progres);

		boolean vitalenabled = driver.findElement(By.xpath("(//input[@name='vital'])[5]")).isEnabled();
		System.out.println(" The vital value of last element is " + vitalenabled);

		//TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceImage = driver.getScreenshotAs(OutputType.FILE);
		File destImage = new File("./snaps/img001.png");
		try {
			FileUtils.copyFile(sourceImage, destImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot taken");
		driver.close();

	}

}
