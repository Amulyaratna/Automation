package EXCEPTION;

import java.io.FileInputStream;

import ABSTRACTION.HDFC;

public class LEARNEXCEPTION2 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		try
		{
		System.out.println(a/b);//business logic
		HDFC b1= new HDFC();
		b1.demonetization();
		//FileInputStream file= new FileInputStream("FFYUHGH");
		throw new Error("TESTING error");
		
		}catch(ArithmeticException e)//recovery scenario
		{
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
			catch(Exception e)
		{System.out.println(e.getMessage());
		}
			catch(Throwable e)
		{System.out.println(e.getMessage());
		}
		System.out.println("TESTING");

	}

}
