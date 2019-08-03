package String;

/*
  https://www.geeksforgeeks.org/minimum-characters-added-front-make-string-palindrome/
  IP: ABC 
  OP: 2  => CBABC
  IP: AACECAAAA
  OP: 2  => AAAACECAAAA
 */
public class MinCharToMakeStringPalindrome {
	static boolean isPalindrome(String str)
	{
		int j = str.length()-1;
		int i = 0;
		for(;i<=j;i++,j--)
		{
			if(str.charAt(i) !=str.charAt(j))
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		String str = "AACECAAAA";
	
		int count = 0;
		
		 while (str.length() > 0) {
			 if(isPalindrome(str))
			 {
				 break;
			 }
			 else
			 {
				 count++;
				 str = str.substring(0, str.length()-1);
			 }
		 }		
		System.out.println("Minimum number of characters required to make string palindrome is: "+count);
	}

}
