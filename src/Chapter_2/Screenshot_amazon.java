package Chapter_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot_amazon {

	private static final String FileUtils = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		TakesScreenshot ts= (TakesScreenshot) driver;
		File RAM = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Photo/amazon2.png");
		FileUtils.copyFile(RAM,dest);
				
	}

}
