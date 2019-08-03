package LinkedList;
/*https://www.geeksforgeeks.org/?p=15194/
 * Input:
  First List: 5->6->3  // represents number 365
  Second List: 8->4->2 //  represents number 248
Output
  Resultant list: 3->1->6  // represents number 613
  
  Input:
  First List: 7->5->9->4->6  // represents number 64957
  Second List: 8->4 //  represents number 48
Output
  Resultant list: 5->0->0->5->6  // represents number 65005
 */
public class Adding2NumberAsLinkedList {
	static LLNode head1, head2, result=null,tempResult=null;
	static int carry=0; 
	static void addLinkedList(LLNode head1temp, LLNode head2temp)
	{
		while(head1temp != null && head2temp != null)
		{
			//System.out.println("data1: "+head1temp.data+"data2: "+head2temp.data);
			int data = head1temp.data + head2temp.data;
			//System.out.println("Data is: "+data);
			int temp;
			temp = data>=10?(data%10):data;
			temp = temp+carry;
			//System.out.println("temp is: "+temp);
			if(result == null)
			{	//System.out.println("Hitting if part");
			    tempResult = new LLNode(temp);tempResult.next = null;
			    result = tempResult;
			}
			else
			{
				//System.out.println("Hitting else part");
				LLNode tempNode = new LLNode(temp);
				tempResult.next = tempNode;
				tempResult = tempResult.next;
				tempResult.next = null;
			}
			
			if(data >= 10)
				carry =1;
			else
				carry =0;
			
			head1temp = head1temp.next;
			head2temp = head2temp.next;
		}
		if(carry> 0)
		{	
			result.next = new LLNode(carry);
			result.next.next = null;
		}
		System.out.println("Lined List after addition is: ");
		printLinkedList(result);
	}
	static void printLinkedList(LLNode head)
	{
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		head1 = new LLNode(7);
		head1.next = new LLNode(5);
		head1.next.next = new LLNode(9);
		head1.next = new LLNode(4);
		head1.next = new LLNode(6);
		System.out.println("First Linked list is: ");
		printLinkedList(head1);
		
		head2 = new LLNode(8);
		head2.next = new LLNode(4);
		//head2.next.next = new LLNode(2);
		System.out.println("Second Linked list is: ");
		printLinkedList(head2);
		addLinkedList(head1, head2);
	}

}
