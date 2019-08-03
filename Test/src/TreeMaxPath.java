
public class TreeMaxPath {
	static int ans;
	static int maxvalue(int a,int b)
	{
		return ((a>b)?a:b);
	}
	static int mtp(Node node)
	{	
		int tempmax,left_data,right_data;
		if(node ==null)
		return 0;
		left_data=mtp(node.left);
		right_data=mtp(node.right);
		tempmax=maxvalue(node.data,maxvalue(node.data+left_data,node.data+right_data));
		ans=maxvalue(tempmax,node.data+left_data+right_data);
		System.out.println(ans);
		return tempmax;
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(-2);
		root.left.left=new Node(18);
		root.left.right=new Node(-4);
		root.left.right.right=new Node(20);
		root.right=new Node(7);
		mtp(root);
		System.out.println("Root to leaf max path is: "+ans);

	}

}
