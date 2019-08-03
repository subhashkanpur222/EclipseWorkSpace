package Multithreading;
//  http://jaroslav-sedlacek.blogspot.com/2011/03/deadlock-despite-consistent-lock.html

public class DeadLockDemo {

	public static void main(String[] args) {
		final String str1 = "hello";
		final String str2 = "world";
		
		Thread t1 = new Thread()
				{
				@Override
				public void run()
				{
					synchronized(str1)
					{
						System.out.println("Locked object str1");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
						synchronized(str2)
						{
							System.out.println("Trying to lock str2");
						}
					}
				}
				};
				Thread t2 = new Thread()
				{
				@Override
				public void run()
				{
					synchronized(str2)
					{
						System.out.println("Locked object str2");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}		
						synchronized(str1)
						{
							System.out.println("Trying to lock str1");
						}
					}
				}
				};
		t1.start();
		t2.start();
	}

}
