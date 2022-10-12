package Chapter_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		String actualtitle= driver.getTitle();
		System.out.println(actualtitle);
		
		if(actualtitle.equals("actiTIME - Login"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		System.out.println(driver.getCurrentUrl()	);
		Thread.sleep(3000);
		driver.close();
	}

}
