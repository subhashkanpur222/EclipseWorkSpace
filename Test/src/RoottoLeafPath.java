/*class Node
{
	int data;
	Node left,right;
	public Node(int item)
	{
		data=item;
		left=right=null;
	}
}*/

public class RoottoLeafPath{
	//Node root;
	static boolean haspathsum(Node node, int sum)
	{
		boolean ans=false;
		int sumnow=0;
		sumnow= sum-node.data;
		System.out.println("sumnow is"+sumnow+"node data is"+node.data+"node left is "+node.left+"node right is "+node.right);
		if(sumnow==0 && node.left==null && node.right==null)
			{System.out.println("condition is hit");return true;}
		if(node.left!=null)
			//haspathsum(node.left, sumnow);
			ans = ans || haspathsum(node.left, sumnow);
		if(node.right!=null)
			//haspathsum(node.right, sumnow);
			ans = ans || haspathsum(node.right, sumnow);
			
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=21;
		//RoottoLeafPath tree =new RoottoLeafPath();
		
        Node root=new Node(10);
        root.left=new Node(8);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(5);
        root.right.left=new Node(2);
        if(haspathsum(root,sum))
        	System.out.println("There exist a path with value as "+sum);
        else
        	System.out.println("There is no path");
	}

}
