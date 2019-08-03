package String;

public class ReverseWordsInaGivenString {
	static void ReverseWordsInaGivenStringUtil(char arr[])
	{
		int n = arr.length;
		int start = 0, end= n-1;
		for (int i = n-1; i>=0 ; i--)
		{
			end = i;
			while(i>=0 && arr[i] != ' ' )
			{
				i--;
			}
			start = i+1;
			System.out.print(" ");
			for (int j = start; j<=end ; j++)
				System.out.print(arr[j]);
		}
	}
	public static void main(String[] args) {
		String str =  "i like this program very much";
		//output "much very program this like i"
		char arr[] = str.toCharArray();
		//System.out.println(arr);
		ReverseWordsInaGivenStringUtil(arr);
	}

}
