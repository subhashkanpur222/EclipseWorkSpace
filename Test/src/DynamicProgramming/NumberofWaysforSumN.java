package DynamicProgramming;
//repetetion allowed
//https://www.geeksforgeeks.org/ways-sum-n-using-array-elements-repetition-allowed/

//repetetion not allowed
//https://www.geeksforgeeks.org/coin-change-dp-7/
public class NumberofWaysforSumN {
	static int arr[] = {1, 5, 6}; 
	static int countWays(int N)
	{
		int count[] = new int[N+1];
		//TODO complete logic
		count[0]=1;
		for(int i=1;i<=N;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i>=arr[j])
				{
					count[i]= count[i]+count[i-arr[j]];
				}
			}
		}
		return count[N];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 7; 
		System.out.println("Total number of ways = "+ countWays(N)); 
	}

}
