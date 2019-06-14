package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTonDriver 

{

	
	public static WebDriver driver =null;
	public static void Initialize()
	{
	if (driver==null) 
	{
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Setups\\chromedriver.exe");
	      driver = new ChromeDriver();
		
		
	}	
		
		
	}
	
}
