package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http://www.newtours.demoaut.com/");
		
		System.out.println(dr.findElement(By.xpath("//font[starts-with(text(),'Registered ')]")).getText());
	}

}
