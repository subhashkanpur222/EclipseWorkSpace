package Collections;

import java.util.*;

public class ElectionWinner {
	private static void findWinner(String[] votes) {
		// Insert all votes in a hashmap 
        Map<String,Integer> map = new HashMap<String, Integer>(); 
        for (String str : votes) 
        {
        	if (map.keySet().contains(str)) 
                map.put(str, map.get(str) + 1); 
            else
                map.put(str, 1); 
        }
        int maxValueInMap = 0; 
        String winner = ""; 
        
        for (Map.Entry<String,Integer> entry : map.entrySet()) 
        { 
            String key  =  entry.getKey(); 
            Integer val = entry.getValue(); 
            if (val > maxValueInMap) 
            { 
                maxValueInMap = val; 
                winner = key; 
            } 
  
            // If there is a tie, pick lexicographically 
            // smaller.  
            else if (val == maxValueInMap && 
                winner.compareTo(key) > 0) 
                winner = key; 
        } 
        System.out.println(winner); 
	}
	public static void main(String[] args) {
		String votes[] = { "john", "johnny", "jackie", "johnny",
                "johnny", "john", "jackie", 
                "jamie", "jamie", "john", 
                "johnny", "jamie",  
                "john" }; 

		 
		findWinner(votes); 
	}
}
