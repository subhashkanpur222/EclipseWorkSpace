package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/* Date: 16 May, 2019
 * https://www.journaldev.com/1095/atomicinteger-java
 * This is for integer and long, when we do atomic operatons
 */
class AtomicIntegerUtil implements Runnable
{
	//private int count;
	private AtomicInteger count = new AtomicInteger();
	@Override
	public void run() {
		for(int i =0 ; i<10; i++)
		{
			dosomething();

			count.incrementAndGet();
		}
	}
	public void dosomething()
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public AtomicInteger getCount()
	{
		return count;
	}
	
}
public class AtomicIntegerDemo {

	public static void main(String[] args) {
		AtomicIntegerUtil obj = new AtomicIntegerUtil();
		Thread t1 = new Thread(obj, "thread1");
		Thread t2 = new Thread(obj, "thread2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj.getCount());
		
	}

}
