package Array;
//  https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
public class PrintMatrixInSpiralForm {
	public static void spiralPrint(int R, int C, int a[][])
	{
		int m=R, n=C;
		int k=0,l=0;
		/* m is for end row
		 * n is for end column
		 * k is for starting row
		 * l is for starting column, 
		 * i is iterator
		 */
		while(k<m && l<n)
		{
		//print first row
			for(int i = l; i<n; i++)
				System.out.println(a[k][i]);
			k++;
		//print last column
			for(int i=k;i<m;i++)
				System.out.println(a[i][n-1]);
			n--;
			
		//print last row
			if(k<m)
			{
				for(int i=n-1; i>=0; i--)
					System.out.println(a[m-1][i]);
				m--;
			}	
			
		//print first column
			if(l<n)
			{
			for(int i=m-1; i>=k; i--)
				System.out.println(a[i][l]);
			l++;
			}
		}
	}
	public static void main(String[] args) {
		int R = 3; 
        int C = 6; 
        int a[][] = { {1,  2,  3,  4,  5,  6}, 
                      {7,  8,  9,  10, 11, 12}, 
                      {13, 14, 15, 16, 17, 18} 
                    }; 
        spiralPrint(R,C,a); 
	}

}
