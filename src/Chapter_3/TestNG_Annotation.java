package Chapter_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {

	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void mainclass()
	{
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager113");
		driver.findElement(By.name("login")).click();
		
		String url= driver.getCurrentUrl();
		Reporter.log(url,true);
		
		String title=driver.getTitle();
		Reporter.log(title,true);	
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	
	}
	
}
