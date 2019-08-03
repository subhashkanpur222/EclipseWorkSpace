package LinkedList;

import java.util.*;

/*
 * Program takes input from uer and sort the linked list using merge sort.
 */
public class LinkedListMergeSort {
	public static void LLPrint(LLNode l1)
	{
		LLNode temp = new LLNode(0);
		temp = l1;
		while(temp!= null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLNode l1 = new LLNode(50);
		l1.next =new LLNode(20);
		l1.next.next = new LLNode(100);
		l1.next.next.next = new LLNode(10);
		l1.next.next.next.next = new LLNode(70);
		l1.next.next.next.next.next = new LLNode(30);
		l1.next.next.next.next.next.next = new LLNode(80);
		l1.next.next.next.next.next.next.next = new LLNode(40);
		l1.next.next.next.next.next.next.next.next = new LLNode(60);
		LLPrint(l1);
	}

}
