package LOGICTESTING;

import static org.testng.AssertJUnit.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CONFIGURATIONS.config;
import LIBRARIES.Xls_Reader;

public class TESTING 
{
	@Test(dataProvider="getData")//syntax
public void testScript(String username, String password, String title)
{

	System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);
	ChromeDriver dr= new ChromeDriver();
	dr.manage().window().maximize();
	dr.get(config.URL);
	dr.findElement(By.name("userName")).sendKeys(username);
	dr.findElement(By.name("password")).sendKeys(password);
	dr.findElement(By.name("login")).click();
	System.out.println(dr.getTitle());
	
	//String expectedTitle="Find a Flight: Mercury Tours:"; // execute String expectedTitle="Find a Flight: Mercury Tours";
	
	//validation insert
	assertEquals(dr.getTitle(),title);
	
	dr.close();
	
	
	
}
	@DataProvider
	public String[][]getData() throws IOException
	{
		
		Xls_Reader x1=new Xls_Reader(config.TestData);
		//System.out.println(x1.getrowcount("Sheet1"));
		
		int rows=x1.getrowcount("Sheet1");
		int cols=x1.getColumncount("Sheet1");
		String[][] data= new String[rows-1][cols];//ignore header row
		
		for (int r=2; r<=rows; r++)
		{
			for (int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=x1.getCellData("Sheet1", r, c);//data[0][0]
				
			}
		}
		return data;
		
		
		
		
		
		
	}
	
	
	
	
	
}
