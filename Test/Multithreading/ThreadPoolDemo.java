package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 16 May
 * https://www.journaldev.com/1069/threadpoolexecutor-java-thread-pool-example-executorservice
 * Java thread pool manages the collection of Runnable threads. The worker threads execute Runnable threads from the queue.
 * The Java ExecutorService interface, java.util.concurrent.ExecutorService, represents an asynchronous execution mechanism which is 
 * capable of executing tasks concurrently in the background. 
 * The Executors class provides factory methods for the executor services provided in this package. 
 * http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
 * https://www.youtube.com/watch?v=6Oo-9Can3H8&list=PLhfHPmPYPPRl0LntrCBnQD5ln6lnqqoms   =>Good example 
 */

class WorkerThread implements Runnable {
	private String command;
	
	public WorkerThread(String command)
	{
		this.command = command;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start . Command = "+command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + "End");
	}
	public void processCommand()
	{
		 try {
	            Thread.sleep(50);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	
	@Override
    public String toString(){
        return this.command;
    }

}
public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		int cpuCoreCount = Runtime.getRuntime().availableProcessors();
        
		ExecutorService executor = Executors.newFixedThreadPool(cpuCoreCount);
		for (int i = 1; i <= 10; i++) {
			WorkerThread worker = new WorkerThread("" + i);
			/* Below submit is for Callable interfiace call method. This will work for both Runnable and callable.
			 * execute(i.e. executor.execute(worker);) works on for Runnable
			 */
			executor.submit(worker);
		}
		executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
        
	}
}
