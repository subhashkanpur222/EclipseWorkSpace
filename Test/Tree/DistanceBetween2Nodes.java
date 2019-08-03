package Tree;

public class DistanceBetween2Nodes {
	static Node root;
	static boolean flag = false;
	static int path1[] = new int[100];
	static int path2[] = new int[100];
	static int path1Len=0, path2Len=0, node1value, node2value;
	static void rootToNodePath(Node root, int node, int path[],int pathLen)
	{
		if(root.data == node)
			{
			path[pathLen] = root.data; 
				if(node1value == node)
					path1Len = pathLen;
				else
					path2Len = pathLen;
				flag = true;
				return;
			}
				
		
		path[pathLen++] = root.data;
		if(root.left != null && flag==false)
		rootToNodePath(root.left, node, path, pathLen);
		if(root.right != null && flag==false)
		rootToNodePath(root.right, node, path, pathLen);
		
	}
	static int findDistance(Node root, int node1, int node2)
	{
		int distance1=0,distance2=0;
		path1Len=0; path2Len=0;
		node1value = node1;
		node2value = node2;
		rootToNodePath(root, node1, path1, 0 );
		flag = false;
		rootToNodePath(root, node2, path2, 0 );
		
		System.out.println("path1Len is: "+path1Len+ " path2Len is: "+path2Len);
		
		int i =0;
		while(path1[i] == path2[i] && path1[i]!=0 && path2[i]!=0)
			i++;
		i--;
		return path1Len+path2Len-2*i;
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		System.out.println("Dist(4, 5) = "+findDistance(root, 4, 8));
	}

}
