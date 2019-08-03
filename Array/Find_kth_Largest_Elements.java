package Array;
import java.util.Arrays; 
import java.util.Collections;

public class Find_kth_Largest_Elements {
    static void kLargest(Integer  arr[], int k)
    {
    	int temp[] = new int[k];
    	for(int i=0;i<k;i++)
    		temp[i] = arr[i];
    	//for(int i =0; i<k ; i++)
    	
    	Arrays.sort(temp);
    	
    	
    	for(int i= k; i< arr.length;i++)
    	{
        	if(temp[0] < arr[i])
        	{
        		temp[0] = arr[i];
        		arr[i] = temp[0];
        		Arrays.sort(temp);
        	}
    		
    	}
    	
    	for(int i =0; i<k ; i++)
		System.out.println(temp[i]);
    	
    	
    }
	public static void main(String[] args) {
		Integer  arr[] = new Integer []{1, 23, 12, 9, 30, 2, 50}; 
        int k = 3; 
        kLargest(arr,k); 
	}
}
