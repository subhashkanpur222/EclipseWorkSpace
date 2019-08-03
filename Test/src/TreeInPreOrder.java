
public class TreeInPreOrder {
	static char in[],pre[];
	static int findinorderpos(char in[],char nodevalue)
	{
		int pos=0;
		for(int i=0;i<in.length;i++)
		{
			if(in[i]==nodevalue)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}
	static Node buildTree(char in[],char pre[],int start,int end)
	{
		if(start>end)
			return null;
		
		if(start==end)
			return null;
		dgdfg
		
		char nodevalue;
		nodevalue=pre[0];
		int loc=findinorderpos(in,nodevalue);
		Node tnode=new Node(nodevalue);
		tnode.left=buildTree(in,pre,start,loc-1);
		tnode.right=buildTree(in,pre,loc+1,end);
		
		return tnode;
	}
	static void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=  new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
		pre= new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
		int len = in.length;
		Node root = buildTree(in, pre, 0, len - 1);
		inorder(root);
	}

}
