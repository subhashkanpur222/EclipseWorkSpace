package Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* 16 May
 * https://www.journaldev.com/1034/java-blockingqueue-example
 * Java BlockingQueue doesn’t accept null values and throw NullPointerException 
 * put(E e): This method is used to insert elements to the queue. If the queue is full, it waits for the space to be available.
 * E take()
 */

class Message
{
	private String msg;
	
	public Message(String msg)
	{
		this.msg = msg;
	}
	
	public void setMessage(String msg)
	{
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
}

class Producer implements Runnable
{
	private BlockingQueue<Message> queue;
	public Producer(BlockingQueue<Message> queue)
	{
		this.queue = queue;
	}
	@Override
	public void run() {
		for(int i=0; i<100; i++)
		{
			Message msg = new Message(""+i);
			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced "+msg.getMessage());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}


		}
		//adding exit message
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}

class Consumer implements Runnable
{
	private BlockingQueue<Message> queue;
	public Consumer(BlockingQueue<Message> queue)
	{
		this.queue = queue;
	}
	@Override
	public void run() {
		try
		{
			Message msg;
			//consuming messages until exit message is received
			while((msg = queue.take()).getMessage() != "exit")
			{
				Thread.sleep(10);
				System.out.println("Consumed: "+msg.getMessage());
			}			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	
}
	
}
public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");
	}
}
