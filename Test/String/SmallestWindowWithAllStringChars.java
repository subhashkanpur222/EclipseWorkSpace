package String;

/* https://www.geeksforgeeks.org/smallest-window-contains-characters-string/
 * IP: aabcbcdbca
 *OP: 4
 */

public class SmallestWindowWithAllStringChars {
	static final int MAX_CHAR_COUNT = 256;
	static int findSubString(String str)
	{
		int min_window_size = Integer.MAX_VALUE;
		int distinct_char_count = 0;
		int hash_str[] = new int[MAX_CHAR_COUNT];
		int hash_dist_str[] = new int[MAX_CHAR_COUNT];
		int str_length = str.length();
		int start = 0;
		for (int i = 0; i<str_length; i++ )
		{
			hash_str[str.charAt(i)]++;
			if (hash_str[str.charAt(i)] == 1)
			{
				hash_dist_str[str.charAt(i)] = 1;
				distinct_char_count++;;
			}
		}
		System.out.println(distinct_char_count);
		for(int j=0; j<str_length ;j++)
		{
			if(hash_str[str.charAt(j)] !=0 && (hash_dist_str[str.charAt(j)] == 1))
				distinct_char_count--;
			
			if(distinct_char_count == 0)
			{
				while(hash_str[start] > 1 || (hash_dist_str[str.charAt(start)]==0))
				{
					if(hash_str[start] > 1 )
						hash_str[str.charAt(start)]--;
					start++;					
				}
				
				
				if(min_window_size > j-start+1)
					min_window_size = j-start+1;
			}
		}
		
		
		/*for(int i = 0;i< MAX_CHAR_COUNT;i++)
		{if(hash_dist_str[i]!=0) System.out.println(hash_dist_str[i]);}*/
		return min_window_size;
	}
	public static void main(String[] args) {
		String str = "aabcbcdbca"; 
        System.out.println("Smallest window containing all distinct" + " characters is " + findSubString(str)); 
	}

}
