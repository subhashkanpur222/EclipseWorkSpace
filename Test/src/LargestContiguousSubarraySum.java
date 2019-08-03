package com.luv2code.array;
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class LargestContiguousSubarraySum {
	static int maxSubArraySum(int array[])
	{
		int maxContiSubArraySum = 0;
		int sum = 0;
		for(int i=0; i<array.length; i++)
		{
			sum +=array[i];
			if(sum < 0)
				sum = 0;
			if (maxContiSubArraySum < sum)
				maxContiSubArraySum = sum;
		}		
		return maxContiSubArraySum;
	}
public static void main(String[] args) {
     int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
     System.out.println("Maximum contiguous sum is " + maxSubArraySum(a)); 
   } 
}
