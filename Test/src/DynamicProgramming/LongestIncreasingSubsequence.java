package DynamicProgramming;

public class LongestIncreasingSubsequence {
	static int longestIncrSubSeq(int arr[], int n)
	{
		int longestIncrSSeq = 1;
		int lics[] = new int[n];
		for(int i = 0; i<n ;i++)
			lics[i] = 1;
		
		for(int i = 1 ; i< n ; i++)
		{
			for(int j = 0 ;j<=i ; j++)
			{
				if(arr[i] > arr[j] && lics[i]< lics[j] + 1)
					lics[i] = lics[j] + 1;
				
			}

			if (longestIncrSSeq < lics[i])
				longestIncrSSeq = lics[i];
		}
		
		return longestIncrSSeq;
	}
	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int n = arr.length; 
        System.out.println("Length of lis is " + longestIncrSubSeq( arr, n ) + "\n" ); 
	}

}
