
public class RootLeafMaxPath {
	static int rtlmf(Node node)
	{
		if(node==null)
			return 0;
		int left=rtlmf(node.left);
		int right=rtlmf(node.right);
		return ((left>right)?node.data+left:node.data+right);
		//if (left>right)
			//return node.data+left;
		//else
			//return node.data+right;
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(-2);
		root.left.left=new Node(18);
		root.left.right=new Node(-4);
		root.left.right.right=new Node(20);
		root.right=new Node(7);
		System.out.println("Root to leaf max path is: "+rtlmf(root));
	}

}
