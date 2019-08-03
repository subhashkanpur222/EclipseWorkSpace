package Collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExceptionExample {

	public static void main(String args[]) {
		List<String> myList = new CopyOnWriteArrayList<String>();
		//List<String> myList = new ArrayList<String>();
		/*
		 * Commented above to avoid concurrentmodificationexeption caused due to removing and adding element inside iterator.
		 * 
		 */

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				{
					myList.remove(value);
					myList.add("6");
				}
		}
//Above output is 12345 only and in next iterator it1 updated value will come		
		
Iterator<String> it1 = myList.iterator();
		
		while (it1.hasNext()) {
			String value = it1.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				{
					myList.remove(value);
					myList.add("6");
				}
		}
	

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		/*Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.put("1", "4");
				// myMap.put("4", "4");
			}
		}*/

	}
}
