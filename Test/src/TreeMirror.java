
/*
 * Program to convert a tree to mirror tree i a new tree.
 *           1                    1
 *         /  \                 /   \
 *        2    5     =>        5     2
 *      /  \   /\             / \   / \
 *     3    4 6  7           7   6 4   3
 */

public class TreeMirror {
	public static void treeMirrotConvertUtil(Node root, Node root1)
	{
		if(root.left == null && root.right == null)
			return;
		root1.left =new Node(0);
		root1.right =new Node(0);
		root1.right.data=root.left.data;
		root1.left.data=root.right.data;
		//System.out.println(root.left.data);
		//System.out.println(root.right.data);
		//System.out.println("calling root.right");
		treeMirrotConvertUtil(root.right,root1.left);
		//System.out.println("calling root.left");
		treeMirrotConvertUtil(root.left,root1.right);
	}
	public static void treeMirrotConvert(Node root)
	{
		Node root1 =new Node(1);
		treeMirrotConvertUtil(root, root1);

		System.out.println(root1.data);
		System.out.println(root1.left.data);
		System.out.println(root1.right.data);
		System.out.println(root1.left.left.data);
		System.out.println(root1.left.right.data);
		System.out.println(root1.right.left.data);
		System.out.println(root1.right.right.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left =new Node(2);
		root.left.left =new Node(3);
		root.left.right =new Node(4);
		root.right =new Node(5);
		root.right.left =new Node(6);
		root.right.right =new Node(7);
		
		System.out.println("Mirror image is: ");
		treeMirrotConvert(root);
		/*System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		System.out.println(root.left.left.data);
		System.out.println(root.left.right.data);
		System.out.println(root.right.left.data);
		System.out.println(root.right.right.data);*/
	}

}
