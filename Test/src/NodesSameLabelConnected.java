import java.util.LinkedList;
import java.util.Queue;

public class NodesSameLabelConnected {
	static void NodesSameLabel(Node node)
	{
		int n=0;
		Queue<Node> q =new LinkedList<Node>();
		q.add(node);
		
		while(true)
		{	
			Node prev=null;
			n=q.size();
			if(n<=0)
				break;
			while(n>0)
			{
				Node temp=q.peek();
				if(prev==null)
				{
					prev=temp;
				}
				else
				{
					prev.next=temp;
					prev=temp;
				}
				if(n==1)
					temp.next=null;
				q.remove();
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				n--;
			}
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
        System.out.println("Root to leaf paths are: ");
        
        /*
         *          1
         *        /   \
         *      2      4
         *     / \    / \
         *   3     5 8   18
         */
        NodesSameLabel(root);
	}

}
