package Array;

public class MaxTheifValue {
	static int calMaxVal(int coins[])
	{
		int maxValue=0;
		coins[2] =coins[2]+coins[0];
		for (int i=3; i<coins.length;i++)
		{
			coins[i] += Math.max(coins[i-2],coins[i-3]);
		}
		
		return coins[coins.length-1];
	}
	public static void main(String[] args) {
		int coins[] = {1,3,6,2,12,18};
		System.out.println(calMaxVal(coins));
	}

}
