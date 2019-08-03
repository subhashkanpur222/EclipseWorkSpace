package com.luv2code.array;

public class GreaterElementatRightofElement {
	public static void GreaterElementatRightofElement(int arr[])
	{
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]>arr[i])
				temp[i] = arr[i+1];
			else
			{
				int j =i+2;
				while(j<arr.length)
				{
					if(arr[i]<arr[j])
					{
						temp[i] = arr[j];
						break;
					}
					else
						j++;
				}
				if(arr[arr.length-1]<arr[i])
					temp[i]=-1;
			}
		}
		temp[arr.length-1] = -1;
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
	}
	public static void main(String[] args) {
		int arr[] = {3,5,7,1,2,3,4};
		GreaterElementatRightofElement(arr);
		
	}

}
