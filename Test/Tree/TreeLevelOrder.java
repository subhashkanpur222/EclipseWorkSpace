package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder {
	public static void TreeLevelOrderUtil(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			root = q.poll();
			System.out.println(root.data);
			if(root.left !=null)
				q.add(root.left);
			if(root.right != null)
				q.add(root.right);
		}
	}
	public static void main(String[] args) {
			Node root=new Node(1);
			root.left=new Node(2);
			root.left.left=new Node(3);
			root.left.right=new Node(5);
			root.right=new Node(4);
			root.right.left=new Node(8);
			root.right.right=new Node(18);
	        System.out.println("level order tree traversal is: ");
	        
	        /*
	         *          1
	         *        /   \
	         *      2      4
	         *     / \    / \
	         *   3     5 8   18
	         */
	        TreeLevelOrderUtil(root);
	}

}
