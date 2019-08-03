
public class eggDropProblem {
	static int maxValue(int a, int b) 
	{return (a>b)?a:b;}
	
	static int eggDrop(int n, int k)
	{
		int i,j,res,x;
		int a[][]= new int[n+1][k+1];
		for (j=1;j<=k;j++)
			a[1][j]=j;
		for(i=1;i<=n;i++)
			{a[i][1]=1;a[i][0]=0;}
		
		for (i=2;i<=n;i++)
		{
			for(j=2;j<=k;j++)
			{
				a[i][j] = Integer.MAX_VALUE;
				for (x = 1; x <= j; x++)
				{
					res=1+maxValue(a[i-1][x-1],a[i][j-x]);
					if(a[i][j]>res)
						a[i][j]=res;
				}	
			}
		}
		return a[n][k];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 2, k = 10;
	     System.out.println("Minimum number of trials in worst case with "+n+"  eggs and "+k+ " floors is "+eggDrop(n, k));   
	}

}
