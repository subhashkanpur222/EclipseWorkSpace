
public class TreeSumPairBST {
	static Node node;
	static int getValue(Node node)
	{
		if (node ==null)
			return 0;
		if(node.left==null && node.right==null)
			return node.data;
		
		return node.data+getValue(node.left)+getValue(node.right);
	}
	static boolean isSumTree(Node node)
	{
		if (node ==null)
			return true;
		if(node.left==null && node.right==null)
			return true;
		
		int ld=getValue(node.left);
		int rd=getValue(node.right);
		
		if(node.data==ld+rd)
			return true;
		return false;
	}
	public static void main(String[] args) {
		node = new Node(26);
		node.left=new Node(10);
		node .left.left=new Node(4);
		node .left.right=new Node(6);
		node .right=new Node(3);
		node.right.left=new Node(2);
		node.right.right=new Node(1);
		System.out.println("Tree is Sum pair: "+isSumTree(node));
	}

}
