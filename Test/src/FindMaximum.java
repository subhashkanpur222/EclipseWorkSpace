
public class FindMaximum {
    int maxIndexDiff(int arr[], int n)
    {
    	int maxDiff=-1;
        int i, j;
 
        int RMax[] = new int[n];
        int LMin[] = new int[n];
        
        LMin[0]=arr[0];
        for(i=1;i<n;i++)
        	LMin[i]=Math.max(arr[i],LMin[i-1]);
 
        RMax[n-1]=arr[n-1];
        for(j=n-2;j>=0;j--)
        	RMax[j]=Math.max(arr[j],RMax[j+1]);
        i=0;j=0;	
        while(i<n&&j<n)
        {
        	if(RMax[j]-LMin[i]>0)
        		{maxDiff=Math.max(j-i,maxDiff);j++;}
        	else
        		i++;
        }
    	return maxDiff;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaximum max = new FindMaximum();
        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int n = arr.length;
        int maxDiff = max.maxIndexDiff(arr, n);
        System.out.println(maxDiff);
	}

}
