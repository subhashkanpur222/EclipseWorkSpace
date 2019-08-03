package Array;
//   https://www.geeksforgeeks.org/merging-intervals/


public class OverlappingIntervals {
	static class Pair{
		int first,second;
		public void setData(int first, int second) {
			this.first=first;
			this.second=second;
		}
		public void getData()
		{
			System.out.println(this.first+", "+this.second);
		}		
	}
	public static void OverlappingIntervalsUtil(Pair p1[],int arr[])
	{
			/*for(int j=0;j<(arr.length/2);j++){
			  p1[j].getData();
			}*/
	/*	for(int j=0;j<(arr.length/2);j++){
			for(int i=j+1;i<(arr.length/2);i++) {
				if(p1[j].second !=-1 && p1[j].first != -1 && (Math.abs(p1[i].first-p1[j].second) == 1))
				{
					p1[j].second=p1[i].second;
					p1[i].second=-1;
					p1[i].first=-1;
				}
			}
		}*/
		
			for(int i=0;i<(arr.length/2-1);i++) {
				if(p1[i].second !=-1 && p1[i+1].first != -1 && (Math.abs(p1[i+1].first-p1[i].second) == 1))
				{
					p1[i].second=p1[i+1].second;
					p1[i+1].second=-1;
					p1[i+1].first=-1;
					System.out.println(i);
				}
			}
		
		
		for(int j=0;j<(arr.length/2);j++){
			  p1[j].getData();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,6,8,9,10};
		//output1 4 6 8 9 10
		//arr[] ={6 8 1 9 2 4 4 7}
		//output 1 9
		Pair p1[] = new Pair[4];
		p1[0] = new Pair();
		p1[1] = new Pair();
		p1[2] = new Pair();
		p1[3] = new Pair();
		
		for(int j=0,i=0;j<(arr.length/2) && i < arr.length;i=i+2,j++)
		{
			p1[j].setData(arr[i], arr[i+1]);
		}
		
		/*for(int j=0;j<(arr.length/2);j++)
		{
		  p1[j].getData();
		}*/
		for(int j=0;j<(arr.length/2);j++){
			  p1[j].getData();
			}
		OverlappingIntervalsUtil(p1,arr);
	}

}
