package Javaconcept;

interface OnGeekEventListenerAsync 
{
	void onGeekEvent(); 
}

class Aasync implements OnGeekEventListenerAsync
{
	public void onGeekEvent()
	{
		System.out.println("Performing callback after Asynchronous Task");
	}
}

public class AsynchronousCallDemo {
	OnGeekEventListenerAsync oGEL = null;
	public void RegisterOnGeekEventListener(OnGeekEventListenerAsync oGEL)
	{
		this.oGEL = oGEL;
	}
	public void doGeekStuff()
	{
	new Thread(new Runnable(){	
		public void run() 
        {	
	
		System.out.println("Performing callback in Asynchronous Task");
		if(oGEL != null)
			oGEL.onGeekEvent();
        }
	}
	).start();
	}
	public static void main(String[] args) {
		AsynchronousCallDemo aSCD = new AsynchronousCallDemo();
		aSCD.RegisterOnGeekEventListener(new Aasync());
		aSCD.doGeekStuff();
	}

}
