package String;

/*https://www.geeksforgeeks.org/remove-duplicates-from-a-given-string/
 * IO: geeksforgeeks
 * OP: efgkors
 */
public class RemoveDuplicatesInString {

	static char[] removeDups(String str)
	{
		char temp[] = str.toCharArray();
		int n = temp.length;
		boolean flag =false;
		//System.out.println(n);
		int i=1;
		int j=1;
		while(n>i && j<n)
		{
			int k=0;
			flag =true;
			while(k<j)
			{
				if(temp[k] == temp[j])
					flag=false;
				k++;					
			}	
			if(flag == true)
				temp[i++] = temp[j];
			System.out.println("I is: "+i+" J is: "+j+ " K is:"+k);
			j++;
		}
		temp[i]='\n';
		System.out.println(temp);
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks"; 
        removeDups(str); 
	}
}
