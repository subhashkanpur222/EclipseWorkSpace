package Array;

/*
 * http://www.zrzahid.com/sliding-window-minmax/
 *            sliding window                Min         Max
            ---------------               -----       -----
            [1  2  -1] -3  4  2  5  3       -1          2
             1 [2  -1  -3] 4  2  5  3       -3          2
             1  2 [-1  -3  4] 2  6  3       -3          4
             1  2  -1 [-3  4  2] 5  3       -3          4
             1  2  -1  -3 [4  2  5] 3        2          5
             1  2  -1  -3  4 [2  5  3]       2          5
 	minSum= -6
 	maxSum= 22
 	minSum+maxSum = 16
 	
 	IP: {1  2  -1 -3  4  2  5  3}
 	OP: 16
 */
public class FindMaxMinInSlidingWindowArray {

	public static void main(String[] args) {
		int arr[] = {1,2,-1,-3,4,2,5,3};
		int w =3;
		FindMaxMinInSlidingWindowArrayUtil(arr, w);
	}

	private static void FindMaxMinInSlidingWindowArrayUtil(int[] arr, int w) {
		int n = arr.length;
		int leftMin[] = new int[n];
		int rightMin[] = new int[n];
		
		leftMin[0] = arr[0];
		rightMin[n-1] = arr[n-1];
		
		for(int i=1; i<n;i++)
		{
			leftMin[i] = (i%w == 0)? arr[i]:Math.min(leftMin[i-1], arr[i]); 
			int j = n-i-1;
			rightMin[j] = (j%w == 0)? arr[j]: Math.min(rightMin[j+1], arr[j]);
		}
		
		//calculate min of sliding window
		int slidingMin[] = new int[n-w+1];
		int minSum = 0;
		for(int i =0 ; i<=n-w; i++)
		{
			slidingMin[i] = Math.min(rightMin[i], leftMin[i+w-1]);
			minSum += slidingMin[i];
		}
		System.out.println(minSum);
		
		int rightMax[] = new int [n];
		int leftMax[] = new int [n];
		int slidingMax[] = new int[n-w+1];
		int maxSum = 0;
		leftMax[0] = arr[0]; rightMax[n-1] = arr[n-1];
		
		for(int i = 1; i<n; i++)
		{
			leftMax[i] = (i%w == 0)? arr[i]:Math.max(arr[i], leftMax[i-1]);
			int j = n-i-1;
			rightMax[j] = (j%w == 0)? arr[j]:Math.max(arr[j], rightMax[j+1]);
		}
		
		//calculate max of sliding window
		for(int i =0 ; i<=n-w; i++)
		{
			slidingMax[i] = Math.max(rightMax[i], leftMax[i+w-1]);
			maxSum += slidingMax[i];
		}
		System.out.println(maxSum);
		
	}
}
