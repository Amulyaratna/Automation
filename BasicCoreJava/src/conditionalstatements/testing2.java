package conditionalstatements;

public class testing2 {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("a is smallest");
			}else
			{
				System.out.println("a is greater than c but less than b");
		}
		}else
		{
			System.out.println("a is greater than b");
		}
			
			
		

	}

}
