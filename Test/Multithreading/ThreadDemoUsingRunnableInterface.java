package Multithreading;

public class ThreadDemoUsingRunnableInterface implements Runnable{

	@Override
	public void run()
	{
		System.out.println("Hello from runnable Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemoUsingRunnableInterface t1 = new ThreadDemoUsingRunnableInterface();
		Thread t =new Thread(t1);
		t.start();
	}

}
