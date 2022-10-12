package Chapter_2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		
		driver.close();
		
		
	}

}
