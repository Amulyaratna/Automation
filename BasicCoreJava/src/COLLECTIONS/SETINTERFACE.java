package COLLECTIONS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SETINTERFACE {

	public static void main(String[] args) 
	{
//		HashSet<String> set=new HashSet<>();
//		set.add("Priyanka");
//		set.add("Priyanka");
//		set.add("Pradnya");
//		set.add("Lokesh");
//		set.add("abc");
//		
//		for(String s:set)
//		{
//			System.out.println(s);//it will give u random values 
//		}
//
//		
//			LinkedHashSet<String> set2=new LinkedHashSet<>();
//			set2.add("Priyanka");
//			set2.add("Priyanka");
//			set2.add("Pradnya");
//			set2.add("Lokesh");
//			set2.add("abc");
//			
//			for(String s:set2)
//			{
//				System.out.println(s);//it will give INSERTION ORDER values 
//			}
		
	TreeSet<String> set3=new TreeSet<>();
		
		set3.add("Priyanka");
		set3.add("Priyanka");
		set3.add("Pradnya");
		set3.add("Lokesh");
		set3.add("Abc");
		
		for(String s:set3)
		{
			System.out.println(s);//it will give u SORTED values 
		}
	}
}

	
