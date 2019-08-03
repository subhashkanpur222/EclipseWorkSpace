package Collections;

import java.util.*;

public class HashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		
		hm.put(1, "RED");
		hm.put(2, "BLACK");
		hm.put(3, "RED");
		for(Map.Entry x:hm.entrySet())
			System.out.println(x.getKey()+" : "+x.getValue());
		
		//Print size of key-value
		int count = 0;
		for(Map.Entry x:hm.entrySet())
			count++;
		System.out.println("Count is key value pair is: "+count);
		
		//copy all of the mappings from the specified map to another map
		HashMap<Integer,String> hm1 =new HashMap<Integer,String>();
		hm1.put(1, "RED");
		hm1.put(2, "BLACK");
		hm1.put(3, "RED");
		hm1.put(4, "PINK");
		hm1.putAll(hm);
		System.out.println(hm1);
		
		//remove all of the mappings from a map
		hm1.clear();
		System.out.println("After clearing "+hm1);
		
		//check if hashmap is empty
		boolean result = hm.isEmpty();
		boolean result1 = hm1.isEmpty();
		System.out.println("check if hashmap is empty: "+result);
		System.out.println("check if hashmap is empty: "+result1);
		
		//Get a shallow copy of a HashMap instance
		HashMap<Integer,String> hm2 =new HashMap<Integer,String>();
		hm2 =(HashMap) hm.clone();
		System.out.println("After cloning "+hm2);
		
		//Test if a map contains a mapping for the specified key
		if(hm.containsKey(1))
			System.out.println("Key is present");
		else
			System.out.println("Key is not present");
		
		//Test if a map contains a mapping for the specified value
		if(hm.containsValue("RED"))
			System.out.println("value is present");
		else
			System.out.println("value is not present");
		
		// get the value of a specified key in a map
		String str = hm.get(1);
		System.out.println("Value for key 1 is: "+str);
		
		// get keyset value from map
		Set keyset = hm.keySet();
		System.out.println("keyset value from map "+keyset);
		
		//checking collection view of the map
		System.out.println("Values from value "+hm.values());
	}

}
