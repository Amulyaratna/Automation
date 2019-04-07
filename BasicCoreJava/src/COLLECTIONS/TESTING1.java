package COLLECTIONS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TESTING1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stds=new ArrayList<>();
		stds.add("Pradnya");
		stds.add("abc");
		stds.add("xyz");
		
		LinkedList<String> stds1=new LinkedList<>();
		stds1.add("Pradnya");
		stds1.add("abc");
		stds1.add("xyz");
		
		Vector<String> stds2=new Vector<>();
		stds2.add("Pradnya");
		stds2.add("abc");
		stds2.add("xyz");
		
		for(String s:stds)
		{
			System.out.println(s);
		}

	}

}
