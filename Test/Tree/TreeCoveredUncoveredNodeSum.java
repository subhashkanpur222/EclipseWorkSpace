package Tree;

public class TreeCoveredUncoveredNodeSum {
	static Node node;
	static int treesum=0,treeouternodesum=0;
	
	static void treeOuterNodeSum(Node node)
	{
		Node lnode=node.left;
		Node rnode=node.right;
		treeouternodesum=treeouternodesum+node.data;
		while(true)
		{
			if(lnode == null)
				break;
			treeouternodesum=treeouternodesum+lnode.data;
			if(lnode.left!=null)
				{
				lnode=lnode.left;
				}
			else if(lnode.right!=null)
			{
				lnode=lnode.right;
			}
			else
				break;
		}
		while(true)
		{
			if(rnode == null)
				break;
			treeouternodesum=treeouternodesum+rnode.data;
			if(rnode.right!=null)
				{
				rnode=rnode.right;
				}
			else if(rnode.left!=null)
			{
				rnode=rnode.left;
			}
			else
				break;
		}
		return;
	}
	
	static int treeNodeSum(Node node)
	{
		if(node == null)
			return 0;
		
		treesum=treesum+node.data;
		treeNodeSum(node.left);
		treeNodeSum(node.right);
		
		return treesum;
	}

	public static void main(String[] args) {
		node = new Node(10);
		node.left=new Node(3);
		node.left.left=new Node(5);
		node.left.right=new Node(8);
		node.right=new Node(4);
		node.right.left=new Node(15);
		node.right.right=new Node(1);
		treeNodeSum(node);
		treeOuterNodeSum(node);
		System.out.println("sum of tree outer node is: "+treeouternodesum);
		System.out.println("sum of tree node is: "+treesum);
	}

}
