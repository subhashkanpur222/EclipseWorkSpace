package LinkedList;

public class LinkedListReverse {
	static LLNode head;
	public static void printList()
	{
		LLNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void reverse()
	{
		LLNode prev, current, next;
		prev = null;
		current = head;
		while(current!= null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	public static void main(String[] args) {
		head = new LLNode(85);  
        head.next = new LLNode(15); 
        head.next.next = new LLNode(4); 
        head.next.next.next = new LLNode(20); 
          
        System.out.println("Given Linked list"); 
        printList(); 
        reverse(); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        printList(); 
	}

}
