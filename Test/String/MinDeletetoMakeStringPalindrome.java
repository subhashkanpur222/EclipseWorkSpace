package String;

/*
https://www.geeksforgeeks.org/minimum-number-deletions-make-string-palindrome/
Input : aebcbda
Output : 2
Remove characters 'e' and 'd'
 */
public class MinDeletetoMakeStringPalindrome {
	static int minDeletetoMakeStringPalindrome(String str)
	{
		int length = str.length();
		int lcsCount = LongestPalindromicSubsequence.lps(str, 0, str.length()-1);
		
		return length-lcsCount;
	}
	public static void main(String[] args) {
		String str = "aebcbda";
		System.out.println(minDeletetoMakeStringPalindrome(str));
	}

}
