package Chapter_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Fileupload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.naukri.com/registration/createAccount");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver1.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("C:\\Users\\MY LAPPY HOUSE\\Desktop\\Fileupload\\Revision.au4.exe");
		
		driver1.close();
		
		
		
	}

}
