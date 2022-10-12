package Chapter_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebELement_getlocation_amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Point loc = ele.getLocation();
		Dimension size = ele.getSize();
		
		int x = loc.getX();
		int y = loc.getY();
		
		int height = size.getHeight();
		int width= size.getWidth();
		System.out.println(height );
		System.out.println(width);
		
		
		System.out.println(x);
		System.out.println(y);
		driver.close();
		
	}

}
