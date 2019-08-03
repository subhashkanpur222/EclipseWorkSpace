package DynamicProgramming;
//This is backtracking way to reach a destination from source and returns the total number of ways

public class CountWaysRatMaze {
	static int R=4,C=4;
	static int countPaths(int maze[][])
	{
		for(int i=0;i<R;i++)
		{
			if(maze[i][0] == 0)
				maze[i][0]=1;
			else
				break;
		}
		for(int j=1;j<C;j++)
		{
			if(maze[0][j] == 0)
				maze[0][j] = 1;
			else
				break;
		}
		for(int i = 1; i < R; i++ )
		{
			for(int j = 1; j < C; j++)
			{
				if(maze[i][j] >= 0 && maze[i-1][j] >= 0)
					maze[i][j] += maze[i-1][j];
				if(maze[i][j] >= 0 && maze[i][j-1] >= 0)
					maze[i][j] += maze[i][j-1];
			}
		}
		
		
		return maze[R-1][C-1] > 0 ? maze[R-1][C-1]:0;
	}
	public static void main(String[] args) {
		 int maze[][] = {{0, 0, 0, 0}, 
                 {0, -1, 0, 0}, 
                 {-1, 0, 0, 0}, 
                 {0, 0, 0, 0}}; 
  System.out.println (countPaths(maze)); 
	}

}
