package Array;

public class LongestBitonicSeq {
	
	static int lbsUtility(int arr[], int length)
	{
		int lbs=0;
		int temp[]=new int[length];
		for(int i=0;i<length;i++)
			temp[i]=1;
		
		for(int i=1;i<length;i++)
			for(int j=0;j<i;j++)
			{
				if (arr[j]<arr[i] && (temp[i]<temp[j]+1))
					temp[i]=temp[j]+1;
			}
		
		for(int i=0;i<length;i++)
		{
			if (lbs<temp[i])
			lbs=temp[i];
		}
		return lbs;
	}
	public static void main(String[] args) {
		int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15}; 
    int n = arr.length; 
    System.out.println("Length of LBS is "+ lbsUtility( arr, n ));

	}

}
