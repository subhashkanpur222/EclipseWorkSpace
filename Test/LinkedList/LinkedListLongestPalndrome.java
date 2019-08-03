package LinkedList;

class LLNode{
	int data;
	LLNode next;
	public LLNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class LinkedListLongestPalndrome {
	
	static LLNode node,head=null;
	static int result=0;
	static int countCommon(LLNode currNode, LLNode nextNode)
	{
		int count=0;
		boolean a = false,b = false;
		if(nextNode != null)
			a=true;
			else
			a=false;
			if(currNode != null)
				b=true;
				else
				b=false;
			
		for(;a&&b ;currNode=currNode.next,nextNode=nextNode.next)
		{
			System.out.println("curr: "+currNode.data+" next: "+nextNode.data+" result is: "+count);
			if(nextNode != null)
				a=true;
				else
				a=false;
			
			if(currNode != null)
					b=true;
					else
					b=false;
			if(currNode.data==nextNode.data)
			{count++;}
			else
				break;
		}		
		return count;
	}
	static int lLLPlndrmeUtil()
	{
		LLNode prev=null,curr=node;
		while(curr != null)
		{
			LLNode next=curr.next;
			curr.next=prev;
			//System.out.println("curr: "+curr.data+" next: "+next.data+" result is: "+result);
			result=Math.max(result, 2*countCommon(prev, next)+1);
			result=Math.max(result, 2*countCommon(curr, next));
			prev=curr;
			head=curr;
			curr=next;
		}		
		return result;
	}
	public static void main(String[] args) {
		
		node=new LLNode(2);
		node.next=new LLNode(3);
		node.next.next=new LLNode(7);
		node.next.next.next=new LLNode(3);
		node.next.next.next.next=new LLNode(2);
		node.next.next.next.next.next=new LLNode(12);
		node.next.next.next.next.next.next=new LLNode(24);
		lLLPlndrmeUtil();
		System.out.println("Length of longest palindrome is: "+result);
		/*LLNode temp=head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}*/
	}

}
