package com.luv2code.array;
/*
 * https://leetcode.com/problems/container-with-most-water/solution/
 * Input: [1,8,6,2,5,4,8,3,7]
Output: 49
 * This problem is not exactly same as histogram but approach should be same.
 */
public class MaxHistogram {

	public static int maxArea(int height[])
	{
		int start=0, end=height.length-1, maxArea=0;
		while(start < end)
		{
			maxArea = Math.max(maxArea, (end-start)*Math.min(height[start], height[end]));
			if(height[start] < height[end])
				start++;
			else
				end--;
		}
		return maxArea;
	}	
	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
