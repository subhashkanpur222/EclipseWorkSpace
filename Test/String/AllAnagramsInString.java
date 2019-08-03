package String;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]
 */
public class AllAnagramsInString {
	   static final int max_char=26;
	    public static List<Integer> findAnagrams(String s, String p) {
	        List<Integer> result = new ArrayList<Integer>();
	        if (s == null || s.length() == 0 || s.length() < p.length())
	            return result;
	        
	         
	         int hash_ptr[] = new int[max_char];
	        
	        for (int i = 0; i < p.length(); i++) {
	            hash_ptr[p.charAt(i)-'a']++;
	        }
	        
	        
	        
	        for(int i=0;i<s.length()-p.length();i++)
	        {   
	            int hash_str[] = new int[max_char];
	            for (int j = 0; j < p.length(); j++) {
	                hash_str[s.charAt(i+j)-'a']++;
	            }
	            
	            if(isMatch(hash_str, hash_ptr))
	                result.add(i);
	        }
	        return result;
	    }
	    
	    public static  boolean isMatch(int arr1[], int arr2[])
	    {
	        for(int i=0; i< arr1.length; i++)
	        {
	            if(arr1[i] != arr2[i])
	                return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAnagrams("cbaebabacd", "abc"));
	}

}
