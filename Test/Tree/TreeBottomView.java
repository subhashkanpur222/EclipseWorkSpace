package Tree;
import java.util.*;
import static java.lang.Integer.max;


public class TreeBottomView {

	static void bottomView(Node root)
	{
		if(root==null)
			return;
		int hd = 0;
		hd = root.hd;
		ArrayList Q = new ArrayList<Node>();
		Map M = new HashMap<Integer, Integer>();
		Q.add(root);
		while(!Q.isEmpty() )
		{
			Node p = (Node) Q.get(0);
			Q.remove(0);
			hd=p.hd;
			M.put(hd, p.data);
			if(p.left!=null)
				{p.left.hd=hd-1;Q.add(p.left);}
			if(p.right!=null)
				{p.right.hd=hd+1;Q.add(p.right);}
		}
		System.out.print(M.values() + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root= new Node(10);
		root.left=new Node(5);
		root.right= new Node(15);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right.left=new Node(12);
		root.right.right=new Node(18);
		root.hd=0;
		System.out.println("Bottom view of tree is:");
		bottomView(root);
	}

}
