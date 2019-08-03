package DynamicProgramming;

/*Program to count number of ways we can reach a score with given points
https://www.geeksforgeeks.org/count-number-ways-reach-given-score-game/
player can score 3 or 5 or 10 points in a move
Input: n = 13
Output: 2
There are following 2 ways to reach 13
(3, 5, 5)
(3, 10)
 */

public class CountWaystoReachScore {
	static int waysToReachScore(int points[], int N)
	{
		int ways[] = new int[N+1];
		ways[0] = 1;
		
	/*	for(int s:points)
		{
			for(int j = s; j <= N; j++)
				ways[j] += ways[j-s];
		}*/
		
		for (int coin: points)
		{
			for (int i= coin; i <= N; i++)
			{
				ways[i] = ways[i] + ways[i-coin];
			}
		}
		
		return ways[N];
	}	
	public static void main(String[] args) {
		int points[] = {3,5,10}; 
		int n = 20; 
	    System.out.println("Count for "+n+" is "+waysToReachScore(points, n)); 
	    n = 13; 
	    System.out.println("Count for "+n+" is "+waysToReachScore(points, n));
	}

}
