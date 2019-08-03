import java.util.Stack;

public class TreeIterativeInorder {
	static Node node;
	static void inordertraversal()
	{
		Stack<Node> st=new Stack<>();
		Node temp;
		st.add(node);
		//System.out.println("line 11 "+ st.size());
		//System.out.println("here");
		while(st.empty()!=true)
		{
			
			
			temp=st.peek();
			//System.out.println(temp.data);
			if(temp.left!=null && temp.left.hd==-1)
				{st.add(temp.left);temp.left.hd=1;}
			else
			{
				temp=st.pop();
				if(temp.right!=null)
					st.add(temp.right);
				System.out.println(+temp.data);
				//System.out.println("at line 27 "+st.size());
			}
			
		}	
	}
	public static void main(String[] args) {
		node = new Node(1);
		node.left=new Node(2);
		node .left.left=new Node(4);
		node .left.right=new Node(5);
		node .right=new Node(3);
		node.right.left=new Node(6);
		node.right.right=new Node(7);
		inordertraversal();
	}

}
