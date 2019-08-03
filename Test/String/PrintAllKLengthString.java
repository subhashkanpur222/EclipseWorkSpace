package String;

public class PrintAllKLengthString {
	static void printAllKLength(char[] set1, int k)
	{
		int n = set1.length;
		PrintAllKLengthStringUtil(set1, k , n, "");
	}
	static void PrintAllKLengthStringUtil(char[] set1, int k, int n, String s)
	{
		if(k == 0)
		{
			System.out.println(s);
			return;
		}
		
		for(int i = 0 ; i<n ; i++)
			{
				String  newString = s+set1[i];
				//System.out.println(newString);
				PrintAllKLengthStringUtil(set1, k-1 , n, newString);
			}
	}
	public static void main(String[] args) {
		 System.out.println("First Test"); 
		    char[] set1 = {'a', 'b'}; 
		    int k = 3; 
		    printAllKLength(set1, k); 
		    /*  
		    System.out.println("\nSecond Test"); 
		    char[] set2 = {'a', 'b', 'c', 'd'}; 
		    k = 1; 
		    printAllKLength(set2, k);  */
	}

}
