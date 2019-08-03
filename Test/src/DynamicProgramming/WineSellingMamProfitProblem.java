package DynamicProgramming;
/*
 * https://www.geeksforgeeks.org/maximum-profit-sale-wines/
 * IP: {5,.5,2,3,4}
 * sell on certail days to maximize profit. selling proce doubles on next day
 * OP: 5*1+.5*2+2*3+3*4+4*5
 */
public class WineSellingMamProfitProblem {
	public static double maxProfitCal(double arr[], int start, int end, int count)
	{
		if(end < start)
			return 0;
		
		if(count == arr.length)
			return Math.max(arr[start]*count, arr[end]*count);
		
		
		
		return Math.max(count*arr[start]+maxProfitCal(arr, start+1, end, count+1), count*arr[end]+maxProfitCal(arr, start, end-1, count++));
	}
	public static void main(String[] args) {
		double arr[] = {5,.5,2,3,4};
		System.out.println(maxProfitCal(arr, 0, arr.length-1, 1));
	}

}
