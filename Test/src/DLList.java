class LLNode{
	int data;
	LLNode prev,next;
	LLNode(int data)
	{
		this.data=data;
		prev=null;
		next=null;
	}
}
public class DLList {
	LLNode head=null,tail=null;
	void add(int data)
	{
		LLNode node=new LLNode(data);
		if (head==null)
			{head=node;tail=node;}
		else
		{
			tail.next=node;
			node.prev=tail;
			tail =node;
		}
			
	}
	void delete(LLNode node)
	{
		
	}
	void print()
	{
		LLNode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLList obj=new DLList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.print();
	}

}
