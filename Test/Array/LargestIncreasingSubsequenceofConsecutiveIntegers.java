package Array;

/*https://www.geeksforgeeks.org/largest-increasing-subsequence-of-consecutive-integers/
Input : arr[] = {5, 7, 6, 7, 8} 
Output : Size of LIS = 4
         LIS = 5, 6, 7, 8*/

public class LargestIncreasingSubsequenceofConsecutiveIntegers {
	static int LargestIncreasingSubsequenceofConsecutiveIntegersUtil(int arr[], int n)
	{
		int LISCI[] = new int[n];
		int maxLen = 0;
		for(int i = 0; i<n;i++)
			LISCI[i] = 1;
		
		for(int i=1;i<n;i++)
		{
			for(int j = 0; j<=i; j++)
			{
				if((arr[i]-arr[j]) == 1 && LISCI[i] < LISCI[j]+1)
					LISCI[i] = LISCI[j] +1;
			}
		}
		
		for(int i = 0; i<n;i++)
			if(LISCI[i] > maxLen)
				maxLen = LISCI[i];
		
		return maxLen;
	}
	public static void main(String[] args) {
		int arr[] = {2, 5, 3, 7, 4, 8, 5, 13, 6};
		int n = arr.length;
		System.out.println("LargestIncreasingSubsequenceofConsecutiveIntegers is: "+LargestIncreasingSubsequenceofConsecutiveIntegersUtil(arr,n));
	}

}
