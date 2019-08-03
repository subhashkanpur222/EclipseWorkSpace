package DynamicProgramming;
/* https://www.geeksforgeeks.org/coin-change-dp-7/
 * IP: {1, 2, 3}, 4;
 * OP:4 
 */
public class CoinExchangeProblem {
	static int countWays(int coins[], int m, int N)
	{
		int combinations[] = new int[N+1];
		combinations[0]=1;
		
		/*for(int coin:coins)
		{
			for(int i=0;i<=N;i++)
			{
				if(i>=coin)
					combinations[i]=combinations[i]+combinations[i-coin];
			}
		}*/
		
		for (int coin: coins)
		{
			for(int i=coin; i<=N; i++)
			{
				combinations[i] = combinations[i] + combinations[i-coin];
			}
		}
		
		return combinations[N];
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 4}; 
		int m = arr.length; 
		int n = 4; 
		System.out.println(countWays(arr, m, n)); 
	}

}
