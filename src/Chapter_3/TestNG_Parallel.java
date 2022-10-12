package Chapter_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TestNG_Parallel {

	public WebDriver driver;
	@org.testng.annotations.Parameters({"browsername"}) 
	@Test
	public void demo(String browser)
	{
		if (browser.equals("chrome"))
		{
			driver= new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("manager1242");
		driver.findElement(By.id("pass")).sendKeys("123333333333");
		driver.findElement(By.id("login")).click();
		
		
		Reporter.log(driver.getCurrentUrl());
		Reporter.log(driver.getTitle());
		
	}
}
