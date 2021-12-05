package stacks;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		
		//creating a hashtable
		Hashtable<String, String> hashtable = new Hashtable<String, String>();		
		
		// adding key and value pairs to hashtable
		hashtable.put("ID1", "Syed");
		hashtable.put("ID2", "John");
		hashtable.put("ID3", "Susan");
		hashtable.put("ID4", "Sushil");
		hashtable.put("ID5", "Karamvir");
		
		names = hashtable.keys();
		while(names.hasMoreElements()) {
			key = (String) names.nextElement();
			System.out.println("Key: " + key + " & Value: " + hashtable.get(key));
		}

	}

}
