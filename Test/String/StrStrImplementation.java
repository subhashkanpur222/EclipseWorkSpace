package String;
/*
 * https://www.techiedelight.com/implement-strstr-function-java/
 * String str = "Techie Delight";
   String ptr = "light";
   OP: 9
 */
public class StrStrImplementation {
	static int strstr(String str, String ptr)
	{
		int index = -1;
		if(str.length() < ptr.length() || str == null)
			return -1;
		
		if(ptr.length() == 0 || ptr == null)
			return 0;
		
		for(int i=0; i<= str.length()-ptr.length(); i++)
		{
			int j;
			for(j=0; j < ptr.length() ; j++)
			{
				if(str.charAt(i+j) != ptr.charAt(j))
					break;
			}
			if(j == ptr.length())
				return i;
		}
		return index;
	}
	public static void main(String[] args) {
		String str = "Techie Delight";
		String ptr = "light";
		System.out.println("Index of first occurrence of ptr in str is "+  strstr(str, ptr));
	}
}
