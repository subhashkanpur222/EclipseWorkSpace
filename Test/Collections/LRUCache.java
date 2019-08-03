package Collections;

import java.util.HashSet;
import java.util.*;

public class LRUCache {
	 int csize;
	 Deque<Integer> dq;  //or LinkedList<Integer> dq; able to do both end operations with this. 
	 HashSet<Integer> hs;
	public LRUCache(int n)
	{
		csize = n;
		dq = new LinkedList<>();
		hs = new HashSet<>();		
	}
	public void display()
	{
		Iterator<Integer> itr = dq.iterator(); 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public void refer(int n)
	{
		//check of key is there in hash. If key is there in has remove from that position.
		//Check if Hashset size is same as cache, remove least recently key from hashset and queue.
		if(!hs.contains(n) && dq.size()==csize)
		{
		
			int last=dq.removeLast();
			hs.remove(last);
			
		}
		else
		{
			int index = 0, i=0;
			Iterator<Integer> itr = dq.iterator();
			while(itr.hasNext())
			{
				if(itr.next() == n)
				{
					index = i;
					break;
				}
				i++;
			}
			dq.remove(index);
		}
		
		dq.push(n); 
        hs.add(n);
	}
	public static void main(String[] args) {
		  LRUCache ca=new LRUCache(4); 
	        ca.refer(1);  
	        ca.refer(2);  
	        ca.refer(3);  
	        ca.refer(1);  
	        ca.refer(4);  
	        ca.refer(5);  
	        ca.display();
	}
}
