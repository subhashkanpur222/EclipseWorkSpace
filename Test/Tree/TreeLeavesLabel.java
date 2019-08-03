package Tree;

public class TreeLeavesLabel {
	static Node node;
	static boolean isLeavesAtSameLabel(Node node, int height)
	{
		if(node.left==null && node.right==null && height==0)
			return true;
		if(node.left !=null)
			return isLeavesAtSameLabel(node.left,height-1);
		if(node.right!=null)
			return isLeavesAtSameLabel(node.right,height-1);
		return false;
	}
	static int treeHeight(Node node)
	{
		int lheight=0,rheight=0;
		if(node == null)
			return 0;
		lheight = treeHeight(node.left);
		rheight = treeHeight(node.right);
		return 1+Math.max(lheight, rheight);
	}
	public static void main(String[] args) {
		int height=0;
		node = new Node(26);
		node.left=new Node(10);
		node.left.left=new Node(4);
		node.left.right=new Node(6);
		node.right=new Node(3);
		node.right.left=new Node(2);
		node.right.right=new Node(1);
		height=treeHeight(node);
		System.out.println("Tree height is: "+height);
		System.out.println("Leaf at same lavel is: "+isLeavesAtSameLabel(node,height-1));
	}

}
