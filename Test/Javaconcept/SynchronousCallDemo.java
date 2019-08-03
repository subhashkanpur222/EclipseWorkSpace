package Javaconcept;

// https://www.geeksforgeeks.org/asynchronous-synchronous-callbacks-java/

interface OnGeekEventListener 
{
	void onGeekEvent(); 
}

class A implements OnGeekEventListener
{
	public void onGeekEvent()
	{
		System.out.println("Performing callback after synchronous Task");
	}
}
public class SynchronousCallDemo {
	OnGeekEventListener geekEventListnr = null;
	public void registerEventonGeekListener(OnGeekEventListener eventListener)
	{
		this.geekEventListnr = eventListener;
	}
	public void doGeekStuff()
	{
		 System.out.println("Performing callback before synchronous Task"); 
		 if(geekEventListnr != null)
		 {
			 geekEventListnr.onGeekEvent();
		 }
	}
	public static void main(String[] args) {
		SynchronousCallDemo scd = new SynchronousCallDemo();
		scd.registerEventonGeekListener(new A());
		scd.doGeekStuff();
	}

}
