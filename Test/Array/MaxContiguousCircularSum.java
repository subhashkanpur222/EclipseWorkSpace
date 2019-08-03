package Array;

/*
 https://www.geeksforgeeks.org/maximum-contiguous-circular-sum/
 input: a[] = {8, -8, 9, -9, 10, -11, 12}
Output: 22 (12 + 8 - 8 + 9 - 9 + 10)

Input: a[] = {10, -3, -4, 7, 6, 5, -4, -1} 
Output:  23 (7 + 6 + 5 - 4 -1 + 10) 
 */
public class MaxContiguousCircularSum {
	static int maxCircularSum(int a[])
	{
		int n = a.length; 
		  
        // Case 1: get the maximum sum using standard kadane' 
        // s algorithm 
        int max_kadane = kadane(a); 
  
        // Case 2: Now find the maximum sum that includes 
        // corner elements. 
        int max_wrap  =  0; 
        for (int i = 0; i < n; i++) 
        { 
            max_wrap += a[i]; // Calculate array-sum 
            a[i] = -a[i];  // invert the array (change sign) 
        } 
  
        // max sum with corner elements will be: 
        // array-sum - (-max subarray sum of inverted array) 
        max_wrap = max_wrap + kadane(a); 
  
        // The maximum circular sum will be maximum of two sums 
        return (max_wrap > max_kadane)? max_wrap: max_kadane; 
	}
	static int kadane(int arr[])
	{
		int maxSum = 0, sum = 0;
		for(int i=0;i< arr.length;i++)
		{
			sum = arr[i];
			if(sum > maxSum)
				maxSum = sum;
			else if (sum < 0)
				sum = 0;
		}
		return maxSum;
	}
	public static void main(String[] args) {
		 int a[] =  {8, -8, 9, -9, 10, -11, 12}; 
         System.out.println("Maximum circular sum is " + maxCircularSum(a)); 
	}

}
