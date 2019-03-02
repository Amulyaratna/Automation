package StringClass;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Pradnya";
/*System.out.println(str.length());
String str2=str.replace("a", " ");
System.out.println(str2.length());
System.out.println(str.lenth-str2.length());
System.out.println(str.length()-(str.replace("a","")).length());*/

int count=0;
for(int i=0; i<str.length(); i++)
{
	if(str.charAt(i)=='a')
	{
		count++;
		
	}
}
System.out.println(count);

	}

}
