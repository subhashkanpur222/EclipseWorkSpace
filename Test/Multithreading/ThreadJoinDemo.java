package Multithreading;

/*
 * Join will stop the execution at the place from its call and will wait for the thread to complete/die on which this is called.
 * This will not require synchronize block.
 * 
 * Bellow program creates 2 threads, first print number and second prints characters. With the usage of join first thread execution is 
 * completed first and the execution of second thread starts.
 */

class PrintNumber extends Thread
{
	public void run()
	{		
		try {
			for(int i=1;i<=5;i++)			
				{
					System.out.println(i);
					sleep(5);
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class PrintChar extends Thread
{
	public void run()
	{
		for(char i='a';i<='e';i++)
			{
				System.out.println(i);
				try {
					sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber t1 = new PrintNumber();
		PrintChar t2 = new PrintChar();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
