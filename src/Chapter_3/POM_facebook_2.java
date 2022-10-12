package Chapter_3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_facebook_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		POM_facebook f= new POM_facebook(driver);
		f.usernamebutton("admin32111111111");
		f.passwordbutton("manager321");
		f.loginbutton();
		Thread.sleep(3000);
		driver.close();
		
	}

}
