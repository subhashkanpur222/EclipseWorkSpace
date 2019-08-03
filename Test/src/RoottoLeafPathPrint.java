
public class RoottoLeafPathPrint {
	static Node root;
	static boolean visited[]=new boolean[10];
	static int k=2;
	static void printRootLeafPathUtil(int att[],int pathLen)
	{
		System.out.println();
		//for(int i=0;i<pathLen;i++)
		if(visited[pathLen-k]==false)
			{System.out.print(" "+att[pathLen-k]);visited[pathLen-k]=true;}
	}
	static void Roottoleafpath(Node node,int arr[],int pathLen)
	{
		if(node.left==null && node.right==null)
		{
			visited[pathLen]=false;
			arr[pathLen++]=node.data;
			printRootLeafPathUtil(arr,pathLen);
			return;
		}
		visited[pathLen]=false;
		arr[pathLen++]=node.data;
		//if(node.left!=null)
		Roottoleafpath(node.left,arr,pathLen);
		
		//if(node.right!=null)
		Roottoleafpath(node.right,arr,pathLen);
	}
	public static void main(String[] args) {
		int arr[]=new int[10];
		root=new Node(1);
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
        Roottoleafpath(root,arr,0);
	}

}
