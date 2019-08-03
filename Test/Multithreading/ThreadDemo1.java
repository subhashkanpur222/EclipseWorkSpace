package Multithreading;
class ThreadA extends Thread
{
int MAX_COUNT=10;	
int d;
ThreadA odd,even;
static boolean flag=true;
static int count=1;
Object lock;
	public ThreadA(int t1,Object lock)
	{
		this.d=t1;
		this.lock=lock;
	}
	//Print Even number from this thread
	public   void printEven()
	{
		while(count<MAX_COUNT)
		{
		//System.out.print("From printEven:");
		synchronized(lock)
		{
			if(flag)
			{
			try {
				lock.wait();
			} catch (InterruptedException e) {
			}
			}
			System.out.println("From printEven:"+count);
			count++;
			flag=true;
			lock.notify();
			
		}
		}
	}
	//Print Odd number from this thread
	public   void printOdd()
	{
		while(count<MAX_COUNT)
		{
		//System.out.print("From printOdd: ");
		synchronized(lock)
		{
			if(!flag)
			{		
			try {
				lock.wait();
			} catch (InterruptedException e) {
			}
			}
			System.out.println("From printOdd: "+count);
			count++;
			flag=false;
			lock.notify();
		}
		}
	}	
	public void run()
	{
		if(d==0)
			{this.printEven();}
		else
			{this.printOdd();};			
	}	
}
public class ThreadDemo1  {

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		Thread t2= new ThreadA(1,obj);
		Thread t1= new ThreadA(0,obj);
		ThreadA.flag=true;
		t2.start();
		t1.start();
		t1.join();
		t2.join();
	}
}

