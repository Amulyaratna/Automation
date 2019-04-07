package LIBRARIES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CONFIGURATIONS.config;

public class ApllicationLib 
{
	public WebDriver launchBrowser(String browserName)
	{
		WebDriver dr=null;
		if(browserName.equalsIgnoreCase("Chrome"))
		{ System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);
			
			dr= new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox"))
{   System.setProperty("webdriver.gecko.driver", config.firefoxDriverPath);
	dr= new FirefoxDriver();
}else if(browserName.equalsIgnoreCase("edge"))
{
	dr= new EdgeDriver();
}
	
return dr;
}
}
