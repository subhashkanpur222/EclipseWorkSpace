public class MaxMinCount {
	int max,min;
	public MaxMinCount(int max,int min)
	{
		this.max=max;
		this.min=min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrInt = { { 11, 2, 3 }, { 3, 4, 5 },{6,7,8} };
		MaxMinCount obj[][] =new MaxMinCount[3][3];
		int i,j,c=0,d=0,x=0,y=0;
		int max1=0,min1=1000;
		for(int a=0;a<3;a++)
			for(int b=0;b<3;b++)
			{
				obj[a][b]=new MaxMinCount(-1,-1);
			}
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{  
        		if(arrInt[i][j]>max1)
        		{
        			max1=arrInt[i][j];
        			c=i;d=j;
        		}
        		if(arrInt[i][j]<min1)
        		{
        			min1=arrInt[i][j];
        			x=i;y=j;
        		}
        	}
        	obj[c][d].max=1;
        	obj[x][y].min=0;
        	max1=0;min1=1000;
        }
        //for(i=0;i<3;i++)
        //for(j=0;j<3;j++)
        //System.out.println(obj[i][j].min);
        		//{System.out.println(arrInt[i][j]);}
        int maxvalue=0,minvalue=0;
        for(i=0;i<3;i++)
    	 for(j=0;j<3;j++)
    	 {
    		if(obj[i][j].max==1)
    		 maxvalue=maxvalue+arrInt[i][j];
    		if(obj[i][j].min==0)
    		 minvalue=minvalue+arrInt[i][j];
    	 }
        System.out.println("final sum is :"+maxvalue+minvalue);
	}

}
