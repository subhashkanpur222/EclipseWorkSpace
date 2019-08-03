package Collections;

import java.util.*;

public class LinkedListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 =new LinkedList<String>();
		l1.add("RED");
		l1.add("BLACK");
		l1.add("GREEN");
		l1.add("BLUE");
		
		//Iterate all the element
		//for(String s:l1)
		//System.out.println(s);
		
		//Iterate from 2nd element
		Iterator p = l1.listIterator(1);
		//while(p.hasNext())
			//System.out.println(p.next());
		
		//Iterate in reverse order
		Iterator q= l1.descendingIterator();
		//while(q.hasNext())
			//System.out.println(q.next());
		
		//Add element at begining and end
			l1.addFirst("YELLO");
			l1.addLast("PINK");
			//System.out.println(l1);
			
		//	
	}

}
