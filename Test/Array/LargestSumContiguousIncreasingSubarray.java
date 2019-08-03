package Array;
/*
 *  https://www.geeksforgeeks.org/largest-sum-contiguous-increasing-subarray/ 
 *  Input : arr[] = {2, 1, 4, 7, 3, 6}
Output : 12
Contiguous Increasing subarray {1, 4, 7} = 12

Input : arr[] = {38, 7, 8, 10, 12}
Output : 38
 */


public class LargestSumContiguousIncreasingSubarray {
	static int largestSum(int arr[], int n)
	{
		int largestSum = 0, sumSoFar = 0;
		for(int i =0 ;i <n-1 ;i++)
		{
						
			if(arr[i+1] > arr[i])
				sumSoFar += arr[i];
			else if(sumSoFar+arr[i] > largestSum)
				{
					largestSum = sumSoFar+arr[i];
					sumSoFar=0;
					
				}
			
		}
		
		return largestSum;
	}
	public static void main(String[] args) {
		int arr[] = {38, 7, 8, 10, 12}; 
        int n = arr.length; 
        System.out.println("Largest sum = " +  largestSum(arr, n)); 
	}
}
