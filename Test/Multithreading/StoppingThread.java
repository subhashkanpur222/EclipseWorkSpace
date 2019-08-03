package Multithreading;

import java.util.concurrent.atomic.AtomicBoolean;

/*
 * If a task is running in  a separate thread, stop the task if it exceeds 10 minuts.
 * Step 1. stop the thread/task
 * Step 2. timeout condition
 * 
 * Step1: There are 2 ways. a) use interrupt signal to running thread using thread.interrupt()
 * 							b) Use Volatile or AtomicBoolean
 */

class MyTask implements Runnable
{
	//public volatile boolean keepRunning = true;
	public AtomicBoolean  keepRunning = new AtomicBoolean(true);
	@Override
	public void run() {
		while(keepRunning.get() == true)
		System.out.println("Hellow word from thread");
		
	}
	
}
public class StoppingThread {
	
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread t1 = new Thread(task);
		t1.start();
		try {
			t1.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		task.keepRunning.set(false);
	}

}
