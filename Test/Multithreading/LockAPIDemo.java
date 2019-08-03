package Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 16 May, 2019
 * https://www.journaldev.com/2377/java-lock-example-reentrantlock
 * Scenario: lets say we have 2 methods first for doing db read and write  and other for
 * logging. We want only 1st method to be thread safe and should not wait indefinate for getting lock.
 *  we can use Lock API ReentrantLock. Lock API provides more visibility and options for locking, unlike
 *  synchronized where a thread might end up waiting indefinitely for the lock, we can use tryLock() 
 *  to make sure thread waits for specific time only. 
 *  
 *  https://www.youtube.com/watch?v=_RSAS-gIjGo&list=PLhfHPmPYPPRmHL24Ry8rzni2XgwFeooVE  =>Imp
 */

class Resource 
{
	public void doSomething()
	{
		System.out.println("Doing important activity...");
	}
	public void doLogging()
	{
		System.out.println("Doing logging...");
	}
}
public class LockAPIDemo implements Runnable{
	private Resource resource;
	private Lock lock;
	public LockAPIDemo(Resource r){
		this.resource = r;
		this.lock = new ReentrantLock();
		}
	public static void main(String[] args) {
		
		LockAPIDemo obj = new LockAPIDemo(new Resource());	
		Thread t = new Thread(obj);
		t.start();
	}
	@Override
	public void run() {
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)){
			resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			//release lock
			lock.unlock();
		}
		resource.doLogging();
	}
}
