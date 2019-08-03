package Tree;

/*
  https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
 IP:     26
        /   \
      10     3
    /    \     \
  4      6      3
  OP: TRUE
 */
public class TreeifSumTree {
	static Node root = null;
	static boolean isSumTree(Node root)
	{
		if(root == null || (root.left == null && root.right == null))
			return true;
		
		int lsum = treeSum(root.left);
		int rsum = treeSum(root.right);		
				
		if(root.data == lsum+rsum && isSumTree(root.left) && isSumTree(root.right))
			return true;
		else
			return false;
	}
	
	static int treeSum(Node root)
	{
		if(root == null)
			return 0;
		return root.data+treeSum(root.left)+treeSum(root.right);
	}
	public static void main(String[] args) {
		root = new Node(26);
		root.left = new Node(10);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		root.right.right = new Node(3);
		if(isSumTree(root))
			System.out.println("This is a sum Tree");
		else
			System.out.println("Not a sum tree");
	}

}
