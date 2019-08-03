package Array;

/*
 * https://www.geeksforgeeks.org/trapping-rain-water/
 * int arr[] = {3, 0, 0, 2, 0, 4}
 * OP: 10
 */
public class RainWaterHarvesting {
	public static int findWater(int arr[], int n)
	{
		int storedWater = 0;
		int leftMax=0, rightMax=0;
		for(int i = 1; i<arr.length-1 ; i++)
		{
			int leftIndex=i-1, rightIndex=i+1;
			while(leftIndex >= 0)
			{
				if(leftMax < arr[leftIndex])
					leftMax = arr[leftIndex];
				leftIndex--;
			}
				
				
			while(rightIndex < arr.length)
			{
				if(rightMax < arr[rightIndex])
					rightMax = arr[rightIndex];
				rightIndex++;
			}
			storedWater += Math.min(leftMax, rightMax) - arr[i];
			
		}
		
		return storedWater;
		
	}
	public static void main(String[] args) {
		int arr[] = {3, 0, 0, 2, 0, 4};
		int n = arr.length; 
        
        System.out.println("Maximum water that can be accumulated is "+ findWater(arr, n)); 
	}

}
