package String;

/*
  https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
  Input: string = “this is a test string”, pattern = “tist”
  Output: Minimum window is “t stri”
 */

public class MinLengthStringContaningPattern1 {
	static int max_char_length = 256;
	
	static int findSubString(String str, String pat)
	{
		int hash_pattern[] = new int[max_char_length];
		int hash_string[] = new int[max_char_length];
		int len_pat = pat.length();
		int len_str = str.length();
		int count = 0;
		int start = 0, string_max_length=0,start_index  = 0 ;
		
		for (int i=0; i <len_pat ; i++ )
		{
			hash_pattern[pat.charAt(i)]++;
		}
		
		for(int j=0 ; j<len_str ; j++)
		{
			
			hash_string[str.charAt(j)]++;
			if( (hash_pattern[str.charAt(j)]!=0) && (hash_string[str.charAt(j)] <= hash_pattern[str.charAt(j)]) ) 
				count++;
			
			if(count == len_pat)
			{
				while((hash_string[str.charAt(start)] > hash_pattern[str.charAt(start)]) || hash_pattern[str.charAt(start)] == 0)
				{
					if((hash_string[str.charAt(start)] > hash_pattern[str.charAt(start)]))
						hash_string[str.charAt(start)]--;
					start++;
				}
				
				
				if(string_max_length > j-start+1)
				{
					string_max_length = j-start+1;
					start_index = start;
				}				
			}
		}
		
		//for (int i=0;i<=end;i++)
			//System.out.println(str.charAt(i));
		return string_max_length;
	}
	public static void main(String[] args) {
		 String str = "this is a test string"; 
	        String pat = "tist"; 
	        System.out.print("Smallest window is :\n " +  findSubString(str, pat)); 
	}

}
