package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverDragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://www.flipkart.com/");
		//button[@class='_2AkmmA _29YdH8']
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions act= new Actions(dr);
		WebElement ele=dr.findElement(By.xpath("//span[text()='Women']"));
		act.moveToElement(ele).build().perform();
		//read constructor for text area and mousehover
		//a[text()='Flats']
		//Thread.sleep(100);
		WebDriverWait wait= new WebDriverWait(dr, 2);    //wait for 2 seconds
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Flats']"))));
		dr.findElement(By.xpath("//a[text()='Flats']")).click();
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//div[@class='_3aQU3C']"))));
		//div[@class='_3aQU3C']
      act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
      
	}

}
