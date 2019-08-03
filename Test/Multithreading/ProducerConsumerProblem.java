package Multithreading;

import java.util.*;

/*
 * http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
 * https://www.geeksforgeeks.org/producer-consumer-solution-using-threads-java/
 */
class ProducerConsumerProblemUtil{
	int capacity=2;
	int item = 1;
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	
	public synchronized void producer() {
		while(true) {
		if(l1.size() == capacity) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("producer produced item is: "+item);
		l1.add(item++);
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}
	public  synchronized void consumer() {
		while(true) {
		if(l1.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int value = l1.removeFirst();
		System.out.println("Consumer consumed item is:"+value);
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

public class ProducerConsumerProblem {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProducerConsumerProblemUtil pcpu = new ProducerConsumerProblemUtil();
		// Create producer thread 
        Thread t1 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                pcpu.producer(); 
            } 
        }); 
        
        Thread t2 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                pcpu.consumer(); 
            } 
        });
        
        // Start both threads 
        t1.start(); 
        t2.start(); 
  
        // t1 finishes before t2 
        t1.join(); 
        t2.join(); 
	}
}

/*public class ProducerConsumerProblem extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumerProblemUtil pcpu =new ProducerConsumerProblemUtil();
		new Thread() {
			@Override
			public void run()
			{
				pcpu.consumer();
			}
		}.start();
		new Thread() {
			@Override
			public void run()
			{
				pcpu.producer();
			}
		}.start();
		
	}

}*/
