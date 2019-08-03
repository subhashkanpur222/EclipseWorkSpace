package com.luv2code.array;

/*
 * https://www.geeksforgeeks.org/find-a-sorted-subsequence-of-size-3-in-linear-time/
 * Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}
 * Output: 5, 6, 30
 */
public class SortedSequenceof3NumbersinArray {
	static void SortedSequenceof3NumbersinArray(int arr[])
	{
		int start[] = new int[arr.length];
		int end [] = new int [arr.length];
		int min =arr[0], max=arr[arr.length-1];
		start[0] = -1;
		end[arr.length-1] = -1;
		for(int i=1; i<arr.length ; i++)
		{
			if(arr[i] < min)
			{
				start[i] = -1;
				min = arr[i];
			}
			else
			{
				min = arr[i];
				start[i] = 1;
			}
		}
		
		for(int i = arr.length-2; i>=0; i--)
		{
			if(arr[i] > max)
			{
				end[i] = -1;
				max = arr[i];
			}
			else
			{
				max = arr[i];
				end[i] =1;
			}
		}
		
		for(int i=0; i <arr.length ;i++)
		{
			//if(start[i] == 1 && end[i] == 1)
				System.out.print(start[i]+"\t");
		}
		System.out.println();
		for(int i=0; i <arr.length ;i++)
		{
			//if(start[i] == 1 && end[i] == 1)
				System.out.print(end[i]+"\t");
		}
	}
	public static void main(String[] args) {
		int arr[] = {12, 11, 10, 5, 6, 2, 30};
		SortedSequenceof3NumbersinArray(arr);
	}

}
