package Array;

import java.util.HashMap;

/*Find the length of largest subarray with 0 sum
https://www.geeksforgeeks.org/find-the-largest-subarray-with-0-sum/
Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
Output: 5
The largest subarray with 0 sum is -2, 2, -8, 1, 7
*/

public class LargestSubarraySumWithZeroLength {
	static int maxLength=0, sum=0;
	static int CalculateMaxLengthZeroSum(int array[])
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++)
		{
			sum = sum+array[i];
			if(sum == 0)
			{
				maxLength = i+1;
			}
			if(!hm.containsKey(sum))
				hm.put(sum, i);
			else
			{
				int startIndex = hm.get(sum);
				maxLength = i-startIndex;
			}
			
		}		
		return maxLength;
	}
	public static void main(String[] args) {
		//int array [] = {15, -2, 2, -8, 1, 7, 10, 23};
		int array[] = {1, 0, 3};
		System.out.println("length of largest subarray with 0 sum is : "+CalculateMaxLengthZeroSum(array));
	}

}
