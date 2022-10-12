package Chapter_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_isdisplayed_google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement search = driver.findElement(By.name("q"));
		if(search.isDisplayed())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		WebElement searchbox = driver.findElement(By.name("btnK"));
		if(searchbox.isEnabled())
		{
			System.out.println("searching pass");
		}
		else
		{
			System.out.println("seaching fail");
		}
		
		driver.close();
					
	}

}
