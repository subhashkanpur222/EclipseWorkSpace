package Tree;
import java.util.Stack;

public class TreePostorder {
	static void Postorder(Node root)
	{
		Stack<Node> st1=new Stack<Node>();
		Stack<Node> st2=new Stack<Node>();
		st1.push(root);
		st2.push(root.left);
		st2.push(root.right);
		
		while(!st2.isEmpty())
		{
			Node temp=st2.peek();
			st2.pop();
			if(temp.left!=null)
				st2.push(temp.left);
			if(temp.right!=null)
				st2.push(temp.right);
			st1.push(temp);
		}
		 while (!st1.empty())
	        {
	            Node temp1 =st1.pop();
	            System.out.print(temp1.data + " ");
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root =new Node(1);
		root.left =new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(7);
		root.left.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(4);
		System.out.println("Post Order traversal of tree is :");
		Postorder(root);
	}

}
