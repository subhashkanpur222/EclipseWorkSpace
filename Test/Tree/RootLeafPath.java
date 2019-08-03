package Tree;

public class RootLeafPath {
	static void PrintRoottoleafpath(int a[], int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(" "+a[i]);
		System.out.println(" ");
	}
	static void RoottoleafpathUtil(Node node,int a[], int n)
	{
		if (node.left==null && node.right==null)
			{a[n++]=node.data;PrintRoottoleafpath(a,n);return;}
		a[n++]=node.data;
		if(node.left!=null)
		RoottoleafpathUtil(node.left,a,n);
		if(node.right!=null)
		RoottoleafpathUtil(node.right,a,n);
		
	}
	static void Roottoleafpath(Node node)
	{
		int a[]= new int[10];
		int i=0;
		RoottoleafpathUtil(node, a, i);
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
        Roottoleafpath(root);
	}

}
