package Array;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/
public class FindCommonElementsinThreeSortedArrays {
	public void findCommon(int arr1[], int arr2[], int arr3[])
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		//Iterate through all the arrays
		for (int i= 0; i < arr1.length ; i++)
		{
			if(!hm.containsKey(arr1[i]))
				hm.put(arr1[i], 1);
			else
			{
				int count = hm.get(arr1[i]);
				hm.put(arr1[i], count+1);
			}			
		}
		for (int i= 0; i < arr2.length ; i++)
		{
			if(!hm.containsKey(arr2[i]))
				hm.put(arr2[i], 1);
			else
			{
				int count = hm.get(arr2[i]);
				hm.put(arr2[i], count+1);
			}			
		}
		for (int i= 0; i < arr3.length ; i++)
		{
			if(!hm.containsKey(arr3[i]))
				hm.put(arr3[i], 1);
			else
			{
				int count = hm.get(arr3[i]);
				hm.put(arr3[i], count+1);
			}			
		}
		
		//Iterate through hashmap and find the element with %3 > 0
		for(Map.Entry<Integer, Integer> entry : hm.entrySet())
		{
			int key = entry.getKey();
			int value = entry.getValue();
			//System.out.println("key is: "+key+ " value is: "+value);
			if(value%3 == 0 ) 
			{
				System.out.print(key+"\t");
			}
			/*if (value/3 == 2)
			{
				System.out.print("\t"+key+" "+key+"\t");
			}	*/
		}
		
	}
	public static void main(String[] args) {
		FindCommonElementsinThreeSortedArrays ob = new FindCommonElementsinThreeSortedArrays(); 
		  
        int ar1[] = {1, 5, 10, 20, 40, 80}; 
        int ar2[] = {6, 7, 20, 80, 100}; 
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
  
        System.out.print("Common elements are "); 
        ob.findCommon(ar1, ar2, ar3); 
	}

}
