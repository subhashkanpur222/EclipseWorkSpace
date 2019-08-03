package DynamicProgramming;

/*
 * https://www.geeksforgeeks.org/longest-repeating-and-non-overlapping-substring/
 * Input : str = "geeksforgeeks"
 * Output : geeks 
 */
public class LongestRepeatingandNonOverlappingsubstring {
	static String longestRepeatedSubstring(String str)
	{
		String result = "";
		int n = str.length();
		int LCSRe[][] = new int[n+1][n+1];
		int res_length = 0; // To store length of result  
		int i, index = 0; 
		for( i=1;i<=n;i++)
		{
			for(int j=i+1; j<=n ; j++)
			{
				if(str.charAt(i-1) == str.charAt(j-1) && (j-i) > LCSRe[i-1][j-1])
				{
					LCSRe[i][j] = LCSRe[i - 1][j - 1] + 1;
					if (LCSRe[i][j] > res_length) { 
                        res_length = LCSRe[i][j]; 
                        index = Math.max(i, index); 
					}
				}
				else { 
                    LCSRe[i][j] = 0; 
                } 
			}
		}
		if (res_length > 0) { 
            for (i = index - res_length + 1; i <= index; i++) { 
                result += str.charAt(i - 1); 
            } 
        } 
		return result;
	}
	public static void main(String[] args) {
		 String str = "geeksforgeeks"; 
	     System.out.println(longestRepeatedSubstring(str));
	}
}
