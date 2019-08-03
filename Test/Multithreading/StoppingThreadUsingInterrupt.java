package Multithreading;
/*
 *  https://www.youtube.com/watch?v=_RSAS-gIjGo&list=PLhfHPmPYPPRmHL24Ry8rzni2XgwFeooVE&index=1  
 *  addShutdownHook  => read this  
 */

class MyThread implements Runnable
{
	@Override
	public void run() {
		while(!Thread.interrupted())
		{
			System.out.println("MyThread is running");
			
		}	
	}
}
public class StoppingThreadUsingInterrupt {

	public static void main(String[] args) {
		//Runtime.getRuntime().addShutdownHook(new MyThread());
		MyThread obj = new MyThread();
		Thread t1 = new Thread(obj);
		t1.start();
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();
	}
}
