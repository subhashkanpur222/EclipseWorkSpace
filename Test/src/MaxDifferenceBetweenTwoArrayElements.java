package com.luv2code.array;
//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/

public class MaxDifferenceBetweenTwoArrayElements {
	static int maxDiff(int array[])
	{
		int max_diff = 0;
		int tempArray[] = new int[array.length-1];
		
		for(int i=0; i<array.length-1 ; i++)
			tempArray[i] = array[i+1] - array[i];
		
		int sum=0;
		for(int j=0; j<tempArray.length ; j++)
		{
			sum += tempArray[j];
			if(sum < 0)
				sum = 0;
			else
				if(sum > max_diff)
					max_diff = sum;
		}
		
		return max_diff;
	}
	public static void main(String[] args) {
		 int arr[] = {2, 3, 10, 6, 4, 8, 1}; 
	        System.out.println(maxDiff(arr)); 
	}
}
