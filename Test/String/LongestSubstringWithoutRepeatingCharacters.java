package String;

import java.util.*;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
//https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

public class LongestSubstringWithoutRepeatingCharacters {
	static int LongestSubstringWithoutRepeatingCharactersUtil(String str)
	{
		int maxLen = 0,start=0,j=0;
		HashSet<Character> hm = new HashSet<Character>();
		while(j<str.length() && start<str.length())
		{
			if(!hm.contains(str.charAt(j)))
				{
					hm.add(str.charAt(j++));
					maxLen = Math.max(maxLen, j-start);
				}
			else
			{
				hm.remove(str.charAt(start));
				start++;
			}
		}
		
		return maxLen;
	}
	public static void main(String[] args) {		
		String str = "abcabcab";
		System.out.println(LongestSubstringWithoutRepeatingCharactersUtil(str));
	}
}
