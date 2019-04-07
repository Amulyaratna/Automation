package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercurry");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercurry");
		
		dr.findElement(By.xpath("//input[@name='login']")).click();
		

	}

}
