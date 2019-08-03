
public class SumTreeCount {
	static int sumTreeCount=0;
	static int SumTreeCountUtil(Node node,int sum)
	{
		int lsum=0,rsum=0;
		if(node==null)
			return 0;
		
		lsum=SumTreeCountUtil(node.left,sum);
		//currentSum=currentSum+node.data;
		rsum=SumTreeCountUtil(node.right,sum);
		if((node.data+lsum+rsum)==sum)
			sumTreeCount++;
		//System.out.println("I am at line 17");
		return node.data+lsum+rsum;
	}
	static int SumTreeCount(Node root,int sum)
	{
		int lsum=0,rsum=0;
		lsum=SumTreeCountUtil(root.left,sum);
		rsum=SumTreeCountUtil(root.right,sum);
		//System.out.println("left sum is: "+lsum);
		//System.out.println("reight sum is: "+rsum);
		if(root.data+lsum+rsum==sum)
			sumTreeCount++;
		return sumTreeCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root= new Node(5);
		root.left=new Node(-10);
		root.left.left=new Node(9);
		root.left.right=new Node(8);
		root.right= new Node(3);
		root.right.left=new Node(-4);
		root.right.right=new Node(7);
		
		System.out.println("Sum Tree count is: "+SumTreeCount(root,7));
		
	}

}
