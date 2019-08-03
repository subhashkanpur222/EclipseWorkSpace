package String;

public class LongestPalandromicSequenceEvenOdd {
	static int longestPalSubstr(String str)
	{
		int maxLength = 1;
		int n = str.length();
		for(int i =1 ; i<n; i++)
		{
			int fwd=0, bckwd=0;
			//for odd length palindrome string
			fwd = i+1;
			bckwd = i-1;
			while(fwd<n && bckwd>=0 && (str.charAt(bckwd) == str.charAt(fwd)))
			{
				if(maxLength < (fwd-bckwd+1))
					maxLength = fwd-bckwd+1;
				
				fwd++;
				bckwd--;
			}
			
			//for even length palindrome string
			fwd = i;
			bckwd = i-1;
			while(fwd<n && bckwd>=0 && (str.charAt(bckwd) == str.charAt(fwd)))
			{				
				if(maxLength < (fwd-bckwd+1))
					maxLength = fwd-bckwd+1;
				
				fwd++;
				bckwd--;
			}
		}
		return maxLength;
	}
	public static void main(String[] args) {
		String str = "dabac"; 
        System.out.println("Length is: " +  longestPalSubstr(str)); 
	}
}
