package Chapter_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("admin");
		
		driver.findElement(By.name("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
		System.out.println(driver.getCurrentUrl());
		String Title= driver.getTitle();
		
		if(Title.equals("Log in to Facebook"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();
	}

}
