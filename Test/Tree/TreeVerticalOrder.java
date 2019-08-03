package Tree;

public class TreeVerticalOrder {
	static Node node;
	static int min=100,max=0;
	static void horizontalDistance(Node node)
	{
		if(node==null)
			return;
		if(node.left!=null)
			{
			node.left.hd=node.hd-1;
			if(node.left.hd<min)
				min=node.left.hd;
			horizontalDistance(node.left);
			}
		if(node.right!=null)
			{
			node.right.hd=node.hd+1;
			if(node.right.hd>max)
				max=node.right.hd;
			horizontalDistance(node.right);
			}
		
	}
	static void printverticalUtil(Node node,int i)
	{
		if(node==null)
			return;
		
		printverticalUtil(node.left, i);
		if(node.hd==i)
			System.out.print(node.data);
		printverticalUtil(node.right, i);
	}
	static void printvertical()
	{
		//System.out.println("in");
		System.out.println("max: "+max+"min: "+min);
		for(int i=min;i<=max;i++)
		{
			printverticalUtil(node,i);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		node = new Node(1);
		node.left=new Node(2);
		node .left.left=new Node(4);
		node .left.right=new Node(5);
		node .right=new Node(3);
		node.right.left=new Node(6);
		node.right.left.right=new Node(8);
		node.right.right=new Node(7);
		node.right.right.right=new Node(9);
		node.hd=0;
		horizontalDistance(node);
		System.out.println("hi");
		printvertical();
	}

}
