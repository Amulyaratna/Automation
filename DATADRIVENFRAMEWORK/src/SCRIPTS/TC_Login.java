package SCRIPTS;

import static org.testng.AssertJUnit.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CONFIGURATIONS.config;
import LIBRARIES.ApllicationLib;
import LIBRARIES.Xls_Reader;
import PAGES.LoginPage;

public class TC_Login
{  WebDriver dr;//use webdriver globally
	@BeforeClass
	@Parameters({"browser"})
	public void preCondition(String browsername)
	{
		ApllicationLib  lib= new ApllicationLib(); //ctrl+shift+o to import all
		 dr= lib.launchBrowser(browsername);//here don't write webdriver keyword
		dr.manage().window().maximize();
		dr.get(config.URL);
	}
	@AfterClass
	public void tearDown()
	{
		dr.close();
	}
	@Test(dataProvider="getData")
	public void Script(String username, String password, String title)
	{
		//ApllicationLib  lib= new ApllicationLib(); //ctrl+shift+o
		//WebDriver dr= lib.launchBrowser("chrome");
		
		//[[System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);]]dont use it
		//[[ChromeDriver dr= new ChromeDriver();]]dont use it
		dr.manage().window().maximize();
		dr.get(config.URL);
		
		//perform login
		LoginPage obj_login= new LoginPage(dr);//call login function from login page
		obj_login.login(username, password);
		assertEquals(dr.getTitle(),title);
		
		//dr.close();
		
	}
	@DataProvider//getdata function
	public String[][]getData() throws IOException
	{
		
		Xls_Reader x1=new Xls_Reader(config.TestData);
		//System.out.println(x1.getrowcount("Sheet1"));
		String SheetName=this.getClass().getSimpleName();//rename sheet1 by tc_login and to access tc_login use this code
		int rows=x1.getrowcount(SheetName);
		int cols=x1.getColumncount(SheetName);
		String[][] data= new String[rows-1][cols];//ignore header row
		
		for (int r=2; r<=rows; r++)
		{
			for (int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=x1.getCellData(SheetName, r, c);//data[0][0]
				
			}
		}
		return data;
		
		
		
		
		
		
	}
	
}
