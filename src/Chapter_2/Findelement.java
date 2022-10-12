package Chapter_2;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		WebElement auto = driver.findElement(By.name("q"));
		auto.sendKeys("wall");

		
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(autosuggestions.size());
		for(WebElement b: autosuggestions)
		{
			System.out.println(b.getText());
		}
		driver.close();
		
		
	}

}
