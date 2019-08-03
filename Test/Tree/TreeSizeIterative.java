package Tree;

import java.util.Stack;

class Node
{
	int data,hd;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
		this.hd=0;
		left=right=null;
	}
}
public class TreeSizeIterative {
	static Node node;
	static int TreeSizeIterativeUtil()
	{
		int size=0;
		Stack<Node> st=new Stack<Node>();
		st.push(node);
		
		while(!st.isEmpty())
		{
		Node temp;
		temp=st.peek();
		st.pop();
		size++;
		if(temp.left!=null)
			st.push(temp.left);
		if(temp.right!=null)
			st.push(temp.right);
		}
		return size;
	}
	public static void main(String[] args) {
		node = new Node(26);
		node.left=new Node(10);
		node .left.left=new Node(4);
		node .left.right=new Node(6);
		node .right=new Node(3);
		node.right.left=new Node(2);
		node.right.right=new Node(1);
		node.right.right.left=new Node(3);
		System.out.println("Size of tree is: "+TreeSizeIterativeUtil());
	}

}
