package Chapter_2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_childbrowser2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.xpath("//span[text()='GEARS']")).click();
		driver.findElement(By.xpath("(//a[@href='https://demoapp.skillrary.com'])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		System.out.println(parent);
		System.out.println(child);
		
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
