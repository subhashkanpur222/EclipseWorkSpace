package com.luv2code.array;

/*
 	https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
 	IP: {5, 5, 10, 100, 10, 5}
 	OP: 110
 	Simple alternate sum will not work here due to negative numbers.
 */
public class MaxSumWithoutAdjacentElement {
	static int MaxSumWithoutAdjacentElementUtil(int arr[])
	{
		int maxSum = 0;
		int exclSum = 0;
		int inclSum = arr[0];
		int newSum = 0;
		for(int i=1; i<arr.length; i++)
		{
			newSum = exclSum>inclSum ?exclSum:inclSum;
			inclSum = exclSum+arr[i];
			exclSum = newSum;
		}		
		
		return exclSum>inclSum ?exclSum:inclSum;
	}

	public static void main(String[] args) {
		int arr[] = {5, 5, 10, 100, 10, 5};
		System.out.println(MaxSumWithoutAdjacentElementUtil(arr));
	}

}
