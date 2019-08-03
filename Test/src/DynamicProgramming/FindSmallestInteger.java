package DynamicProgramming;
/*
 * https://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/
 * IP: {1, 1, 3, 4}
 * OP: 10
 * 
 * IP: {1, 3, 6, 10, 11, 15};
 * OP: 2
 * 
 * IP: {1, 2, 3, 4, 5, 6}
 * OP: 22
 */
public class FindSmallestInteger {
	static int FindSmallestIntegerUtil(int arr[])
	{
		int result = 1;
		for(int i =0;i<arr.length && arr[i] <= result; i++)
		{
			result += arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = {1,1, 3, 6, 10, 11, 15};
		
		System.out.println(FindSmallestIntegerUtil(arr));
	}

}
