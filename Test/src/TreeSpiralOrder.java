import java.util.Stack;

public class TreeSpiralOrder {
static void SpiralOrder(Node root)
{
	Stack<Node> s1=new Stack<Node>(); 
	Stack<Node> s2=new Stack<Node>();
	s1.push(root);
	while(!s1.isEmpty() || !s2.empty())		
	{
		while(!s1.isEmpty())
		{
			Node temp=s1.peek();
			System.out.print(temp.data);
			s1.pop();
			if(temp.right!=null)
				s2.push(temp.right);
			if(temp.left!=null)
				s2.push(temp.left);				
		}
		while(!s2.isEmpty())
		{
			Node temp=s2.peek();
			System.out.print(temp.data);
			s2.pop();
			if(temp.left!=null)
				s1.push(temp.left);
			if(temp.right!=null)
				s1.push(temp.right);		
		}	
	}
}
	public static void main(String[] args) {
		// TODO write recursive, iterative, and 2 stack method.
		Node root =new Node(1);
		root.left =new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(7);
		root.left.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(4);
		System.out.println("Spiral Order of tree is :");
		SpiralOrder(root);
	}

}
