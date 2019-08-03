package Array;

public class MaxDressCount {
	static int maxDressCountUtil(int arr[], int n)
	{
		int sum = 5;
		int count=0, maxCount= 0;
		for(int i = 0; i< n; i++)
		{
			int localSum = sum;
				int j = i;
				count =0;
				while(j < n && localSum - arr[j] > 0 )
				{
					count = count +1;
					localSum = localSum-arr[j];
					j++;
					if(maxCount < count)
					maxCount = count;
				}
				
		}
		
		return maxCount;
	}
	public static void main(String[] args) {
		int arr[] = {5,2,1,1,1,1}; 
        int n = arr.length; 
        System.out.println("Count = " + maxDressCountUtil(arr, n));
	}

}
