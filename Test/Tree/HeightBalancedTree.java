package Tree;
// https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
/*
 *       1
        /  \
       2    3
     /  \     \
    4    5     8 
              /  \
             6    7
 */
public class HeightBalancedTree {
	static Node root;
	static boolean HeightBalancedTreeCheck(Node root)
	{
		if (root == null)
			return true;
		int lHeight, rHeight;
		lHeight = height(root.left);
		rHeight = height(root.right);
		if(Math.abs(lHeight -rHeight) <= 1 && HeightBalancedTreeCheck(root.left) && HeightBalancedTreeCheck(root.right))
			return true;
		else
			return false;
		
	}
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		return 1 + Math.max(height(root.left), height(root.left));
	}
	public static void main(String[] args) {
		root = new Node(1);	
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(8);
		root.right.right.left = new Node(6);
		/*root.right.right.right = new Node(7);*/
		if(HeightBalancedTreeCheck(root))
			System.out.println("Tree is height balanced");
		else
			System.out.println("Tree is not height bzlznced");
	}

}
