package String;

/*
 * https://www.geeksforgeeks.org/minimum-number-of-characters-to-be-replaced-to-make-a-given-string-palindrome/
 * IP: "geeks"
 * OP: 2
 */
public class MinCharstoReplaceToMakeStringPalindrome {
	static String MinCharstoReplaceToMakeStringPalindromeUtil(String str)
	{
		int n = str.length();
		int replaceCount = 0;
		for(int i=0; i<n;i++)
		{
			if(str.charAt(i) == str.charAt(n-i-1))
				continue;
			else
			{
				replaceCount++;
				if(str.charAt(i) < str.charAt(n-i-1))
					str = str.replace(str.charAt(n-i-1), str.charAt(i));
				else
					str = str.replace(str.charAt(i), str.charAt(n-i-1));
			}
		}
		System.out.println("Minimum number of character replace are: "+replaceCount);
		return str;
	}
	public static void main(String[] args) {
		String str = "geeks";
		System.out.println(MinCharstoReplaceToMakeStringPalindromeUtil(str));
	}
}
