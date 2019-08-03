package Multithreading;

/*
 * This program illustrates printing even odd numbers from 2 different threads.
 * 0,2,4,6,8,10=> from thread1
 * 1,3,5,7,9=>from thread2
 */
class PrintOddEvenUtil
{
int lock=0;
public synchronized void printEven()
{
	int i=0;
	while(i<=10)
	{		
		if(lock==0)
		{
			System.out.println(i+" From printEven");
			i=i+2;
			lock=1;
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// 	TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public synchronized void printOdd()
{
	int i=1;
	while(i<=10)
	{		
		if(lock==1)
		{
			System.out.println(i+" From printOdd");
			i=i+2;
			lock=0;
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// 	TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
public class PrintOddEvenLatest extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				PrintOddEvenUtil obj =new PrintOddEvenUtil();
				new Thread()
				{
					@Override
					public void run()
					{
						obj.printEven();
					}
				}.start();	
				new Thread()
				{
					@Override
					public void run()
					{
						obj.printOdd();
					}
				}.start();
	}
}
