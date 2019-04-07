package fileproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readpropertiesfile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file= new FileInputStream("C:\\Users\\akshaya\\workspace\\BasicCoreJava\\src\\fileproperties\\objectrepo.properties");
		Properties or= new Properties();
		or.load(file);
		
		System.out.println(or.getProperty("username"));
		System.out.println(or.getProperty("password"));
		System.out.println(or.getProperty("login"));
		//Thread.sleep(4000);

	}

}
