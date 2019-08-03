package Array;
/*
  https://www.geeksforgeeks.org/find-a-subarray-whose-sum-is-divisible-by-size-of-the-array/
  Input: arr[] = {7, 5, 3, 7}
  Output: 0 1
  Sub-array from index 0 to 1 is [7, 5]
  sum of this subarray is 12 which is a multiple of 4

  Input: arr[] = {3, 7, 14}
  Output: 0 0 
 */
public class SubArraySumDivisbleByArraySize {
	static void SubArraySumDivisbleByArraySizeUtil(int arr[])
	{
		int n = arr.length;
		int sum[] = new int[n];
		sum[0] = arr[0];
		for(int i =1 ;i<n;i++)
		{
			sum[i] = sum[i-1] + arr[i];
		}
		
		for(int i =1;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if((arr[i-1]-arr[j])%n == 0)
					System.out.println("start: "+j+" end: "+i);
				return;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {7, 5, 3, 7};
		SubArraySumDivisbleByArraySizeUtil(arr);
	}

}
