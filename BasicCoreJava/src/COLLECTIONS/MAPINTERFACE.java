package COLLECTIONS;

import java.util.HashMap;
import java.util.Hashtable;

public class MAPINTERFACE {

	public static void main(String[] args) {
		HashMap<String, String> map= new HashMap<String, String>();
		map.put("name","Pradnya");
		map.put("Surname","Maske");
		map.put("org", "xyz");
		map.put(null, "xyz");
		
		System.out.println(map.get(null));//HASHMAP CAN STORE NULL KEY
		
		Hashtable<String, String> map2= new Hashtable<String, String>();
		map2.put("name","Pradnya");
		map2.put("Surname","Maske");
		map2.put("org", "xyz");
		map2.put(null, "xyz");
		
		System.out.println(map2.get(null));//HASHTABLE DOESNOT ALLOW NULL KEY

	}

}
