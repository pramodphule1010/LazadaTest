package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public WebDriver driver;
	public WebDriver initializer()throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();	
		return driver;
	}
	public void closeDriver()
	{
		driver.close();
	}
}
	
