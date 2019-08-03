package com.luv2code.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Sum3ElementAs0 {
	static List<List<Integer>> Sum3ElementAs0Util(int nums[])
	{
		    Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList<>();
	        TreeSet<String> set = new TreeSet<String>();
	        int count = 0;
	        for(int i =0 ; i< nums.length-2; i++)
	        {
	            HashSet<Integer> hs = new HashSet<Integer>();
	            for(int j = i+1; j<nums.length; j++)
	            {
	                int sum = -(nums[i]+nums[j]);
	                if(hs.contains(sum))
	                {
	                    String str = nums[i] + ":" + nums[j] + ":" + sum;
	                    
	                    if (!set.contains(str)) 
	                    { 
	                        List<Integer> tempList = new ArrayList<>();
	                        tempList.add(nums[i]);
	                        tempList.add(sum);
	                        tempList.add(nums[j]);
	                        list.add(tempList);
	                        set.add(str);
	                    }   
	                }
	                else
	                    hs.add(nums[j]);
	             }
	        }
	        
	        return list;
	}
	public static void main(String[] args) {
		int arr[] = {-1,0,1,2,-1,-4};
		System.out.println(Sum3ElementAs0Util(arr));
	}

}
