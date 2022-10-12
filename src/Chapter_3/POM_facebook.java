package Chapter_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_facebook {

	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
public POM_facebook(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
}	

public void usernamebutton(String un)
{
	username.sendKeys(un);
}
public void passwordbutton(String pass)
{
	password.sendKeys(pass);
}
public void loginbutton()
{
	login.click();
}

}

