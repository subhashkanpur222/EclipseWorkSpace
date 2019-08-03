package Multithreading;

class ThreadTest extends Thread
{
	public void run()
	{
		System.out.println("Hello from thread");
	}
}
public class ThreadDemoUsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadTest t1 = new ThreadTest();
		//t1.start();
		new ThreadTest() {			
		}.start();
	}

}
