
public class KDistanceNode {
	static void nodesAtKDistance(Node node, int k)
	{
		if (node ==null)
			return;
		if (k==0)
			{System.out.println(node.data);return;}
		nodesAtKDistance(node.left,k-1);
		nodesAtKDistance(node.right,k-1);
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		root.right=new Node(4);
		root.right.left=new Node(8);
		System.out.println("Node at distance 2 are: ");
		nodesAtKDistance(root,2);
	}

}
