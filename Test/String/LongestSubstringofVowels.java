package String;

public class LongestSubstringofVowels {
	static boolean isVowel(char c)
	{
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
			
	}
	static int longestVowel(String str)
	{
		int maxLength = 0;
		int n = str.length();
		 char[] s = str.toCharArray();
		 
		int count = 0;
		for(int i=0; i <n; i++)
		{
			if(isVowel(s[i]))
				{count++;}
			else
			{
				if(count > maxLength)
				{
					maxLength = count;
					count = 0;
				}
			}
		}		
		return maxLength;		
	}
	public static void main(String[] args) {
		String s = "theeare"; 
	    System.out.println(longestVowel(s));
	}
}
