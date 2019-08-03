package DynamicProgramming;

public class SetPartitionWaysCount {
	public static int setPartitionWayCount(int n)
	{
		int count[][] = new int [n+1][n+1];
		count[0][0] = 1;
		for(int i=1; i<=n; i++)
			count[i][0] = 0;
		
		for(int i=0; i<=n; i++)
		{
			for(int j=1; j<=n;j++)
			{
				count[i][j] = count[i][j-1];
				if(i>0 && j<=i)
				count[i][j] += count[i-1][j];
			}
		}		
		
		return count[n][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Number of ways of partitioning set of "+n+ " number is "+setPartitionWayCount(n));

	}

}
