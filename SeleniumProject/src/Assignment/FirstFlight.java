package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstFlight {

	public static void main(String[] args)
	{System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dr.get("http://newtours.demoaut.com/");
	dr.findElement(By.name("userName")).sendKeys("mercury");
	dr.findElement(By.name("password")).sendKeys("mercury");
	dr.findElement(By.name("login")).click();
	
	
		

	}

}
