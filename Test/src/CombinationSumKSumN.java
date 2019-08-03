package com.luv2code.array;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/combination-sum-iii/
 * Input: k = 3, n = 7
 *	Output: [[1,2,4]]
 *Number(from 1 to 9) repetetion not allowed and list should be in increasing order.
 */
public class CombinationSumKSumN {
	static List<List<Integer>> CombinationSumKSumNUtil(int K, int N)
	{
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> combination = new ArrayList<>();
		
		CombinationCalculate(result, combination, 3, 7, 1);
		
		return result;		
	}

	private static void CombinationCalculate(List<List<Integer>> result, List<Integer> combination, int K, int N, int start) {
		if(K == 0 && N == 0)
		{
			result.add(new ArrayList<>(combination));
			return;
		}
		for(int i=start; i<=9; i++)
		{
			if(i > N)
				break;
			combination.add(i);
			CombinationCalculate(result, combination, K-1, N-i, i+1);
			combination.remove(combination.size() -1);
		}
		
	}

	public static void main(String[] args) {
		List<List<Integer>> result = new ArrayList<>();
		result = CombinationSumKSumNUtil(3,7);
		System.out.println(result.size());
		for(List<Integer> list: result)
		{
			System.out.println(list);
		}

	}

}
