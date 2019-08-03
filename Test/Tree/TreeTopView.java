package Tree;

import java.util.HashMap;

public class TreeTopView {
	static Node root;
	static HashMap<Integer, Integer > hm = new HashMap();
	static void calHorizontalDistanceFromRoot(Node root)
	{
		if(root == null)
			return;
		if(root.left != null)
		root.left.hd = root.hd-1;
		if(root.right !=null)
		root.right.hd = root.hd + 1;
		calHorizontalDistanceFromRoot(root.left);
		calHorizontalDistanceFromRoot(root.right);
	}
	static void updateHashMap(Node root)
	{
		if(root == null)
			return;
		if(!hm.containsKey(root.hd))
			hm.put(root.hd, root.data);
		updateHashMap(root.left);
		updateHashMap(root.right);
		//printInorder(root.left);
		//System.out.println(root.hd);
		//printInorder(root.right);
	}
	static void printTreeTopView()
	{
		root.hd = 0;
		calHorizontalDistanceFromRoot(root);
		updateHashMap(root);
		//Insert node hd values in HashMap
		
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		printTreeTopView();
		System.out.println(hm.values());
	}

}
