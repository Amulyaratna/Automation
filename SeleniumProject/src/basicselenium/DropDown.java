package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.partialLinkText("REGISTER")).click();
		
		WebElement ele =dr.findElement(By.name("country"));
		Select sel= new Select(ele);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		sel.selectByValue("234");
		
		
		
		
		
	}

}
