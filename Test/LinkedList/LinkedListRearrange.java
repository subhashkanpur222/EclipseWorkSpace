package LinkedList;


public class LinkedListRearrange {
	
	static LLNode node,head=null;
	
	static void llRearrange()
	{
		LLNode itr=head;
		LLNode newitr=itr,prev=null;
		
		while(newitr!=null)
		{
			LLNode temp=head;		
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
			newitr=newitr.next;
			itr.next=temp;
			temp.next=newitr;
			itr=newitr;
		}
	}
	public static void main(String[] args) {		
		node =new LLNode(1);
		node.next=new LLNode(3);
		node.next.next=new LLNode(7);
		node.next.next.next=new LLNode(3);
		node.next.next.next.next=new LLNode(2);
		node.next.next.next.next.next=new LLNode(12);
		node.next.next.next.next.next.next=new LLNode(24);
		
		head=node;
		
		LLNode temp=head;
		System.out.println(" Before Rearrange: ");
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
		
		llRearrange();
		
		System.out.println("\n After Rearrange: ");
		temp=head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
	}

}
