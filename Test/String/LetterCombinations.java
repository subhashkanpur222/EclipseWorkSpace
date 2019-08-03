package String;

/*
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
 * Input: "23" here 2 and 3 are keypad in mobile and will have mapping corresponding string for that number in keypad
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
	static List<String> letterCombinations(String digits)
	{
		List<String> result = new ArrayList<>();
		if(digits.length() == 0)
			return result;
		HashMap<Character, String> hm = new HashMap<Character, String>()
        {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
		result.add("");
		char digits_char[] = digits.toCharArray();
		
		for(char c: digits_char)
		{
			result = letterCombinationsUtil(result, hm.get(c).toCharArray());
		}
		
		return result;
	}
	static List<String> letterCombinationsUtil(List<String> list, char array[])
	{
		List<String> temp = new ArrayList<>();
		for(String str:list)
		{
			for(char c: array)
			{
				temp.add(str+c);
			}
		}
		
		return temp;
	}
	public static void main(String[] args) {
		String digits = "23";
		List<String> result = letterCombinations(digits);
		for(String str: result)
		{
			System.out.println(str);
		}
	}

}
