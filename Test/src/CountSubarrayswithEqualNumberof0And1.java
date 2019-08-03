package com.luv2code.array;

import java.util.HashMap;
/*
 * https://www.geeksforgeeks.org/count-subarrays-equal-number-1s-0s/
 * Input : arr[] = {1, 0, 0, 1, 0, 1, 1}
   Output : 8
The index range for the 8 sub-arrays are:
(0, 1), (2, 3), (0, 3), (3, 4), (4, 5)
(2, 5), (0, 5), (1, 6)
 */
public class CountSubarrayswithEqualNumberof0And1 {
	public static int countSubarrWithEqualZeroAndOne(int arr[], int n)
	{
		int maxCount = 0, sum=0;
		HashMap<Integer, Integer> hm =new HashMap<Integer, Integer>(); 
		for(int i = 0; i < n ; i++)
		{
			if(arr[i] == 0)
				arr[i] = -1;
			sum = sum+arr[i];
			if(sum == 0)
				maxCount = maxCount+1;
			
			if(hm.containsKey(sum))
				maxCount = maxCount+hm.get(sum);
			
			if(!hm.containsKey(sum))
				hm.put(sum, 1);
			else
				{hm.put(sum,hm.get(sum)+1);}
			
		}		
		return maxCount;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 }; 
        int n = arr.length; 
        System.out.println("Count = " + countSubarrWithEqualZeroAndOne(arr, n));
	}

}
