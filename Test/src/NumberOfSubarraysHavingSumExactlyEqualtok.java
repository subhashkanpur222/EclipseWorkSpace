package com.luv2code.array;

import java.util.HashMap;

/*https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/
	Input : arr[] = {10, 2, -2, -20, 10}, 
    k = -10
Output : 3
Subarrays: arr[0...3], arr[1...4], arr[3..4]*/	

public class NumberOfSubarraysHavingSumExactlyEqualtok {
	static int NumberOfSubarraysHavingSumExactlyEqualtokUtil(int arr[], int sum)
	{
		int count =0;
		int n = arr.length;
		int currentSum = 0;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i =0; i<n; i++)
		{
			currentSum += arr[i];
			if(currentSum == sum)
				count++;
			
			if(hm.containsKey(currentSum-sum))
				count += hm.get(currentSum-sum);
			
			Integer it = null;
			it = hm.get(currentSum);
			if(it == null)
				hm.put(currentSum, 1);
			else
				hm.put(currentSum, it+1);
		}
		
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {9, 4, 20, 3, 10, 5};
		int sum = 33;
		System.out.println("NumberOfSubarraysHavingSumExactlyEqualtok is: "+NumberOfSubarraysHavingSumExactlyEqualtokUtil(arr, sum));
	}

}
