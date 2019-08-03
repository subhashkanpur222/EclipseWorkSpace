package com.luv2code.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * http://www.goodtecher.com/leetcode-39-combination-sum/
 * IP: [2, 3, 6, 7] target sum =7
 * OP: [[7], [2, 2, 3]]
 * NOTE:The solution set must not contain duplicate combinations. All numbers (including target) will be positive integers.
 */
public class CombinationSum {
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(target == 0 || candidates.length == 0)
        	return result;
        
        Arrays.sort(candidates);
        
        List<Integer> combination  = new ArrayList<>();
        
        toFindCombinationsToTarget(result, candidates, combination, target, 0);
        
        return result;
    }
	public static void toFindCombinationsToTarget(List<List<Integer>> result, int[] candidates,  List<Integer> combination, int target, int start)
	{
		if(target == 0)
		{
			result.add(new ArrayList<>(combination));
			return;
		}
		for(int i=start; i<candidates.length ; i++)
		{
			if (candidates[i] > target) {
                break;
            } 
			
			combination.add(candidates[i]);
			toFindCombinationsToTarget(result, candidates, combination, target-candidates[i], i);
			combination.remove(combination.size()-1);
			
		}
		
	}
	public static void main(String[] args) {
		int candidates[] = {2,3,6,7}, target = 7;
		List<List<Integer>> result = combinationSum(candidates, target);
		System.out.println(result.size());
		for(List<Integer> list: result)
		{
			System.out.println(list);
		}
	}

}
