import java.util.LinkedList;
import java.util.Queue;

public class ReverseKElementsQueue {
	static Queue<Integer>  queue; 
	static void ReverseKElements(Queue<Integer>  queue, int queuesize, int K)
	{
		Queue<Integer>  tempqueue= new LinkedList<Integer>();
		for(int i=0;i<queuesize-K;i++) 
			tempqueue.add(queue.remove());
		for(int i=0;i<queuesize-K;i++) 
			System.out.println(tempqueue.remove());
	}
	static void main(String[] args) {		
		queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		int queuesize=queue.size();
		ReverseKElements(queue, queuesize, 5);
	}

}
