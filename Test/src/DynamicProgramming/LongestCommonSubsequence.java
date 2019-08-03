package DynamicProgramming;

/* https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
   IP: String s1 = "AGGTAB"; 
   String s2 = "GXTXAYB";
    
   OP:4
 */
public class LongestCommonSubsequence {
static int lcsUtil(char X[], char Y[], int m, int n)
{
	if(m == 0 || n == 0)
		return 0;
	
		
		if(X[m-1] == Y[n-1])
			return 1+ lcsUtil(X, Y, m-1, n-1);
			
		return Math.max(lcsUtil(X,Y,m-1, n), lcsUtil(X,Y,m, n-1));
	
}
	public static void main(String[] args) {
		String s1 = "AGGTAB"; 
	    String s2 = "GXTXAYB"; 
	  
	    char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	    int m = X.length; 
	    int n = Y.length; 
	  
	    System.out.println("Length of LCS is" + " " + 
	                                  lcsUtil( X, Y, m, n ) );
	}

}
