package Exceptionhandling;

public class ExceptionPropagationDemo {

	public static void main(String[] args) {
		ExceptionPropagationDemo expDemo = new ExceptionPropagationDemo();
		try {
			expDemo.method1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Normal Termination");
	}
	public void method1()
	{
		method2();
	}
	public void method2()
	{
		method3();
	}
	public void method3()
	{
		String str = null;
		System.out.println(str.length());
	}	
}
