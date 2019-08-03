package DynamicProgramming;

public class MinCosttoReachDestination {
	static int INF = Integer.MAX_VALUE,N = 4;
	static int minCosttoDestination(int cost[][]) 
	{
		int distance[] = new int[N];
		
		for(int i=0; i<N; i++)
			distance[i] = INF; 
			
		distance[0] = 0;
		for(int i=0; i<N; i++)
		{
			for(int j=i+1; j<N; j++)
			{
				if(distance[j] > distance[i] + cost[i][j])
					distance[j] = distance[i] + cost[i][j];
			}
		}
		
		return distance[N-1];
	}
	public static void main(String[] args) {
		 int cost[][] = { {0, 15, 80, 90}, {INF, 0, 40, 50},{INF, INF, 0, 70},{INF, INF, INF, 0} }; 
   System.out.println("The Minimum cost to reach station "+ N+ " is "+minCosttoDestination(cost));
	}

}
