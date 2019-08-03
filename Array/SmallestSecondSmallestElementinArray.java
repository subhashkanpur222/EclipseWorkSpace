package Array;
/*
 https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
 Input:  arr[] = {12, 13, 1, 10, 34, 1}
 Output: The smallest element is 1 and second Smallest element is 10
 */

public class SmallestSecondSmallestElementinArray {
	public static void SmallestSecondSmallestElementinArray(int arr[])
	{
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE; 
		for(int i =0; i<arr.length ; i++)
		{
			if(arr[i] < min)
			{
				secondMin = min;
				min = arr[i];
			}
			else if(arr[i] > min && arr[i] < secondMin)
			{
				secondMin = arr[i];
			}
		}
		
		System.out.println("Minimum element is: "+min+" and second minimum element is: "+secondMin);
	}
	public static void main(String[] args) {
		int arr[] = {12, 13, 1, 10, 34, 1};
		SmallestSecondSmallestElementinArray(arr);
	}

}
