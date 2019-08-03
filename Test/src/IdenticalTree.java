
public class IdenticalTree {
    static boolean IsTreeIdentical(Node root1, Node root2)
    {
    	if(root1==null &&root2==null)
    	return true;
    	if(root1.data==root2.data && IsTreeIdentical(root1.left,root2.left)&&IsTreeIdentical(root1.right,root2.right))
    		return true;
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = new Node(1);
		root1.left=new Node(2);
		root1.right=new Node(4);
		root1.left.left=new Node(3);
		Node root2 = new Node(1);
		root2.left=new Node(2);
		root2.right=new Node(4);
		root2.left.left=new Node(3);		
		if(IsTreeIdentical(root1,root2))
			System.out.println("Trees are identical");
		else
			System.out.println("Trees are not identical");
	}

}
