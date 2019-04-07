package CONFIGURATIONS;

public class config {
public final static String chromeDriverPath=System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver.exe";
//final variable can't reinitialise class CANNOT extend method can't override
public final static String URL="http://www.newtours.demoaut.com/";
public final static String TestData=System.getProperty("user.dir")+"\\src\\TESTDATA\\TestData.xls";
public final static String firefoxDriverPath=System.getProperty("user.dir")+"\\BrowserDriver\\geckodriver.exe";


//System.getProperty("user.dir") fetches the directory or path of the workspace for the current project
}
