package com.luv2code.array;

/* https://www.geeksforgeeks.org/find-if-array-can-be-divided-into-two-subarrays-of-equal-sum/
 * Input:  arr = [1 , 2 , 3 , 4 , 5 , 5 ]
 * array gets divided into two subarrays [1 2 3 4] and [5, 5]
 */

public class IfArrayAanBeDividedIntoTwoSubarraysOfEqualSum {
	static void printArray(int arr[], int start, int end)
	{
		for (int i = start; i<= end ; i++)
			System.out.println(" "+arr[i]);
		
	}
	static void divideArray(int arr[], int n)
	{
		int sumLeft[] = new int[n];
		int sum = 0;
		sumLeft[0] = arr[0]; 
		for(int i=1; i < n; i++)
		{
			sumLeft[i] = sumLeft[i-1] + arr[i];
		}
		int sumRight = 0;
		for(int i=n-1; i>0; i--)
		{
			sumRight += arr[i];
			if(sumRight == sumLeft[i-1])
			{
				System.out.println("Array can be devided from 1 to "+i+" and "+i+" to "+n);
				return;
			}
		}
		
		
	}
	public static void main(String[] args) {
		int arr[] = {1 , 2 , 3 , 4 , 5 , 5 }; 
		int n = arr.length; 

		divideArray(arr, n); 
	}

}
