package Tree;

public class TreeSiblingNodes {
	static Node node,node1,node2;
	static boolean isSibling(Node node)
	{
		if(node == null)
			return false;

		isSibling(node.left);
		isSibling(node.right);
		
		if(node.left==node1 && node.right==node2 || node.right==node1 && node.left==node2)
			return true;
		
		
		return false;
	}
	static void getNodeHeight(Node node)
	{
		if(node == null)
			return;
		if(node.left!=null && node.left.hd==0)
		node.left.hd=node.hd+1;
		if(node.right!=null && node.right.hd == 0)
		node.right.hd=node.hd+1;
		getNodeHeight(node.left);
		getNodeHeight(node.right);
		
		return;
	}
	public static boolean isCousin(Node node1,Node node2)
	{
		node.hd=1;
		getNodeHeight(node);
		if(node1.hd==node2.hd && !isSibling(node))
			return true;
		return false;
	}
	public static void main(String[] args) {
		node = new Node(26);
		node.left=new Node(10);
		node.left.left=new Node(4);
		node.left.right=new Node(6);
		node.right=new Node(3);
		node.right.left=new Node(2);
		node.right.right=new Node(1);
		node1=node.left.right;
		node2=node.right.right;
		System.out.println("node1 and node2 are sibling: "+isCousin(node1,node2));
	}

}
