
public class MaxSubArraySum {
	static int maxContSubArraySum(int a[], int size)
	{
		int max_sum=0, sum_so_far=0,i=0;
		while(a[i]<0)
			i++;
		max_sum=a[i];
		for(int j=i;j<size;j++)
		{
			sum_so_far=sum_so_far+a[j];
			if (sum_so_far< 0)
			sum_so_far=0;
			if(max_sum<sum_so_far)
				max_sum=sum_so_far;
		}
		return max_sum;
	}
	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        System.out.println("Maximum continuous sum is:"+maxContSubArraySum(a, n));
	}

}
