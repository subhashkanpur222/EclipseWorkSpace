package DynamicProgramming;

/*
 * https://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
 * Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3 (1-> 3 -> 8 ->9)
 */
public class MinimumJumpstoReachEndofanArray {
	public static int MinimumJumpstoReachEndofanArray(int arr[])
	{
		int jump[] = new int[arr.length];
		jump[0] = 0;
		if(arr.length == 0 || arr[0] == 0)
			return 0;
		for(int i=1; i< arr.length; i++)
		{
			jump[i] = Integer.MAX_VALUE;
			for(int j=0; j<i;j++)
			{
				if(jump[j] != Integer.MAX_VALUE && i <= j+arr[j])
					{
						jump[i] = Math.min(jump[i], jump[j]+1);
						break;
					}
			}
		}
		
		return jump[arr.length-1];
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
		System.out.println(MinimumJumpstoReachEndofanArray(arr));
	}

}
