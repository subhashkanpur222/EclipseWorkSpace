package com.luv2code.array;
// https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/

public class Inplace_Rotate_Mquare_Matrix_90degrees {
	static void rotateMatrix(int N, int arr[][])
	{
		for(int x=0; x<N/2; x++)
		{
			for(int y=x; y < N-x-1; y++)
			{
				int temp = arr[x][y];
				
				//
				arr[x][y] = arr[y][N-x-1];
				
				//
				arr[y][N-x-1] = arr[N-x-1][N-y-1];
				
				//
				arr[N-x-1][N-y-1] = arr[N-y-1][x];
				
				//
				arr[N-y-1][x] = temp;
			}
		}
	}
	static void displayMatrix(int N, int mat[][])
	{
		for(int i=0; i< N; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		int N = 3; 
        
        // Test Case 1 
       /* int mat[][] = 
        { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16} 
        };*/ 
        
     // Tese Case 2 
        int mat[][] = { 
                            {1, 2, 3}, 
                            {4, 5, 6}, 
                            {7, 8, 9} 
                        }; 
         
        
        rotateMatrix(N,mat); 
        
        // Print rotated matrix 
        displayMatrix(N,mat); 
	}
}
