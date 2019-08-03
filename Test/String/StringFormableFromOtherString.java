package String;
// https://www.geeksforgeeks.org/check-whether-second-string-can-formed-first-string-using-count-array/
public class StringFormableFromOtherString {
	final static int MAX_CHAR_LEN = 256;
	static boolean canMakeStr2(String str1, String str2)
	{
		int str1_len = str1.length();
		int str2_len = str2.length();
		int hash_str1[] = new int[MAX_CHAR_LEN];
		for(int i = 0; i<str1_len; i++)
		{
			hash_str1[str1.charAt(i)]++;
		}
		for(int i = 0; i<str2_len; i++)
		{
			if(hash_str1[str2.charAt(i)] > 0)
				hash_str1[str2.charAt(i)]--;
			else
				return false;
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		String str1 = "geekforgeeks"; 
        String str2 = "for"; 
        if (canMakeStr2(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");
	}

}
