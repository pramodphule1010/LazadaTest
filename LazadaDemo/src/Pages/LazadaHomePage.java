package Pages;

import java.io.IOException;

public class LazadaHomePage extends BasePage 
{	
	public void navigateToURL() throws IOException
	{
		driver=initializer();
		driver.get("https://www.lazada.com.my");
		driver.manage().window().maximize();
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LazadaLoginPage loginpage=new LazadaLoginPage(driver);
		loginpage.getUserName().sendKeys("");
		loginpage.getPassword().sendKeys("");
		loginpage.getLoginButton().click();

		
		
	/*Actions actions=new Actions(driver);
	Action action=actions.sendKeys(Keys.ESCAPE).build();
	action.perform();*/
	
	}
	
	
}
