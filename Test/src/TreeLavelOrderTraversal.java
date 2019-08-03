import java.util.LinkedList;
import java.util.Queue;

public class TreeLavelOrderTraversal {
	static void lavelOrderTraversal(Node node)
	{
		Queue<Node> q =new LinkedList<Node>();
		q.add(node);
		while(true)
		{
			int n=q.size();
			if(n<=0)
				break;
			while(n>0)
			{
				Node temp=q.peek();
				System.out.print(temp.data);
				System.out.print(" ");
				q.remove();
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				n--;
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		root.right=new Node(4);
		root.right.left=new Node(8);
		root.right.right=new Node(80);

		lavelOrderTraversal(root);
	}
}
