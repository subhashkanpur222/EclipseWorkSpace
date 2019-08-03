/*class Node 
{
    int data;
    Node left, right;
  
    public Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
*/

public class LeafNodeCount {
	//Root of the Binary Tree
    Node root;
    public int getLeafCountRec(Node root)
    {
    	if(root==null)
    		return 0;
    	else if((root.left==null) &&(root.right==null))
    	    return 1;
    	else
    		return getLeafCountRec(root.left)+getLeafCountRec(root.right);
    }
    public int getLeafCount()
    {
    	return getLeafCountRec(root);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* create a tree */
		LeafNodeCount tree = new LeafNodeCount();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
          
        /* get leaf count of the abve tree */
        System.out.println("The leaf count of binary tree is : " + tree.getLeafCount());
	}

}