package Chapter_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_ebAY {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		
		WebElement drop = driver.findElement(By.id("gh-cat"));
		Select s= new Select (drop);
		
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("15032");
		Thread.sleep(3000);
		s.selectByVisibleText("Collectibles");
		
		Thread.sleep(3000);
				
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for(WebElement b: options)
		{
			System.out.println(b.getText());
			
		}
		
		driver.close();

		
		
	}

}
