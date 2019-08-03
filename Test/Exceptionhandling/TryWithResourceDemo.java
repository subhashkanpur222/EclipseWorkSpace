package Exceptionhandling;

class Demo1 implements AutoCloseable
{
	public void show()
	{
		System.out.println("show from Demo1");
	}
	@Override
	public void close()
	{
		System.out.println("Close from Demo1");
	}
}

class Demo2 implements AutoCloseable
{
	public void show()
	{
		System.out.println("show from Demo2");
	}
	@Override
	public void close()
	{
		System.out.println("Close from Demo2");
	}
}

public class TryWithResourceDemo {

	public static void main(String[] args) {
		try(Demo1 obj1 = new Demo1();Demo2 obj2 = new Demo2())
		{
			int x = 10/0;
			
			obj1.show();
			obj2.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
