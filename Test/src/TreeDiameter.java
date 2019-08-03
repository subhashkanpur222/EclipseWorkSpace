
public class TreeDiameter {
	static int ans=0;
	static int maxvalue(int a,int b)
	{
		return ((a>b)?a:b);
	}
	static int treeDiameter(Node node)
	{
		if(node == null)
			return 0;
		int left=treeDiameter(node.left);
		int right=treeDiameter(node.right);
		int hight=maxvalue(left,right)+1;
		ans=maxvalue(node,height);
		return ans;
		
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		root.right=new Node(4);
		treeDiameter(root);
		System.out.println("Root to leaf max path is: "+ans);
	}

}
