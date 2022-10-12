package Chapter_3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {

	@Test(priority =0, enabled=false)
	public void middle()
	{
	Reporter.log("Santosh",true);
	}
	

	@Test(priority=2)
	public void last()
	{
		Reporter.log("Patankar",true);
	}
	
	@Test(priority=-1 , invocationCount=3)
	public void first()
	{
		Reporter.log("Atul",true);
	}
	

}
