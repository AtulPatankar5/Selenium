package Chapter_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Annotation2 {

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
	public void mainclass() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("1234567890");
		driver.findElement(By.name("did_submit")).click();

		
		
		String title=driver.getTitle();
		
		//Assert.assertEquals(title, "hello");
		SoftAssert s= new SoftAssert();
		s.assertEquals(title, "Forgotten Password | Can't Log In | Facebook" );

		String url= driver.getCurrentUrl();
		Reporter.log(url,true);
		Reporter.log(title,true);	
		Thread.sleep(3000);
		
		s.assertAll();
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	
	}
}
