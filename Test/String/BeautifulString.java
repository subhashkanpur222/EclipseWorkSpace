package String;
/*
 * Beautiful String is made of only vovel and they are arranged in such a way that characters are ordered lexicographicly.
 * char vovoel[] = {'a', 'e','i','o','u'} and n=2 then there will be 15 beautiful strings like
 * aa, ae, ai, ao, au, ee, ei, eo, eu....
 */
public class BeautifulString {
public static char[] vovel= {'a', 'e', 'i','o', 'u'}; 
static int n = 2, count=0;
static boolean isSafe( char a, char b)
{
	if(a <= b)
		return true;
	else
		return false;
}

public static void buildString(String str)
{
	if(str.length() == n)
	{
		System.out.println(str);
		count++; return;
	}
	
	for(int i = 0; i < vovel.length ; i++)
	{
		if(isSafe(str.charAt(str.length()-1), vovel[i]))
		{
			String newstr = str+vovel[i];
			buildString(newstr);
		}
	}
	
}

	public static void main(String[] args) {
	
		for(int i=0; i < vovel.length; i++)
		{
			String str = "";
			str =  str + vovel[i];
			buildString(str);
		}
		System.out.println(count);
	}

}
