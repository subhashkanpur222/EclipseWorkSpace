package com.luv2code.array;
//Find four elements a, b, c and d in an array such that a+b = c+d
//https://www.geeksforgeeks.org/find-four-elements-a-b-c-and-d-in-an-array-such-that-ab-cd/

import java.util.HashMap;

public class SumPairElements {
	class Pair{
		int first,second;

		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}
	public void findPairs(int arr[])
		{
			HashMap<Integer, Pair> hm =new HashMap<Integer, Pair>();
			for(int i=1;i<arr.length;i++)
			{
				for (int j=0;j<=i;j++)
				{
					int sum=arr[i]+arr[j];
					
					if(!hm.containsKey(sum))
					{
						hm.put(sum, new Pair(i,j));
					}
					else
					{
						Pair p = hm.get(sum);
						System.out.println(p.first+" "+p.second+" "+i+" "+j);
					}
				}
			}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 7, 1, 2, 9, 8}; 
		SumPairElements a = new SumPairElements(); 
        a.findPairs(arr); 
	}

}
