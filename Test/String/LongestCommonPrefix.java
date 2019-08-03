package String;

public class LongestCommonPrefix {
	public static String LongestCommonPrefixUtil(String str[])
	{
		if(str.length == 0)
			return "";
		String prefix = str[0];
		for(int i =1; i< str.length; i++)
		while(str[i].indexOf(prefix) != 0)
		{
			prefix = prefix.substring(0, prefix.length() - 1);
			// System.out.println(prefix + " :"+i);
	            if (prefix.isEmpty()) 
	            	return "";
		}
		return prefix;
	}
	public static void main(String[] args) {
		// ["dog","racecar","car"]
		String str[] = {"flower","flow","flight"};
		//System.out.println(str.length); //3
		//System.out.println(str[0]); //flower
		System.out.println(LongestCommonPrefixUtil(str));
		System.out.println("geeks".indexOf("geeks"));
	}

}
