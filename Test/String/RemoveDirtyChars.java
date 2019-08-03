package String;

/* https://www.geeksforgeeks.org/remove-characters-from-the-first-string-which-are-present-in-the-second-string/
 * IP: geeksforgeeks
 * MASK: mask
 * OP: geeforgee
 */

public class RemoveDirtyChars {
	static final int MAX_CHAR_LEN = 256;
	static String removeDirtyChar(String str, String mask_str)
	{
		int str_length = str.length();
		int result_index=0,end_index=0;
		char arr[] = str.toCharArray();
		
				
		int hash_mask_str[] = new int[MAX_CHAR_LEN];
		for(int i = 0; i<mask_str.length() ; i++)
			hash_mask_str[mask_str.charAt(i)]++;
		
		while(end_index < str_length)
		{
			if(hash_mask_str[str.charAt(end_index)] > 0 )
			{
				end_index++;
			}
			else
			{
				arr[result_index] = arr [end_index++];
				result_index++;
				
			}
		}
		for(int i = result_index; i<str_length ; i++)
		arr[i] = '\0';
		str = new String(arr);
		return str;
	}
	public static void main(String[] args) {
		 String str = "geeksforgeeks"; 
	     String mask_str = "mask"; 
	     System.out.println(removeDirtyChar(str, mask_str)); 
	}

}
