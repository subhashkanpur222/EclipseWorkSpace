package Multithreading;
/*
 * The wait() is used for inter-thread communication while the join() is used for adding sequencing between multiple threads. 
 * one thread starts execution after first thread execution finished.
 * synchronized is required for wait() and notify()
 */
class BankOperations
{
	int balance=1000;
	
	public synchronized void withdraw(int amount)
	{
		if(this.balance-amount < 500)
		{
			System.out.println("Insufficient balance in acount to withdraw: "+ amount);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.balance=this.balance-amount;
		System.out.println(amount+ " has been withdrawn from account, now balance is: "+this.balance);
	}
	
	public synchronized void deposit(int amount)
	{
		this.balance=this.balance+amount;
		System.out.println("Current balance is: "+this.balance+"after depositing "+amount);
		if(this.balance>500)
		{
			notify();
		}
	}
}
public class ThreadWaitDemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperations b1 = new BankOperations();
		
		new Thread(){
			@Override
			public void run()
			{
				b1.withdraw(501);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run()
			{
				b1.deposit(1000);
			}
		}.start();
	}

}
