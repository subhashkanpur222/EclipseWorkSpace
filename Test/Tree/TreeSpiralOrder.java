package Tree;
/*
 * Program to convert a tree to mirror tree i a new tree.
 *           1                    
 *         /  \                 
 *        2    5     =>  1, 2, 5, 7, 3  
 *      /  \   /\             
 *     3    4 6  7           
 */


import java.util.LinkedList;


public class TreeSpiralOrder {
	static Node root;
	static boolean rootNode = true;
	static boolean spiralOrderLeft = true;
	static void TreeSpiralOrderUtil()
	{
		LinkedList<Node> q =  new LinkedList<Node>();
		q.add(root);
		while(true)
		{
			int count = q.size();
			if(count <= 0 )
				break;
			while(count > 0)
			{
				Node temp = q.peek();

				//print root node only once
				if(rootNode == true)
				{
					System.out.print(temp.data);
					rootNode = false;
				}
				
				q.removeFirst();
				if(temp.left!= null)
					q.addLast(temp.left);
				if(temp.right!= null)
					q.addLast(temp.right);
				
				count--;
			}
			
				if(spiralOrderLeft == true && q.size() > 0)
				{
					System.out.print(q.getFirst().data);
					System.out.print(q.getLast().data);
					spiralOrderLeft = false;
				}
				else if(q.size() > 0)
				{
					System.out.print(q.getLast().data);
					System.out.print(q.getFirst().data);
					spiralOrderLeft = true;
				}
			
		}
		
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		TreeSpiralOrderUtil();
	}

}
