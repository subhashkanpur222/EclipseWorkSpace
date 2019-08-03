package com.luv2code.array;

public class StockBuySellProblem {
	static void stockBuySellUtil(int price[])
	{
		int buy[] = new int[price.length-1];
		int sell[] = new int[price.length-1];
		
		int maxDiff = 0, buySellCount=0, startIndex=0;
		int i = 1;
		maxDiff = price[i] - price[i-1];
		while(true)
		{
			maxDiff =0;
			startIndex = i-1;
			while(i< price.length && (0 <= (price[i] - price[i-1])))
			{
				i++;
			}
			buy[buySellCount] = startIndex;
					
			sell[buySellCount++] = i-1;
			//System.out.println(" and buySellCount is incremented");
			i++;
			if(i >= price.length) 
				break;
		}
		//System.out.println(buySellCount);
		for(int k=0 ; k<buySellCount; k++)
		{
			System.out.println("Buy at: "+buy[k]+" and sell at: "+sell[k]);
		}
	}
	public static void main(String[] args) {
		 int price[] = {100, 180, 260, 310, 40, 535, 695}; 
		 stockBuySellUtil(price);
	}

}
