package StringClass;

public class STR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Pradnya Maske";
//Length
System.out.println(str.length());

//Trim
System.out.println(str.trim());

//Chat At
System.out.println(str.charAt(3));

//Sub String
String str2=str.substring(0,7);
System.out.println(str2);

String str3=str.substring(8);
System.out.println(str3);

String str4="Pradnya";
String str6=str4.trim();
String str5=str6.substring(0);


System.out.println(str5);
//Replace
String str7=str.replace("a", "p");
System.out.println(str7);

//Split
String[] arr=str.split(" ");
int l=arr.length;
System.out.println(0);
System.out.println(arr[0]);
System.out.println(arr[1]);

//Equals & EqualIgnoreCase

String a="pradnya";
String b="Pradnya";
System.out.println(a.equals(b));
System.out.println(a.equalsIgnoreCase(b));










	}

}
