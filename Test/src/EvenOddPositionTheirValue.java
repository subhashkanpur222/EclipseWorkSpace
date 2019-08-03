package com.luv2code.array;
/*https://www.geeksforgeeks.org/even-numbers-even-index-odd-numbers-odd-index/
 * Input : arr[] = {3, 6, 12, 1, 5, 8}
 * Output : 6 3 12 1 8 5
 */

public class EvenOddPositionTheirValue {
	public static void printArray(int arr[], int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void arrangeOddAndEven(int arr[], int n)
	{
		int i=0,j=1;
		
		while(true)
		{
			//System.out.println("in while ");
			while ((i<n) && (arr[i]%2 == 0))
			{
				
				i=i+2;
				//flageven=true;
				
			}
			
			while ((j<n) && (arr[j]%2 == 1))
			{
				
				j=j+2;
				//flagodd=true;
				
			}
			
			if(i<n && j<n)
			{
				
				int temp=0;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
			else 
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 6, 12, 1, 5, 8 }; 
	    int n = 6; 
	  
	    System.out.print("Original Array: "); 
	    printArray(arr, n); 
	  
	    arrangeOddAndEven(arr, n); 
	  
	    System.out.print("\nModified Array: "); 
	    printArray(arr, n); 

	}

}
