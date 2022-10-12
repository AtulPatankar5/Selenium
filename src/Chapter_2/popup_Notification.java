package Chapter_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup_Notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions c= new ChromeOptions();
		c.addArguments("--disable nitification");
		
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.olx.in/");
		
		
		
		
	}

}
