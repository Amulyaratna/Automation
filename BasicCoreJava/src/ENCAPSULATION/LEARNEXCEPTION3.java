package ENCAPSULATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LEARNEXCEPTION3 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
    file("");
	}
public static void file(String filepath) throws FileNotFoundException
{
	FileInputStream file= new FileInputStream(filepath);
}
}