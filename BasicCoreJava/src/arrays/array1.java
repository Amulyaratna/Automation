package arrays;

public class array1 {

	public static void main(String[] args) 
	//single and multidimentional arrays
	{
		String[] str=new String[100];//this array can store 100 values of same type.this is single dimensional array
		String sss = new String();
		str[0]="Pradnya";
		str[1]="Bhavna";
		str[2]="Lokesh";
		str[3]="Priyanka";
		str[4]= "aniket";
		//System.out.println(str[0]);
		
//int, string, []
//System.out.println(str.length);


  /*for(int i=0; i<str.length; i++)
  {
	  System.out.println(str[i]);
	  
  }*/
		

for(String pradnya:str)
{
		System.out.println(pradnya);
}
	
	
	}

}
