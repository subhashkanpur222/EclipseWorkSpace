package com.luv2code.array;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
	 public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
		    // Write your code here
		    List<Integer> c = new ArrayList<Integer>();
		    int n1 = a.size(), n2 = b.size();
		    if(a.size() == 0)
		    return b;
		    if(b.size() == 0)
		    return a;
		    //System.out.println("n1 = "+n1+" n2= "+n2);
		    int i=0, j=0;
		    while(i<n1 && j<n2)
		    {
		        if(a.get(i) < b.get(j))
		        {
		            c.add(a.get(i));
		            i++;
		            System.out.println("line 23");
		        }
		        else if(a.get(i) > b.get(j))
		        {
		            c.add(b.get(j));
		            j++;
		            System.out.println("line 29");
		        }
		         else if(a.get(i) == b.get(j))
		        {
		            c.add(b.get(j));
		            j++;
		            System.out.println("line 34");
		        }
		    }
		    if(i<n1)
		    {
		        for(;i<n1;i++)
		        c.add(a.get(i));
		        System.out.println("line 42");
		    }
		     if(j<n2)
		    {
		        for(;j<n2;j++)
		        c.add(b.get(j));
		        System.out.println("line 48");
		    }
		    return c;
		    }
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		//a.add(7);
		//a.add(7);
		b.add(0);
		b.add(1);
		//b.add(2);
		//b.add(3);
		List<Integer> c = mergeArrays(a,b);
		System.out.println(c);
	}

}
