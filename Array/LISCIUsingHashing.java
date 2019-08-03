package Array;
/*https://www.geeksforgeeks.org/largest-increasing-subsequence-of-consecutive-integers/
Input : arr[] = {5, 7, 6, 7, 8} 
Output : Size of LIS = 4
         LIS = 5, 6, 7, 8*/

public class LISCIUsingHashing {
	static void LISCIUsingHashingUtil(int arr[], int n)
	{
		String S = "a#c";
		String T = "b";
		int n1, n2,count1=0,count2=0,i=0,j=0,k=0;
	    n1 = S.length();
	    n2 = T.length();
	    char S1[] = S.toCharArray();
	    char T1[] = T.toCharArray();
		  while(i<n1)
		    {
		    	if(S1[i]=='#')
	            {
	                i++;
	                count1--;
	                if(count1 < 0)
	                    count1 = 0;
	            }
		    	else
		    	{
	                
		    		S1[count1++] = S1[i];
		    		i++;
		    	}
		    }
		  while(j<n2)
		    {
		    	if(T1[j]=='#')
	            {
	                j++;
	                count2--; 
	                if(count2 < 0)
	                    count2 = 0;
	            }   
		    	else
		    	{
		    		T1[count2++] = T1[j];
		    		j++;
		    	}
		    }
		  System.out.println("count1: "+count1);
			System.out.println("count2: "+count2);
		  if(count1 != count2)
		    	{System.out.println("Strings are not same");return;}
		    
		    for(k = 0 ; k<count1; k++)
		    {
		    	if(k < count2 && k<count1 && S1[k] == T1[k])
		    		continue;
		    	else
		    	{
		    		break;
		    	}	    	
		    }
	        if(k == count1)
	        	System.out.println("Strings are same");
	        else
	        	System.out.println("Strings are not same");
		/*System.out.println("count1: "+count1);
		System.out.println("count2: "+count2);
		for(k =0;k<count1;k++)
			System.out.println(" S1[%k]"+S1[k]+" T1[%k]"+T1[k]);*/
		
	}
	public static void main(String[] args) {
		int arr[] = {2, 5, 3, 7, 4, 8, 5, 13, 6};
		int n = arr.length;
		LISCIUsingHashingUtil(arr,n);
	}

}
