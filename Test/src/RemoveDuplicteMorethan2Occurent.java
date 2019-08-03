package com.luv2code.array;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * IP: [1,1,1,2,2,3]
 * OP: [1,1,2,2,3]
 */
public class RemoveDuplicteMorethan2Occurent {
	static void printArray(int arr[], int n)
	{
		for(int i=0; i<=n  ;i++)
			System.out.println(arr[i]);
		
	}
	static void removeDuplicates(int arr[])
	{
		int i =1;
		int j =2;
		while(j < arr.length)
		{
			if(arr[j] == arr[i] && arr[j] == arr[i-1])
				j++;
			else
			{
				i++;
				arr[i] = arr[j];
				j++;
			}
		}
		printArray(arr, i);
	}
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3};
		removeDuplicates(arr);
	}

}
