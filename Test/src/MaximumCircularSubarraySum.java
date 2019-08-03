package com.luv2code.array;

/*https://www.geeksforgeeks.org/maximum-contiguous-circular-sum/
	Input: a[] = {8, -8, 9, -9, 10, -11, 12}
	Output: 22 (12 + 8 - 8 + 9 - 9 + 10)

	Input: a[] = {10, -3, -4, 7, 6, 5, -4, -1} 
	Output:  23 (7 + 6 + 5 - 4 -1 + 10) 

	Input: a[] = {-1, 40, -14, 7, 6, 5, -4, -1}
	Output: 52 (7 + 6 + 5 - 4 - 1 - 1 + 40)*/

	
public class MaximumCircularSubarraySum {
	static int calCadSum(int arr[])
	{
		int calCadSumValue=0, max_sum=0;
		int n = arr.length;
		
		for(int i = 0; i<n ;i++)
		{
			max_sum += arr[i];
			if(max_sum < 0)
				max_sum = 0;
			else if(max_sum > calCadSumValue)
				calCadSumValue = max_sum;
		}
		
		return calCadSumValue;
	}
	static int MaximumCircularSubarraySumUtil(int arr[])
	{	
		int wrapSum = 0;
		int n = arr.length;
		int max_cad_sum = 0, wrapCadSum=0;
		max_cad_sum = calCadSum(arr);
		for(int i = 0; i<n ;i++)
		{
			wrapSum += arr[i];
			arr[i] = -arr[i];
		}
		
		wrapCadSum = calCadSum(arr);
		
		return max_cad_sum > wrapCadSum+wrapSum ? max_cad_sum:wrapCadSum+wrapSum;
	}
	public static void main(String[] args) {
		int arr[] = {8, -8, 9, -9, 10, -11, 12};
		System.out.println(MaximumCircularSubarraySumUtil(arr));
	}

}
