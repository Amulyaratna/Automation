package functions;

public class funcalling {
	public static void main(String[] args) 
	{
		Functions.sum(10,30);
		Functions.multiply(10, 20);
		
		Functions obj=new Functions();//create object
		int a=obj.interestcalculator(10000, 8, 10);
		System.out.println(a);
		
		int b=obj.mod(20, 10);
		System.out.println(b);
		
		accessmodifiers fun= new accessmodifiers();
		fun.publicfun();
		fun.noAccessModfun();
		fun.protectedfun();
	}
}
