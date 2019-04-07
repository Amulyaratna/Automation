package FunctionOverloading;

public class FunctionOverloading {

	public int sum(int a,int b,int c)
	{
		System.out.println(a+b);
		return a+b;
	}
	
	public long sum(long a,long b)
	{
		System.out.println(a+b);
		return a+b;
	
	}


	public static void main(String[] args) {
		
		FunctionOverloading fun = new FunctionOverloading();
		fun.sum(10L, 20L);
		fun.sum(10, 20);
	}
}
