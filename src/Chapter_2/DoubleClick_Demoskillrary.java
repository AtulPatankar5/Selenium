package Chapter_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Demoskillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/#");
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		
		WebElement plus= driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Actions a= new Actions(driver);
		a.doubleClick(plus).perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
