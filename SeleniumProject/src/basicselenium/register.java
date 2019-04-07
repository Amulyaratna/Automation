package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class register {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.linkText("REGISTER")).click();
		
		dr.findElement(By.name("firstName")).sendKeys("PRADNYA"); 
		dr.findElement(By.name("lastName")).sendKeys("MASKE"); 
		dr.findElement(By.name("phone")).sendKeys("7741081245"); 
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("pradnyamaske92@gmail.com");
		dr.findElement(By.xpath("//input[@name='address1']")).sendKeys("Ganga niwas society dhanori pune");
		dr.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		dr.findElement(By.xpath("//input[@name='state']")).sendKeys("MAHARASHTRA");
		dr.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("412015");
		dr.findElement(By.name("country"));
		WebElement objweb = dr.findElement(By.name("country"));
		Select objSelect = new Select(objweb);
		//objSelect.selectByIndex(2);
		objSelect.selectByValue("251");
		//objSelect.selectByVisibleText("INDIA");
		 dr.findElement(By.name("email")).sendKeys("pradnyamaske92@gmail.com"); 
		 dr.findElement(By.name("password")).sendKeys("mercurry"); 
		 dr.findElement(By.name("confirmPassword")).sendKeys("mercurry"); 
		 
		 dr.findElement(By.xpath("//input[@name='register']")).click();
		 
		 dr.findElement(By.linkText("Home")).click();
   
		
		
		
		
		
			     
	    
	    
	    
		
		 
		
		
		
		
		
		

	}

	
		
	}

