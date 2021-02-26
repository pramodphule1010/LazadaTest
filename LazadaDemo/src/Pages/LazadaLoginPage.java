package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LazadaLoginPage extends BasePage 
{	
	public WebDriver driver;
	public LazadaLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By UserName=By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input");
	By Password=By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
	By LoginButton=By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/button");
		
	public WebElement getUserName()
	{
		return driver.findElement(UserName);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(LoginButton);
	}
	
}
