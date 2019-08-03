package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Question 4 of https://www.geeksforgeeks.org/walmart-labs-interview-experience-set-18-for-experienced/
 * [2, 4, 3, 5, 5, 2, 4] and Journey time = 20
   Output: – 5
 */
public class MaxNumberofSongsPlayedinJourney {
	
	static List<List<Integer>> MaxNumberofSongsPlayedinJourneyUtil(int song[], int jTime)
	{
		Arrays.sort(song);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> combinatinon = new ArrayList<>();
		if(jTime == 0 || song.length == 0)
			return result;
		MaxNumberofSongsPlayedinJourneyUtilCal(song, jTime,result, combinatinon, 0);
		return result;
	}
	static void MaxNumberofSongsPlayedinJourneyUtilCal(int song[], int jTime,List<List<Integer>> result, List<Integer> combinatinon, int start)
	{
		if(jTime == 0)
		{
			result.add(new ArrayList<>(combinatinon));
			return;
		}
		
		for(int i = start; i<song.length ; i++)
		{
			if(jTime < song[i])
				break;
			
			combinatinon.add(song[i]);
			MaxNumberofSongsPlayedinJourneyUtilCal(song, jTime-song[i],result, combinatinon, i+1);
			combinatinon.remove(combinatinon.size()-1);
		}
	}
	public static void main(String[] args) {
		int song[] = {2, 4, 3, 5, 5, 2, 4};
		int jTime = 20;
		int maxSize = 0;
		List<List<Integer>> result = MaxNumberofSongsPlayedinJourneyUtil(song, jTime);
		
		for(List<Integer> list: result)
		{
			if(maxSize < list.size())
				maxSize = list.size();
		}
		
		System.out.println(maxSize);
		
		System.out.println(result.size());
		for(List<Integer> list: result)
		{
			System.out.println(list);
		}
	}

}
