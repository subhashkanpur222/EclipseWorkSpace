package Array;

import java.util.HashSet;

/*  https://www.geeksforgeeks.org/find-the-element-that-appears-once/
 * input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7}
   Output: 7
*/

public class SingleOccuringElement {
	static int singleNumber(int arr[], int n)
	{
		int result = 0, array_sum=0,set_sum=0;
		int a[];
		HashSet<Integer> hs = new HashSet<>();
		for(int i: arr)
		{
			hs.add(i);
		}
		for(int i: hs)
		{
			set_sum += i;
		}
		
		for(int i:arr)
		{
			array_sum += i;
		}
		
		result = (3*set_sum-array_sum)/2;
		
		return result;
	}
	public static void main(String[] args) {
		int a[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7}; 
        int n = a.length; 
        System.out.println("The element with single occurrence is " + singleNumber(a, n)); 
	}

}
