package Chapter_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement drop1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement drop2= driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions a= new Actions(driver);
		a.dragAndDrop(drop1, drop2).perform();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
