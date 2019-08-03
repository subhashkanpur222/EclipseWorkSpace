package com.luv2code.array;

/*
 * https://www.geeksforgeeks.org/find-the-element-before-which-all-the-elements-are-smaller-than-it-and-after-which-all-are-greater-than-it/
 * Input: arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
   Output: 4
   Explanation: All elements on left of arr[4] are smaller than it and all elements on right are greater.
 */
public class FindElementWithLeftSmalletRightGreater {
	static int FindElementWithLeftSmalletRightGreaterUtil(int arr[])
	{
		int n = arr.length;
		int leftArr[] = new int[n];
		int rightArr[] = new int[n];
		leftArr[0] = Integer.MIN_VALUE;
		rightArr[n-1] = Integer.MAX_VALUE;
		
		for(int i=1; i<n;i++)
		{
			if(arr[i-1] > leftArr[i-1])
				leftArr[i]=	arr[i-1];
			else
				leftArr[i]=	leftArr[i-1];
		}
		for(int i=n-2; i>=0;i--)
		{
			if(arr[i+1] < rightArr[i+1])
				rightArr[i]=	arr[i+1];
			else
				rightArr[i]=	rightArr[i+1];
		}
		for(int i=1; i<n;i++)
		{
			if(rightArr[i] > arr[i] && leftArr[i]< arr[i])
				return arr[i];
		}
	
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		System.out.println(FindElementWithLeftSmalletRightGreaterUtil(arr));
	}
}
