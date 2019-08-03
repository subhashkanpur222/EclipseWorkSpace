/*
 * https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/
 * IP: ABBBBBDDCACCACD
 * OP: 8
 */
public class LongestPalndrmSeq {
	static int max (int x, int y) { return (x > y)? x : y; }
	static int lps(String seq, int i, int j)
	{   
		int start=i,end=j;
		if(start>end)
			return 0;
		if (start==end)
			return 1;
		if(seq.length()==2 && seq.charAt(start)==seq.charAt(end))
			return 2;
		if(seq.charAt(start)==seq.charAt(end))
		    return 2+lps(seq,start+1,end-1);
		return max(lps(seq,start+1,end),lps(seq,start,end-1));
	}
	public static void main(String[] args) {
			String seq = "ABBBBBDDCACCACD";
	        int n = seq.length();
	        System.out.println("The lnegth of the lps is "+ lps(seq,0,n-1));
	}
}
