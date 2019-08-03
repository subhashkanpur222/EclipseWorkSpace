package com.luv2code.array;

import java.util.HashMap;

/*  https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
 * Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6 (Starting and Ending indexes of output subarray)

Input: arr[] = {1, 1, 1, 1}
Output: No such subarray
 */

public class LargestSubarrayWithEqualNumberof0sand1s {
	static void largestSubarryEquall0s1s(int arr[], int n)
	{
		int maxLength = 0, sum = 0;
		HashMap <Integer, Integer> hm = new HashMap<>();
		for(int i =0; i<n; i++)
			if(arr[i] == 0)
				arr[i] = -1;
		
		for(int i = 0; i<n ;i++)
		{
			sum += arr[i];
			if(sum == 0 && hm.containsKey(sum))
			{
				
				hm.put(sum, i);
				if (maxLength < i)
				maxLength = i; 
				
			}
			if(!hm.containsKey(sum))
				hm.put(sum, i);
			else
			{
				hm.put(sum, i-hm.get(sum));
				if (maxLength < i-hm.get(sum))
					maxLength = i-hm.get(sum); 					
			}
		}
		
		System.out.println("MAximum length subarry with 0 and 1 is: "+maxLength+1);
		
	}	
	public static void main(String[] args) {
		 int arr[] = {1, 0, 0, 1, 0, 1, 1}; 
	     int n = arr.length;
	     largestSubarryEquall0s1s(arr, n);
	}

}
