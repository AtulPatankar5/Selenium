package Chapter_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_ebay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		WebElement mousehover = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		
	Actions a= new Actions(driver);
	a.moveToElement(mousehover).perform();
	driver.findElement(By.xpath("//a[text()='Apple']")).click();
	
	Thread.sleep(5000);
	driver.close();
		
	}

}
