package Collections;

/* VERY GOOD EXAMPLE
 * https://howtodoinjava.com/java/collections/hashmap/how-hashmap-works-in-java/
 * https://howtodoinjava.com/java/collections/hashmap/design-good-key-for-hashmap/
 * https://howtodoinjava.com/java/basics/java-hashcode-equals-methods/
 * 
 * https://www.geeksforgeeks.org/equals-hashcode-methods-java/
 */
public class HashcodeEquallDemo {
	private int id;
	private String name;
	public HashcodeEquallDemo(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public int hashCode()
	{
		return this.id;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null || obj.getClass()!= this.getClass()) 
            return false; 
		HashcodeEquallDemo obj1 = (HashcodeEquallDemo)obj;
		if((obj1.id == this.id) && (obj1.name == this.name))
			return true;
			
		return false;
	}
	public static void main(String[] args) {
		HashcodeEquallDemo obj1 = new HashcodeEquallDemo(1,"aaa");
		HashcodeEquallDemo obj2 = new HashcodeEquallDemo(1,"aaa");
		
		if(obj1.hashCode() == obj2.hashCode())
		{
			if(obj1.equals(obj2))
				System.out.println("Objects are Equall");
			else
				System.out.println("Objects are not Equall");
		}
	}
}
