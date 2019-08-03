package Generics;

public class GenericClassDemo<T> 
{
	private T t1;
	public T get()
	{
		return this.t1;
	}
	public void set(T t1)
	{
		this.t1 = t1;
	}
	public static void main(String[] args) {
		GenericClassDemo<String> gcd1 =  new GenericClassDemo<>();
		gcd1.set("Subhash");
		GenericClassDemo gcd2 =  new GenericClassDemo();
		gcd2.set(10);
		System.out.println(gcd1.get());
		System.out.println(gcd2.get());
	}

}
