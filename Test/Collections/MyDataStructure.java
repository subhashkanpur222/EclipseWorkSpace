package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/*
 * https://www.geeksforgeeks.org/design-a-data-structure-that-supports-insert-delete-search-and-getrandom-in-constant-time/
 * Design a data structure that supports following operations in Θ(1) time.
 * insert(x): Inserts an item x to the data structure if not already present. 
 * remove(x): Removes an item x from the data structure if present.
 * search(x): Searches an item x in the data structure.
 * getRandom(): Returns a random element from current set of elements
 */
public class MyDataStructure {
	ArrayList<Integer> al;
	HashMap<Integer, Integer> hm ;
	public MyDataStructure()
	{
		al = new ArrayList<>();
		hm = new HashMap<>();
	}
	
	public void insert(int x)
	{
		Integer item = hm.get(x);
		if(item != null)
			return;
		
		int index = al.size();
		al.add(x);
		hm.put(x, index);
	}
	
	public void printList()
	{
		for(int i=0; i<al.size();i++)
			System.out.println(al.get(i));
	}
	public void remove(int x)
	{
		Integer index = hm.get(x);
		if(index == null)
			return;
		
		hm.remove(x);
		int size = al.size();
		int last = al.get(size-1);
		Collections.swap(al, index, size-1);
		al.remove(size-1);
		hm.put(last, index);
	}
	public int getRandom()
	{
		Random rand = new Random();
		int index = rand.nextInt(al.size());
		
		return al.get(index);
	}
	
	public static void main(String[] args) {
		MyDataStructure mds = new MyDataStructure();
        mds.insert(10); 
        mds.insert(20); 
        mds.insert(30); 
        mds.insert(40); 
        mds.printList();
	}
}
