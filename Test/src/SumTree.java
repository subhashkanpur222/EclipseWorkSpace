
public class SumTree {
	static int sumValue=52;
	static int TreeNodeSum(Node root)
	{
		//int sum=0;
		if(root.left==null &&root.right==null)
			return root.data;
		return root.data+TreeNodeSum(root.left)+TreeNodeSum(root.right);
		
		
	}
	static boolean IsSumTree(Node root,int sum)
	{
		int sumnow=0;
		sumnow=TreeNodeSum(root);
		System.out.println("sumnow is:"+sumnow);
		if(sumnow==sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root= new Node(26);
		root.left=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(6);
		root.right= new Node(3);
		root.right.left=new Node(1);
		root.right.right=new Node(2);
		if(IsSumTree(root,root.data))
		{
			System.out.println("Tree is a sum tree");
		}
		else
			System.out.println("Tree is not sum tree");
	}

}
