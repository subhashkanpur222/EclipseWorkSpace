package Collections;
import java.awt.List;
/*
 * This program is simple test for ArrayList class of List interface.
 * 
 * https://www.w3resource.com/java-exercises/collection/index.php
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("red");
		al.add("black");
		al.add("yello");
		al.add("green");
		
		//Insert element at start
		al.add(0, "pink");
		
		//Iterate all the elements
		//for(String alitr: al)
			//System.out.println(alitr);
		System.out.println("List element: "+al);
		
		//Get the first element
		//System.out.println(al.get(0));
		
		//Update specific elements in AL, update third element black with orange
		al.set(2, "orange");
		//System.out.println(al.get(2));
		System.out.println("updated third element black with orange: "+al);
		
		//Remove 3rd element from List
		al.remove(2);
		System.out.println("Removed 3rd element orange from List: "+al);
		
		//search for element in list
		if(al.contains("red"))
			System.out.println("Element Red is present in list");
		else
			System.out.println("Element Red is not present in list");
		
		//Sort list
		Collections.sort(al);
		System.out.println("Sorted List is: "+al);
		
		//copy al into al2
		ArrayList<String> al2 = new ArrayList<String>();		
		al2.add("A");
		al2.add("B");
		al2.add("C");
		al2.add("D");
		Collections.copy(al, al2);
		System.out.println("after copy: "+al);
		System.out.println("after copy: "+al2);
		
		//Swap 2 elements [0,2]
		Collections.swap(al, 0, 2);
		System.out.println("After swap of [0,2]: "+al);
		
		//Join 2 list in third
		ArrayList<String> al3 = new ArrayList<String>();
		al3.addAll(al);
		al3.addAll(al2);
		System.out.println("After joining al and al2: "+al3);
		
		//Compare al and al2 and storing result in c3
		 ArrayList<String> c3 = new ArrayList<String>();
		 for(String s1:al)
			 c3.add(al2.contains(s1)? "yes":"no");
		 System.out.println("Comparision of al and al2 list: "+c3);
				
		//Reverse arraylist
		Collections.reverse(al2);
		System.out.println("after reverse: "+al2);
		
		java.util.List<String> sub_List = al2.subList(0, 2);
		System.out.println("subList: "+sub_List);
	}

}
