package String;

/*
 * https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/
 * IP: GEEKSFORGEEKS
 * OP: 5
 */
public class LongestPalindromicSubsequence {
	static int lps(String str, int start, int end)
	{
		if(start == end)
			return 1;
		if(str.charAt(start) == str.charAt(end) && start == end-1)
			return 2;
		
		if(str.charAt(start) == str.charAt(end))
			return 2+ lps(str, start+1, end-1);
			
		return Math.max(lps(str, start+1, end),  lps(str, start, end-1));
	}
	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		System.out.println(lps(str, 0, str.length()-1));
	}

}
