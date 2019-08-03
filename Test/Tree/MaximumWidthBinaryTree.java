package Tree;

import java.util.*;

//  https://www.geeksforgeeks.org/maximum-width-of-a-binary-tree/

/*
 *       1
        /  \
       2    3
     /  \     \
    4    5     8 
              /  \
             6    7
 */
public class MaximumWidthBinaryTree {
	static Node root =null;
	static int MaximumWidthBinaryTreeUtil()
	{
		int maxWidth = 0;
		Queue<Node> q = new LinkedList();	
	    q.add(root);
	    while(true)
	    {
	    	int size = q.size();
	    	if(size > maxWidth)
	    		maxWidth = size;
	    	if(size <= 0)
	    		break;
	    	while(size > 0)
	    	{
	    		Node temp =  q.peek();
	    		q.remove();
	    		if(temp.left != null)
	    			q.add(temp.left);
	    		if(temp.right != null)
	    			q.add(temp.right);
	    		size--;
	    	}
	    }
	    return maxWidth;
	}
	public static void main(String[] args) {
	root = new Node(1);	
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.right.right = new Node(8);
	root.right.right.left = new Node(6);
	root.right.right.right = new Node(7);
	System.out.println("Max width of binary tree is:" +MaximumWidthBinaryTreeUtil());
	}
}
