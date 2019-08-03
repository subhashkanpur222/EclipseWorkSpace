package DynamicProgramming;

/*
  https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
  Input:  set[] = {3, 34, 4, 12, 5, 2}, sum = 9
  Output:  True  //There is a subset (4, 5) with sum 9.
 */
public class SubsetSumProblem {
public static boolean isSubsetSum(int arr[], int n, int sum)
{
	if(sum != 0 && n == 0)
		return false;
	if(sum == 0)
		return true;

	
	return isSubsetSum(arr, n-1, sum-arr[n-1])||isSubsetSum(arr, n-1, sum);

}
	public static void main(String[] args) {
		int set[] = {3, 34, 4, 12, 5, 2}; 
        int sum = 9; 
        int n = set.length; 
        if (isSubsetSum(set, n, sum) == true) 
            System.out.println("Found a subset with given sum"); 
        else
            System.out.println("No subset with given sum"); 
	}

}
