package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {
	public WebDriver driver;
	By login=By.cssSelector("#anonLogin > a");
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
}
