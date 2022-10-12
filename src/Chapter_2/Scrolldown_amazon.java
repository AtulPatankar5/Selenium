package Chapter_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//WebElement scroll = driver.findElement(By.xpath("(//h3[@class='hl-popular-destinations-name'])[2]"));
		
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
