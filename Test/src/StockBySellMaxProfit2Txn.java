package com.luv2code.array;
/*
 * https://www.geeksforgeeks.org/maximum-profit-by-buying-and-selling-a-share-at-most-twice/
 * IP: {2, 30, 15, 10, 8, 25, 80}
 * OP: 100
 */
public class StockBySellMaxProfit2Txn {
	public static int maxProfit(int price[], int n)
	{
		int maxProfit = 0;
		int profit[] = new int[n];
		
		
		int maxValue = price[n-1];
		for(int i = n-2; i>=0; i--)
		{
			if(maxValue < price[i])
				maxValue = price[i];
			
			profit[i] = Math.max(profit[i+1], maxValue-price[i]);
		}
		
		int minValue = price[0];
		for(int i=1;i<n; i++)
		{
			if(price[i] < minValue)
				minValue = price[i];
			
			profit[i] = Math.max(price[i]-minValue+profit[i], profit[i-1]); 
		}
		
		
		return profit[n-1];
	}
	public static void main(String[] args) {
		int price[] = {2, 30, 15, 10, 8, 25, 80}; 
        int n = price.length; 
        System.out.println("Maximum Profit = "+ maxProfit(price, n));
	}

}
