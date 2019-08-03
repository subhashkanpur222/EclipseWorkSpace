package Tree;

/*
 * https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
 * Diameter of tree is maximum nodes on path of leaf node of a tree.
 *        1
 *       / \
 *      2   3
 *     / \ 
 *    4   5
 *    
 *    OP: 4
 */
public class TreeDiameter {
	static Node root;
	static int d =0 ;
	static void treeDiameter(Node lroot)
	{
		
		int lh = height(lroot.left);
		int rh = height(lroot.right);
	    if(lroot.left !=null)
		treeDiameter(lroot.left);
		if(lroot.right !=null)
		treeDiameter(lroot.right);
		if(d< lh+rh+1)
			d= lh+rh+1;
	}
	public static int height(Node lroot)
	{
		if(lroot == null)
			return 0;
		return 1 + Math.max(height(lroot.left), height(lroot.right));
		
	}

	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3); 
		root.left.left = new Node(4); 
		root.left.right = new Node(5); 
		treeDiameter(root);
		System.out.println("The diameter of given binary tree is : "+ d);
		
	}

}
