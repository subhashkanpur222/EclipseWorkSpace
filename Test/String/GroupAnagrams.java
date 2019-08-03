package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
https://leetcode.com/problems/group-anagrams/
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */
public class GroupAnagrams {
	static List<List<String>> solution(String s[])
	{
		List<List<String>> result = new ArrayList<>();
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
		for(int i=0; i< s.length; i++)
		{
			char temp[] = s[i].toCharArray();
			Arrays.sort(temp);
			String tempString = String.valueOf(temp);;
			if(!hm.containsKey(tempString))
			{
				hm.put(tempString, new ArrayList<>());
			}
			hm.get(tempString).add(s[i]);
		}
		System.out.println(hm.values());
		return result;
	}
	public static void main(String[] args) {
		String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = solution(s);
	}
}
