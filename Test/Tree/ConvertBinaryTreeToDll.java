package Tree;

/*https://www.geeksforgeeks.org/convert-given-binary-tree-doubly-linked-list-set-3/
 * Convert a binary tree to doubly linked list
 *        1
 *       / \
 *      2   3
 *     / \  /
 *    4  5 6
 *    
 *    OP: 4<->2<->5<->1<->3<->6
 */

public class ConvertBinaryTreeToDll {
	static Node root;
	static Node head;
	static Node prev = null;
	public static void ConvertBinaryTreeToDllUtil(Node lNode)
	{
		if(lNode == null)
			return;
		
		ConvertBinaryTreeToDllUtil(lNode.left);
		
		if(prev == null)
		{
			head = lNode;
		}
		else
		{
			lNode.left = prev;
			prev.right = lNode;
		}
		
		prev = lNode;
		
		ConvertBinaryTreeToDllUtil(lNode.right);
	}	
	
	public static void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.right;
		}
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3); 
		root.left.left = new Node(4); 
		root.left.right = new Node(5); 
		root.right.left = new Node(6);
		ConvertBinaryTreeToDllUtil(root);
		printList();
	}
}
