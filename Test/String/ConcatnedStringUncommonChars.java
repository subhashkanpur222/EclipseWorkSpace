package String;

import java.util.HashMap;

/* https://www.geeksforgeeks.org/concatenated-string-uncommon-characters-two-strings/
 * Input : S1 = "aacdb"
        S2 = "gafd"
   Output : "cbgf"
 */

public class ConcatnedStringUncommonChars {
	static String concatenetedStringUtil(String s1, String s2)
	{
		String result = "";
		HashMap<Character, Integer> hm = new HashMap<>(); 
		
		//Put the characters of second string into hashmap
		for(int i = 0; i< s2.length(); i++)
		{
			if(!hm.containsKey(s2.charAt(i)))
				hm.put(s2.charAt(i), 1);
		}
		
		//Put the characters of first string into hashmap
		for(int i = 0; i < s1.length() ; i++)
		{
			if(!hm.containsKey(s1.charAt(i)))
				result = result + s1.charAt(i);
			else
				hm.put(s1.charAt(i), 2);
		}
		
		//Add characters of s2 which are not present at s1
		for(int i = 0; i< s2.length(); i++)
		{
			if(hm.get(s2.charAt(i)) != 2)
				result = result + s2.charAt(i);
			
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		String s1 = "aacdb"; 
	    String s2 = "gafd"; 
	    System.out.println( concatenetedStringUtil(s1, s2));
	}

}
