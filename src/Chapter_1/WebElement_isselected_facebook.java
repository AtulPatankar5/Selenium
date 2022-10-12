package Chapter_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_isselected_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement check = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(check.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected ");
		}
		driver.close();
	}

}
