package Array;

/*
 * 
 * https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 * Input : mat[4][4] ={{10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
              x = 29
			Output : Found at (2, 1)
 */
public class SearchinRowAndColumnSortedArray {
	static void SearchinRowAndColumnSortedArrayUtil(int arr[][], int n, int num)
	{
		int i = 0, j=n-1;
		while(i<n && j>=0)
		{
			if(arr[i][j] == num)
				System.out.println("Fount at: "+i+", "+j);
			if(num>arr[i][j])
				i++;
			else
			j--;		
		}
		
	}
	public static void main(String[] args) {
		int mat[][] ={{10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
		SearchinRowAndColumnSortedArrayUtil(mat, 4, 45);
	}

}
