package Array;
// https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
public class FindMinimumElementInSortedRrotatedArray {
	static int findMin(int arr[],int start, int end)
	{
		if(start == end)
			return arr[start];
		
		int mid = (start+end)/2;
		if(mid>start && mid<end && arr[mid] < arr[mid-1])
			return arr[mid];
		
		if(mid > start && arr[start] < arr[mid] )
			return findMin(arr, start, mid -1);
		
		return	findMin(arr, mid+1, end);
	}
	public static void main(String[] args) {
		 int arr1[] =  {5, 6, 1, 2, 3, 4}; 
	     int n1 = arr1.length; 
	     System.out.println("The minimum element is "+ findMin(arr1, 0, n1-1)); 
	}

}
