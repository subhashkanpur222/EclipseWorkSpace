
public class IsBST {
	static boolean IsBSTree(Node root,int min, int max)
	{
		if(root==null)
			return true;
		
		if(root.data<min  || root.data>max)
		{System.out.println("root data is:"+root.data+"min:");return false;}
		
		return (IsBSTree(root.left,min,root.data-1) && IsBSTree(root.right,root.data+1,max));
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root= new Node(10);
		root.left=new Node(7);
		root.right=new Node(39);
		root.left.right=new Node(8);
		if(IsBSTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
			System.out.println("Trees is BST");
		else
			System.out.println("Trees is not BST");
	}
}	
