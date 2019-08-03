package Javaconcept;

import java.util.ArrayList;

/*
  https://www.journaldev.com/129/how-to-create-immutable-class-in-java
  1. Declare the class as final so it can’t be extended.
  2. Make all fields private so that direct access is not allowed.
  3. Don’t provide setter methods for variables
  4. Make all mutable fields final so that it’s value can be assigned only once.
  5. Initialize all the fields via a constructor performing deep copy.
  6. Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 */

public final class ImmutableClass {
	private final int id;
	private final String name;
	private final ArrayList<Integer> list;
	
	public ImmutableClass(int id, String name, ArrayList<Integer> list)
	{
		this.id = id;
		this.name = name;
		ArrayList<Integer> tempList = new ArrayList<>();
		//shallo copy
		//this.list = list;
		
		//Deep copy
		for(int i=0; i<list.size();i++)
			tempList.add(list.get(i));
		this.list = tempList;
		
	}	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Integer> getList() {
		return (ArrayList<Integer>) list.clone();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		ImmutableClass obj1 = new ImmutableClass(1,"subhash",list);
		System.out.println("Values after initialization are: ");
		System.out.println("id: "+obj1.getId()+" name is: "+obj1.getName()+" list values are: "+obj1.getList());
		
		list.add(4);
		System.out.println("Values after update are: ");
		System.out.println("id: "+obj1.getId()+" name is: "+" list values are: "+obj1.getList());
	
	}
}
