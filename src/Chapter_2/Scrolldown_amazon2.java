package Chapter_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_amazon2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("(//h3[@class='hl-popular-destinations-name'])[4]"));
		Point loc = scroll.getLocation();
		int x= loc.getX();
		int y = loc.getY();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		scroll.click();
		
		driver.close();
		
		
	}

}
